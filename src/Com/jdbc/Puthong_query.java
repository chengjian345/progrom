package Com.jdbc;

import java.sql.*;
import java.sql.DriverManager;

import com.mysql.jdbc.Statement;

public class Puthong_query {

	public static void main(String[] args) throws Exception {
		// TODO �Զ����ɵķ������
		Class.forName("com.mysql.jdbc.Driver");
		Connection lianjie=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc","root","123456");
		//ͨ�����Ӷ����û������
		Statement yuju=(Statement) lianjie.createStatement();
		//�������sql���
		String sql="select * from tb_user";
		//ִ����ͨ��ѯ���õ����
		ResultSet  rs=yuju.executeQuery(sql);
		System.out.println("id | name | +sex");
		//���������
		while(rs.next()) {
			int id=rs.getInt("id");
			String name=rs.getString("name");
			String sex=rs.getString("sex");
			System.out.print(id+" | "+name+" | "+sex);
		}

	}

}
