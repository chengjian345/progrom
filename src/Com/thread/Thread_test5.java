package Com.thread;
class TicketWindow2 implements Runnable{
	private int ticket=100;
	public void run() {
		while(true) {
			if(ticket>0) {
				System.out.println(Thread.currentThread().getName()+"�����۳�"+ticket--+"��Ʊ");
			}else {
				break;
				}
		}
	}
	
}
public class Thread_test5 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		TicketWindow2 t2=new TicketWindow2();
		new Thread(t2,"����1").start();
		new Thread(t2,"����2").start();
		new Thread(t2,"����3").start();
		new Thread(t2,"����4").start();
		
	}

}
