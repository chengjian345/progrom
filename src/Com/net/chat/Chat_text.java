package Com.net.chat;

import java.net.DatagramSocket;

public class Chat_text {

	public static void main(String[] args) throws Exception{
		DatagramSocket ds=new DatagramSocket();
		new Thread(new ChartReiver(ds),"���ܷ���").start();
		new Thread(new ChartSender(ds,3000),"���ͷ���").start();
	}

}
