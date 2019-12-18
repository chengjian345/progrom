package Com.jdbc;

import java.sql.Connection;
import java.sql.*;

public class Gengxin {

	public static void main(String[] args) throws Exception  {
		Class.forName("com.mysql.jdbc.Driver");
		Connection lianjie=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc","root","123456");
		//通过连接对象获得语句对象
		Statement yuju=lianjie.createStatement();
		//定义更新sql语句
		String sql="UPDATE tb_user SET email = 'jack@qq.com' WHERE id = 1";
		//通过语句对象执行sql
		yuju.execute(sql);
	}

}
