package Com.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class net_test1 {

	public static void main(String[] args) throws Exception {
		InetAddress ip=InetAddress.getLocalHost();
		System.out.println("本机的IP地址是"+ip.getHostAddress());
		InetAddress ip2=InetAddress.getByName("www.hbjhart.com");
		System.out.println("江汉艺术职业学院web服务器的IP地址是"+ip.getHostAddress());
		if(ip2.isReachable(3000)) {
			System.out.println("从本机到江汉艺术职业学院web服务器的时间未超过3s");
		}else {
			System.out.println("从本机到江汉艺术职业学院web服务器的时间超过3s");
		}	
		System.out.println("江汉艺术职业学院web服务器的名字"+ip2.getHostAddress());
	}
}
