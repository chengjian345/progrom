package Com.net.chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ChartSender implements Runnable {
	private DatagramSocket ds;
	private int i;
	public ChartSender(DatagramSocket ds, int i) {
		// TODO 自动生成的构造函数存根
		this.ds=ds;
		this.i=i;
	}
	@Override
	public void run() {
		Scanner sc=new Scanner(System.in);
		while(true) {
		try {
			System.out.println("我说:");
			String str=sc.nextLine();
			byte[] zjsz;
			zjsz=str.getBytes("UTF-8");
			System.out.println("这条信息发给那个IP:");;
			String ip =sc.nextLine();
			DatagramPacket dp=new  DatagramPacket(zjsz,zjsz.length,InetAddress.getByName("10.2.103.35"),8900);
			ds.send(dp);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			}
		}
	}
}
