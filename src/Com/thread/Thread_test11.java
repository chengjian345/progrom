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
		// TODO �Զ����ɵķ������
				try {
					Thread.sleep(100);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			System.out.println(Thread.currentThread().getName()+"�����۳�"+ticket--+"��Ʊ");
			}
		}
	
}
public class Thread_test11 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		TicketWindow2 t2=new TicketWindow2();
		new Thread(t2,"����1").start();
		new Thread(t2,"����2").start();
		new Thread(t2,"����3").start();
		new Thread(t2,"����4").start();
		
	}

}
