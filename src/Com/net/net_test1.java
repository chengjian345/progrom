package Com.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class net_test1 {

	public static void main(String[] args) throws Exception {
		InetAddress ip=InetAddress.getLocalHost();
		System.out.println("������IP��ַ��"+ip.getHostAddress());
		InetAddress ip2=InetAddress.getByName("www.hbjhart.com");
		System.out.println("��������ְҵѧԺweb��������IP��ַ��"+ip.getHostAddress());
		if(ip2.isReachable(3000)) {
			System.out.println("�ӱ�������������ְҵѧԺweb��������ʱ��δ����3s");
		}else {
			System.out.println("�ӱ�������������ְҵѧԺweb��������ʱ�䳬��3s");
		}	
		System.out.println("��������ְҵѧԺweb������������"+ip2.getHostAddress());
	}
}
