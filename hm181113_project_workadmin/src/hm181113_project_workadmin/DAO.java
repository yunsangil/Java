package hm181113_project_workadmin;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

//import DB.DTO;

public class DAO {

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/hm181113";
	private static final String USER = "root";
	private static final String PWD = "apmsetup";

	int ampm, year, month, date, hour, minute, second;
	FileOutputStream fo = null;
	String logfile = "log.txt";
	GregorianCalendar today = null;
	Connection conn = null; // db 연결
	Statement stmt = null; // sql 쿼리문을 수행하는 객체
	String sql_update;
	String sql;
	PreparedStatement pstmt = null;
	ResultSet resultSet = null; // 결과를 저장
	ResultSetMetaData rsmd = null; // 저장된 결과의 메타데이터
	ArrayList<DTO> before_dto, after_dto = null;
	ArrayList<DTO2> before_dto2, after_dto2 = null;
	String you_want = null;
	boolean is_Same = false;
	Scanner in = new Scanner(System.in);

	DAO() {
		try {
			Class.forName(DRIVER);
			System.out.println("db연결 성공");
		} catch (Exception e) {
			System.out.println("db연결 실패");
		}
	}

	void insert(DTO d) {
		try {
			conn = DriverManager.getConnection(URL, USER, PWD);

			sql = "insert work values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, d.getW_name());
			pstmt.setString(2, d.getStart_date());
			pstmt.setString(3, d.getEnd_date());
			if (d.getStatement() == null) {
				d.setStatement("NOT YET");
			}
			pstmt.setString(4, d.getStatement());
			pstmt.executeUpdate();
			System.out.println("삽입 완료");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {

			}
		}
	}

