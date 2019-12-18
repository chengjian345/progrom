package Com.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		DatagramSocket ds=new DatagramSocket(30000);
		String str="来自程建的问候=-=";
		byte[] zjsz=str.getBytes("UTF-8");
		DatagramPacket dp=new  DatagramPacket(zjsz,zjsz.length,InetAddress.getByName("10.2.103.12"),8900);
		System.out.println("开始发送信息....");
		ds.send(dp);
		ds.close();
	}

}
