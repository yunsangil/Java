package oraTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MDAO {
	/*
	 * Database에 접속하고 해당하는 쿼리문을 전송하는 클래스
	 * 
	 */
	private Connection conn;
	private Statement stmt;
	private PreparedStatement psmt;
	private ResultSet st;
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:system";
	private static final String user = "aaa";
	private static final String pwd = "1111";

	MDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// com.mysql.jdbc.Driver
			System.out.println("클래스 로드 성공");
//			Robot r = new Robot();
//			r.keyPress(KeyEvent.VK_FINAL);
//			r.keyPress(KeyEvent.VK_G);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("클래스 로드 실패");
		}
//		catch (AWTException e) {
//			 TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	public void insert(ArrayList<MDTO> mdto) {
		/*
		 * Table에 저장 DB연결 >> 쿼리문 전송 >> Db연결 종료
		 */

//		insert into member values(mdto.getId(),mdto.getName(),mdto.getTel(),mdto.getAddr())
//		connect();
		if (connect()) {
			try {
				for(int i=0;i<10;i++)
				{
				String sql = "insert into member values(?,?,?,?)";
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, mdto.get(i).getId());
				psmt.setString(2, mdto.get(i).getName());
				psmt.setString(3, mdto.get(i).getTel());
				psmt.setString(4, mdto.get(i).getAddr());

				psmt.executeUpdate();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					if (psmt != null)
						psmt.close();
					if (conn != null)
						conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}

	public ArrayList<MDTO> getList() {
		ArrayList<MDTO> list = new ArrayList<>();
		String sql = "select * from member";
		if (connect()) {
			try {
				stmt = conn.createStatement();
				if (stmt != null) {
					st = stmt.executeQuery(sql);
					while (st.next()) {
						MDTO m = new MDTO();
						m.setId(st.getString("id"));
						m.setName(st.getString("name"));
						m.setTel(st.getString("tel"));
						m.setAddr(st.getString("addr"));

						list.add(m);

					}
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block

			} finally {
				try {
					if (stmt != null)
						stmt.close();
					if (conn != null)
						conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return list;
	}

	public boolean connect() {
		try {
			conn = DriverManager.getConnection(URL, user, pwd);
			System.out.println("연결 성공");
			return true;
		} catch (Exception e) {
			System.out.println("연결실패");
			return false;
		}
	}

	public void delete() {
		String sql = "delete from member ";
		if (connect()) {
			try {
				stmt = conn.createStatement();
				stmt.executeQuery(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void update(MDTO m) {
		String sql = "update member set name=?, addr=?, tel=? where id=?";
		if (connect()) {
			try {
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, m.getName());
				psmt.setString(2, m.getAddr());
				psmt.setString(3, m.getTel());
				psmt.setString(4, m.getId());
				psmt.executeUpdate();
			} catch (Exception e) {

			}
		}
	}
}
