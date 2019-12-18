package Com.thread;
	class MyThread1 extends Thread{

		public MyThread1(String name) {
			super(name);
			// TODO 自动生成的构造函数存根
		}
		public void run(){
			int i=0;
			while(i++<5) {
				System.out.println(MyThread1.currentThread().getName()+"的run()方法在运行");
			}
		}
	}
	
public class Thread_test {
	
	public static void main(String[] args) {
		new MyThread1("线程1").start();
		new MyThread1("线程2").start();
	}

}