	void insert_progress(DTO2 d) {
		try {
			conn = DriverManager.getConnection(URL, USER, PWD);

			pstmt = conn.prepareStatement("set @count=0");
			pstmt.executeUpdate();
			pstmt = conn.prepareStatement("update work_progress set progress_number=@count:=@count+1");
			pstmt.executeUpdate();
			sql = "insert work_progress values(default,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, d.getW_name());
			if(d.getProgress_data()==null)
			{
				System.out.println("업무진행 메모는 공란을 입력하실 수 없습니다!");
				return;
			}
			
			pstmt.setString(2, d.getProgress_data());
			pstmt.executeUpdate();
			System.out.println("삽입 완료");
		} catch (Exception e) {
			System.out.println("해당 업무가 존재하지 않습니다.");
			System.out.println("/view 명령어로 업무명을 확인해주세요");
		}
		finally {
			try {
				if (pstmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {

			}
		}
	}

	void delete(String input) {
		try {
			conn = DriverManager.getConnection(URL, USER, PWD);
			String sql_delete_id = "delete from work where w_name=?";
			pstmt = conn.prepareStatement(sql_delete_id);

			pstmt.setString(1, input);
			pstmt.executeUpdate();
			System.out.println("정상적으로 반영되었습니다.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {

			}
		}
	}

	public ArrayList<DTO> worklist() {
		ArrayList<DTO> dtos = new ArrayList<>();

		try {
			conn = DriverManager.getConnection(URL, USER, PWD);
			String sql = "select * from work";
			pstmt = conn.prepareStatement(sql);
			resultSet = pstmt.executeQuery();
			rsmd = resultSet.getMetaData();
//			System.out.println(rsmd.t+"reads");

			while (resultSet.next()) {
				String w_name = resultSet.getString("w_name");
				String start_date = resultSet.getString("start_date");
				String end_date = resultSet.getString("end_date");
				String statement = resultSet.getString("statement");
				DTO d = new DTO(w_name, start_date, end_date, statement);
				dtos.add(d);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dtos;
	}

	public ArrayList<DTO2> progresslist(String work_name) {
		ArrayList<DTO2> dtos = new ArrayList<>();

		try {
			conn = DriverManager.getConnection(URL, USER, PWD);
			String sql = "select * from work_progress where w_name=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, work_name);
			resultSet = pstmt.executeQuery();
			rsmd = resultSet.getMetaData();
//			System.out.println(rsmd.t+"reads");

			while (resultSet.next()) {
				int index = resultSet.getInt("progress_number");
				String w_name = resultSet.getString("w_name");
				String progress_content = resultSet.getString("progress_content");
				DTO2 d = new DTO2(index, w_name, progress_content);
				dtos.add(d);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dtos;
	}

	void update(String table_name, String work_name, String column_name, String value) {

		String check_progress=" ";
		try {
			int countsame = 0;
			is_Same = false;
			if (table_name.equals("work")) {
				before_dto = worklist();
				you_want = "dto";
				sql_update = "update " + table_name + " set " + column_name + "=? where w_name=?";
			} else if (table_name.equals("work_progress")) {
				before_dto2 = progresslist(work_name);
				you_want = "dto2";
				sql_update = "update " + table_name + " set " + column_name + "=? where progress_number=?";
			}
			conn = DriverManager.getConnection(URL, USER, PWD);
			;
			pstmt = conn.prepareStatement(sql_update);
			pstmt.setString(1, value);
			pstmt.setString(2, work_name);
			pstmt.executeUpdate();
			if (you_want.equals("dto")) {
				after_dto = worklist();
				for (int i = 0; i < before_dto.size(); i++) {
					if (column_name.equals("w_name")) {
						if (before_dto.get(i).getW_name().equals(after_dto.get(i).getW_name())) {
							countsame++;
						}
					} else if (column_name.equals("start_date")) {
						if (before_dto.get(i).getStart_date().equals(after_dto.get(i).getStart_date())) {
							countsame++;
						}
					} else if (column_name.equals("end_date")) {
						if (before_dto.get(i).getEnd_date().equals(after_dto.get(i).getEnd_date())) {
							countsame++;
						}
					} else if (column_name.equals("statement")) {
						if (before_dto.get(i).getStatement().equals(after_dto.get(i).getStatement())) {
							countsame++;
						}
					}
					if (countsame == before_dto.size()) {
						is_Same = true;
					}
				}
			} else if (you_want.equals("dto2")) {
				after_dto2 = progresslist(work_name);
				check_progress = "업무메모";
				for (int i = 0; i < before_dto2.size(); i++) {
					if (column_name.equals("w_name")) {
						if (before_dto2.get(i).getW_name().equals(after_dto2.get(i).getW_name())) {
							countsame++;
						}

					} else if (column_name.equals("progress_content")) {

						if (before_dto2.get(i).getProgress_data().equals(after_dto2.get(i).getProgress_data())) {
							countsame++;
						}
					}
					if (countsame == before_dto2.size()) {
						is_Same = true;
					}
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (is_Same == false) {
			System.out.println("정상적으로 반영되었습니다.");
			today = new GregorianCalendar();
			ampm = (today.get(today.AM_PM));
			year = (today.get(today.YEAR) - 2000);
			month = (today.get(today.MONTH) + 1);
			date = (today.get(today.DATE));
			hour = (today.get(today.HOUR_OF_DAY));
			minute = (today.get(today.MINUTE));
			second = (today.get(today.SECOND));

			try {
				fo = new FileOutputStream(logfile, true);
				String input_contents = year + "년 " + month + "월 " + date + "일 " + hour + "시 " + minute + "분 " + second
						+ "초  " + "업무명 " + work_name + "의 " + check_progress + column_name + "이/가 " + value + "로 수정됨";
				input_contents += "\r\n";
				fo.write(input_contents.getBytes());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("존재하지 않는 값을 수정하려 했기 때문에 정상 반영되지 않았습니다. ");
			return;
		}
	}

	void update_statement_done(String work_name) {

		try {
			conn = DriverManager.getConnection(URL, USER, PWD);
			String sql_done = "update work set statement='DONE' where w_name=?";
			pstmt = conn.prepareStatement(sql_done);
			pstmt.setString(1, work_name);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
