package Com.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		// TODO �Զ����ɵķ������
		DatagramSocket ds=new DatagramSocket(30000);
		String str="���Գ̽����ʺ�=-=";
		byte[] zjsz=str.getBytes("UTF-8");
		DatagramPacket dp=new  DatagramPacket(zjsz,zjsz.length,InetAddress.getByName("10.2.103.12"),8900);
		System.out.println("��ʼ������Ϣ....");
		ds.send(dp);
		ds.close();
	}

}
