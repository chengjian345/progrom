package Com.thread;
	class MyThread1 extends Thread{

		public MyThread1(String name) {
			super(name);
			// TODO �Զ����ɵĹ��캯�����
		}
		public void run(){
			int i=0;
			while(i++<5) {
				System.out.println(MyThread1.currentThread().getName()+"��run()����������");
			}
		}
	}
	
public class Thread_test {
	
	public static void main(String[] args) {
		new MyThread1("�߳�1").start();
		new MyThread1("�߳�2").start();
	}

}
