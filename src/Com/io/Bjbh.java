package Com.io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Bjbh {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Path wj=Paths.get("D:\\444\\��༶���.txt");
		Path bjmc=Paths.get("D:\\444\\�༶��Ϣ.txt");
		Path bjbh=Paths.get("D:\\444\\�༶���.txt");
		List<String> lines=Files.readAllLines(wj);
		Files.createFile(bjbh);
		List<String> names=Files.readAllLines(bjmc);
		List<String> neirong=new ArrayList<>();
		System.out.println("�ļ�������Ϊ"+lines);
		System.out.println("�ļ��Ĵ�СΪ"+Files.size(wj)+"���ֽ�");
	/*	for (String line : lines) {
			String[]  zfcsz=line.split("	");
			System.out.println("�༶���:"+zfcsz[0]);
			System.out.println("�༶����:"+zfcsz[1]);
		}*/
		
		for(String name : names) {
			for(String line:lines) {
				String[] zfcsz=line.split("\t");
				if(name.equals(zfcsz[0])) {
					System.out.println(zfcsz[0]);
					neirong.add(zfcsz[0]);
				}
			}	
		}
		Files.write(bjbh,neirong,StandardOpenOption.APPEND);
		//System.out.println(neirong);
	}

}
