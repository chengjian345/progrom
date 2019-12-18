package Com.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.mysql.jdbc.Connection;

public class Shuju_shuru {
	static Connection  lianjie=null;
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		 lianjie=(Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc?characterEncoding=utf8","root","123456");
		// TODO �Զ����ɵķ������
		File mulu=new File("d:\\tice1");
		File[] files=mulu.listFiles();
		System.out.println("һ����"+files.length+"���ļ�");
		for(File file : files) {
			System.out.println(file);
			if(file.getName().endsWith("xlsx")) {
				read_xlsx_and_write_to_db(file);
			}else if(file.getName().endsWith("xls")) {
				read_xls_and_write_to_db(file);
			}
			
		}
	}

	private static void read_xlsx_and_write_to_db(File file) throws Exception {
		FileInputStream fin=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		XSSFSheet sheet=workbook.getSheet("sheet2");
		int rows=sheet.getLastRowNum();
		for(int i=0;i<rows;i++) {
			//ÿһ��
			XSSFRow row=sheet.getRow(i);
			XSSFCell cell=row.getCell(3);
			String xuehao=cell.getStringCellValue();
			
			//System.out.println(xuehao);
			XSSFCell cell20=row.getCell(19);
			XSSFCell cell21=row.getCell(20);
			if(cell20!=null&&cell21!=null){
			String zuo_shili=cell20.getStringCellValue();
			//System.out.println(zuo_shili);
			String you_shili=cell21.getStringCellValue();
			//System.out.println(zuo_shili);
			
			
			//ͨ�����Ӷ�����������
			//Statement yuju=lianjie.createStatement();
			//�������sql���
			//String sql="UPDATE sheet1 SET `������������`= '"+zuo_shili+"' WHERE `ѧ��`='"+xuehao+"'";
			//String sql1="UPDATE sheet1 SET `������������`= '"+you_shili+"' WHERE `ѧ��`='"+xuehao+"'";
			//ͨ��������ִ��sql
			PreparedStatement ydy_yuju = lianjie.prepareCall("UPDATE sheet1 SET `������������`=?,`������������`=? WHERE `ѧ��`=?");
			//ͨ��������ִ��sql
			ydy_yuju.setString(1,zuo_shili);
			ydy_yuju.setString(2,you_shili);
			ydy_yuju.setString(3,xuehao);
			ydy_yuju.executeUpdate();
			}
	}

}
	private static void read_xls_and_write_to_db(File file) throws Exception {
		FileInputStream fin=new FileInputStream(file);
		HSSFWorkbook workbook=new HSSFWorkbook(fin);
		HSSFSheet sheet=workbook.getSheet("sheet2");
		int rows=sheet.getLastRowNum();
		for(int i=0;i<rows;i++) {
			//ÿһ��
			HSSFRow row=sheet.getRow(i);
			HSSFCell cell=row.getCell(3);
			String xuehao=cell.getStringCellValue();
			
			//System.out.println(xuehao);
			HSSFCell cell20=row.getCell(19);
			HSSFCell cell21=row.getCell(20);
			if(cell20!=null&&cell21!=null) {
			String zuo_shili=cell20.getStringCellValue();
			//System.out.println(zuo_shili);
			
			String you_shili=cell21.getStringCellValue();
			//System.out.println(zuo_shili);
			
		
			//ͨ�����Ӷ�����������
			//Statement yuju=lianjie.createStatement();
			//�������sql���
			//String sql="UPDATE sheet1 SET `������������`= '"+zuo_shili+"' WHERE `ѧ��`='"+xuehao+"'";
			//String sql1="UPDATE sheet1 SET `������������`= '"+you_shili+"' WHERE `ѧ��`='"+xuehao+"'";
			//ͨ��������ִ��sql
			PreparedStatement ydy_yuju = lianjie.prepareCall("UPDATE sheet1 SET `������������`=?,`������������`=? WHERE `ѧ��`=?");
			//ͨ��������ִ��sql
			ydy_yuju.setString(1,zuo_shili);
			ydy_yuju.setString(2,you_shili);
			ydy_yuju.setString(3,xuehao);
			ydy_yuju.executeUpdate();
			}
	}

}
}