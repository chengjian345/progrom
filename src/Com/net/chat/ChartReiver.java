package Com.net.chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ChartReiver implements Runnable {
	DatagramSocket ds;
	public ChartReiver(DatagramSocket ds) {
		// TODO �Զ����ɵĹ��캯�����
		this.ds=ds;
	}
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
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
