package Com.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.mysql.jdbc.Connection;

import Com.io.Files_test;

public class Input_shili {

	public static void main(String[] args) throws Exception {
		File file=new File("d:\\tice");
		File[] wenjian_jihe=file.listFiles();
		System.out.println(wenjian_jihe.length);
		for(File file2 :wenjian_jihe) {
			System.out.println(file2);
			dwj(file2);
		} 

	}
	public static void  dwj(File wjm) throws Exception {
		FileInputStream fin=new FileInputStream("shili.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		int rows=sheet.getLastRowNum();
		for(int i=0;i<rows;i++) {
			//每一行
			XSSFRow row=sheet.getRow(i);
			XSSFCell cell=row.getCell(3);
			String xuehao=cell.getStringCellValue();
			
			//System.out.println(xuehao);
			XSSFCell cell16=row.getCell(15);
			String zuo_shili=cell16.getStringCellValue();
			//System.out.println(zuo_shili);
			XSSFCell cell17=row.getCell(16);
			String you_shili=cell17.getStringCellValue();
			//System.out.println(zuo_shili);
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection lianjie=(Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dwdw?characterEncoding=utf8","root","123456");
			//通过连接对象获得语句对象
			//Statement yuju=lianjie.createStatement();
			//定义更新sql语句
			//String sql="UPDATE sheet1 SET `左眼裸眼视力`= '"+zuo_shili+"' WHERE `学号`='"+xuehao+"'";
			//String sql1="UPDATE sheet1 SET `右眼裸眼视力`= '"+you_shili+"' WHERE `学号`='"+xuehao+"'";
			//通过语句对象执行sql
			PreparedStatement ydy_yuju = lianjie.prepareCall("UPDATE 18rj2 SET `左眼裸眼实力`=?,`右眼裸眼实力`=? WHERE `学号`=?");
			//通过语句对象执行sql
			ydy_yuju.setString(1,zuo_shili);
			ydy_yuju.setString(2,you_shili);
			ydy_yuju.setString(3,xuehao);
			ydy_yuju.executeUpdate();
		}
	}

}
