package Com.thread;
class DaemonThread implements Runnable{
	public void run() {
	while(true) {
		System.out.println(Thread.currentThread().getName()+"��run()������������");
		
	}
}
}
public class Thread_test7 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		if(!Thread.currentThread().isDaemon()) {
			System.out.println("main�����߳�");
		}
		Thread t=new Thread(new DaemonThread(),"��̨�߳�");
		if(!t.isDaemon()) {
			System.out.println("t�̲߳��Ǻ�̨�߳�");
		}
		t.setDaemon(true);
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}

}
