package Com.thread;

import javax.xml.stream.events.StartDocument;

class DeadlockThread implements Runnable{
	static Object chopsticks=new Object();
	static Object knifeAndFark=new Object();
	private boolean flag;
	
	public DeadlockThread(boolean flag) {
		suger();
		this.flag=flag;
	}
	private void suger() {
		// TODO 自动生成的方法存根
		
	}
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		if (flag) {
			while(true) {
				synchronized (chopsticks) {
					System.out.println(Thread.currentThread().getName()+"---if---chopsticks");
				}
				synchronized (knifeAndFark) {
					System.out.println(Thread.currentThread().getName()+"---if---knifeAndFark");
				}
			}
		}else {
			while(true) {
				synchronized (knifeAndFark) {
					System.out.println(Thread.currentThread().getName()+"---if---knifeAndFark");
				}
				synchronized (chopsticks) {
					System.out.println(Thread.currentThread().getName()+"---if---chopsticks");
				}
			}
		}
	}
	
}
public class Thread_test13 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
			DeadlockThread thread1=new DeadlockThread(true);
			DeadlockThread thread2=new DeadlockThread(false);
	}

}
