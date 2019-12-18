package Com.thread;
class TicketWindow2 implements Runnable{
	private int ticket=100;
	public void run() {
		while(true) {
			if(ticket>0) {
				System.out.println(Thread.currentThread().getName()+"正在售出"+ticket--+"张票");
			}else {
				break;
				}
		}
	}
	
}
public class Thread_test5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TicketWindow2 t2=new TicketWindow2();
		new Thread(t2,"窗口1").start();
		new Thread(t2,"窗口2").start();
		new Thread(t2,"窗口3").start();
		new Thread(t2,"窗口4").start();
		
	}

}
