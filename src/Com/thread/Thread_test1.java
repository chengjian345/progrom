package Com.thread;
class MyThread2 implements Runnable{
	public void run(){
		int i=0;
		while(i++<5) {
			System.out.println(MyThread1.currentThread().getName()+"��run()����������");
		}
	}
}
public class Thread_test1 {

	public static void main(String[] args) {
		MyThread2 t1=new MyThread2();
		new Thread(t1,"�߳�1").start();
		MyThread2 t2=new MyThread2();
		new Thread(t1,"�߳�2").start();
		MyThread2 t3=new MyThread2();
		new Thread(t1,"�߳�3").start();

	}

}
