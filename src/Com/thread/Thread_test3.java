package Com.thread;
class Ticketwindow extends Thread{
	private int ticket=100;
	public Ticketwindow(String string) {
		// TODO �Զ����ɵĹ��캯�����
	}
	public void run() {
		while(true) {
			if(ticket>0) {
				System.out.println(Thread.currentThread().getName()+"��ʽ��Ʊ��"+ticket+"��Ʊ");
			}
		}
	}
}
public class Thread_test3 {

	public static void main(String[] args) {
		new Ticketwindow("����һ").start();
		new Ticketwindow("���ڶ�").start();
		new Ticketwindow("������").start();
		new Ticketwindow("������").start();
	}

}
