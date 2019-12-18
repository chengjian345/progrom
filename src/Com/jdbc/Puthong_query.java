package Com.jdbc;

import java.sql.*;
import java.sql.DriverManager;

import com.mysql.jdbc.Statement;

public class Puthong_query {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		Class.forName("com.mysql.jdbc.Driver");
		Connection lianjie=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc","root","123456");
		//通过连接对象获得话句对象
		Statement yuju=(Statement) lianjie.createStatement();
		//定义更新sql语句
		String sql="select * from tb_user";
		//执行普通查询，得到结果
		ResultSet  rs=yuju.executeQuery(sql);
		System.out.println("id | name | +sex");
		//遍历结果集
		while(rs.next()) {
			int id=rs.getInt("id");
			String name=rs.getString("name");
			String sex=rs.getString("sex");
			System.out.print(id+" | "+name+" | "+sex);
		}

	}

}
