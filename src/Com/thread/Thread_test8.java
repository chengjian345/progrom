package Com.thread;

public class Thread_test8 {

	public static void main(String[] args) {
	Thread t1=new Thread(()->{
		for(int i = 0; i<10; i++) {
			System.out.println(Thread.currentThread().getName()+"��������i:"+i);
			}
		},"���ȼ��ϵ͵��߳�");
	Thread t2=new Thread(()->{
		for(int i = 0; i<10; i++) {
			System.out.println(Thread.currentThread().getName()+"��������j:"+i);
		}
	},"���ȼ��ϸߵ��߳�");
	Thread t3=new Thread(new Runnable() {
		
		@Override
		public void run() {
			for (int i = 0; i<10; i++) {
				System.out.println(Thread.currentThread().getName()+"��������j:"+i);
			}
		}
	},"���ȼ���ͨ���߳�");
	t1.setPriority(Thread.MAX_PRIORITY);
	t2.setPriority(10);
	t3.setPriority(10);
	t1.start();
	t2.start();
	t3.start();
	}
}