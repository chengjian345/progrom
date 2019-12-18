package Com.thread;

class TicketWindow3 implements Runnable{
	private int ticket=100;
	private Object Lock;
	public void run() {
		while(true) {
			maipiao();
			}
		}
	private synchronized void maipiao() {
			if (ticket>0) {
		// TODO 自动生成的方法存根
				try {
					Thread.sleep(100);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			System.out.println(Thread.currentThread().getName()+"正在售出"+ticket--+"张票");
			}
		}
	
}
public class Thread_test11 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TicketWindow2 t2=new TicketWindow2();
		new Thread(t2,"窗口1").start();
		new Thread(t2,"窗口2").start();
		new Thread(t2,"窗口3").start();
		new Thread(t2,"窗口4").start();
		
	}

}
