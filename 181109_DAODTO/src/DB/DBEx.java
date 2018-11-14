package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class DBEx {

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/hm1109";
	private static final String USER = "root";
	private static final String PWD = "apmsetup";

	Connection conn = null; // db ����
	Statement stmt = null; // sql �������� �����ϴ� ��ü
	PreparedStatement pstmt = null;
	ResultSet resultSet = null; // ����� ����
	ResultSetMetaData rsmd = null; // ����� ����� ��Ÿ������
	Scanner in = new Scanner(System.in);

	DBEx() {
		try {
			Class.forName(DRIVER);
			System.out.println("db���� ����");
		} catch (Exception e) {
			System.out.println("db���� ����");
		}
	}

	public void insert()
//			throws Exception
	{
		try {
			conn = DriverManager.getConnection(URL, USER, PWD);
			stmt = conn.createStatement();
			String sql = "insert member values('b','bbb')";
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
//			 TODO Auto-generated catch block
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
	void delete() throws Exception {

		conn = DriverManager.getConnection(URL, USER, PWD);
		String sql_delete_id = "delete from member where id=?";
		pstmt = conn.prepareStatement(sql_delete_id);
		System.out.println("������ id�� �Է����ּ���.");
		String input_delete = in.nextLine();

		pstmt.setString(1, input_delete);
		pstmt.executeUpdate();
		System.out.println("���������� �ݿ��Ǿ����ϴ�.");
		
	}
	void update() {
		try {
		String input_id,update_value;
		conn = DriverManager.getConnection(URL, USER, PWD);
		String sql_update_id = "update member set id=? where id=?";
		String sql_update_name = "update member set name=? where id=?";
		System.out.println("������ id�� �Է����ּ���.");
		input_id = in.nextLine();
		
		System.out.println("� �� ���� �Ͻðڽ��ϱ�?");
		System.out.println("1. id / 2. name");
		int select = in.nextInt();
		in.nextLine();
		
		if(select ==1)
		{
			System.out.println("ID�� �����մϴ�.");
			pstmt = conn.prepareStatement(sql_update_id);

		}
		else if(select ==2)
		{
			System.out.println("name�� �����մϴ�.");
			pstmt = conn.prepareStatement(sql_update_name);
		}			
		System.out.println("���� ��ų ���� �Է����ּ���.");
		update_value = in.nextLine();
		pstmt.setString(2, input_id);
		pstmt.setString(1, update_value);
		pstmt.executeUpdate();
		System.out.println("���������� �ݿ��Ǿ����ϴ�.");
		}
		catch(Exception e) {
			
		}
	}
	public ArrayList<DTO> list(){
		ArrayList<DTO> dtos = new ArrayList<>();

		try {
			conn = DriverManager.getConnection(URL, USER, PWD);
			String sql = "select * from member";
			pstmt = conn.prepareStatement(sql);
			resultSet = pstmt.executeQuery();
			rsmd = resultSet.getMetaData();
//			System.out.println(rsmd.t+"reads");
			
			while(resultSet.next()) {
				String id = resultSet.getString("id");
				String name = resultSet.getString("name");
				DTO d = new DTO(id,name);
				dtos.add(d);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dtos;
	}

	public void insert(DTO d)
//	throws Exception
	{
		try {
			conn = DriverManager.getConnection(URL, USER, PWD);
//	stmt=conn.createStatement();
//	String sql = "insert member values('"+d.getId()+"','"+d.getName()+"')";
			String sql = "insert member values(?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, d.getId());
			pstmt.setString(2, d.getName());
			pstmt.executeUpdate();
//	stmt.executeUpdate(sql);
		} catch (SQLException e) {
//	 TODO Auto-generated catch block
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
}
