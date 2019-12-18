package Com.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiver {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		DatagramSocket ds=new DatagramSocket(8900);
		byte[] buf=new byte[1024];
		DatagramPacket dp=new DatagramPacket(buf,buf.length);
		System.out.println("等待接受信息....");
		while(true) {
			ds.receive(dp);
			String xinxi=new String(dp.getData(),0,dp.getLength());
			System.out.println(dp.getAddress().getHostAddress()+":"+xinxi);
		}
	}

}
