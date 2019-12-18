package Com.net.chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ChartReiver implements Runnable {
	DatagramSocket ds;
	public ChartReiver(DatagramSocket ds) {
		// TODO 自动生成的构造函数存根
		this.ds=ds;
	}
	@Override
	public void run() {
		// TODO 自动生成的方法存根
				byte[] buf=new byte[1024];
				DatagramPacket dp=new DatagramPacket(buf, buf.length);
				while(true) {
				try {
				ds.receive(dp);
				String str=new String(dp.getData(),0,dp.getLength());
				System.out.println(dp.getAddress()+":"+str);
				}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
