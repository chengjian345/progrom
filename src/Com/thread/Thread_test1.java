package Com.thread;
class MyThread2 implements Runnable{
	public void run(){
		int i=0;
		while(i++<5) {
			System.out.println(MyThread1.currentThread().getName()+"的run()方法在运行");
		}
	}
}
public class Thread_test1 {

	public static void main(String[] args) {
		MyThread2 t1=new MyThread2();
		new Thread(t1,"线程1").start();
		MyThread2 t2=new MyThread2();
		new Thread(t1,"线程2").start();
		MyThread2 t3=new MyThread2();
		new Thread(t1,"线程3").start();

	}

}
