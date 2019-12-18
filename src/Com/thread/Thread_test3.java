package Com.thread;
class Ticketwindow extends Thread{
	private int ticket=100;
	public Ticketwindow(String string) {
		// TODO 自动生成的构造函数存根
	}
	public void run() {
		while(true) {
			if(ticket>0) {
				System.out.println(Thread.currentThread().getName()+"正式发票第"+ticket+"张票");
			}
		}
	}
}
public class Thread_test3 {

	public static void main(String[] args) {
		new Ticketwindow("窗口一").start();
		new Ticketwindow("窗口二").start();
		new Ticketwindow("窗口三").start();
		new Ticketwindow("窗口四").start();
	}

}
