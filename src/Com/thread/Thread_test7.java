package Com.thread;
class DaemonThread implements Runnable{
	public void run() {
	while(true) {
		System.out.println(Thread.currentThread().getName()+"的run()方法正在运行");
		
	}
}
}
public class Thread_test7 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		if(!Thread.currentThread().isDaemon()) {
			System.out.println("main方法线程");
		}
		Thread t=new Thread(new DaemonThread(),"后台线程");
		if(!t.isDaemon()) {
			System.out.println("t线程不是后台线程");
		}
		t.setDaemon(true);
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}

}
