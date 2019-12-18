package Com.io;


import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Files_test {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Path lujing=Paths.get("D:\\360Downloads3333\\444");
		Files.createDirectories(lujing);
		Path wj=Paths.get("D:\\360Downloads3333\\444\\test.txt");
		//Files.createFile(wj);
		List<String> neirong=new ArrayList<>();
		neirong.add("这是一个测试文件");
		Files.write(wj, neirong,StandardOpenOption.APPEND);
	}

}