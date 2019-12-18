package Com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class Mythread3 implements Callable<Object>{
	public Object call(){
		int i=0;
		while(i++<5) {
			System.out.println(MyThread1.currentThread().getName()+"的run()方法在运行");
		}
		return i;
	}
}
public class Thread_test2 {

	public static void main(String[] args) {
		Mythread3 myt1=new Mythread3();
		FutureTask<Object>ft1=new FutureTask<>(myt1);
		Thread thread1=new Thread(ft1,"线程1");
		thread1.start();
		FutureTask<Object>ft2=new FutureTask<>(new Mythread3());
		Thread thread2=new Thread(ft2,"线程2");
		thread1.start();
		FutureTask<Object>ft3=new FutureTask<>(new Mythread3());
		Thread thread3=new Thread(ft3,"线程3");
		thread1.start();
	}

}
