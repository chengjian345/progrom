package Com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

class MyThread implements Callable<Object>{

	@Override
	public Object call() throws Exception {
		int sum=0;
			for(int i1=1; i1<11; i1++){
				sum+=i1;
			}
			switch (Thread.currentThread().getName()) {
			case "�߳�1":
				
				break;
			case "�߳�2":
				sum+=100;
				break;
			case "�߳�3":
				sum+=200;
				break;
			case "�߳�4":
				sum+=300;
				break;
			case "�߳�5":
				sum+=400;
				break;
				
			case "�߳�6":
				sum+=500;
				break;
			case "�߳�7":
				sum+=600;
				break;
			case "�߳�8":
				sum+=700;
				break;
			case "�߳�9":
				sum+=800;
				break;
			case "�߳�10":
				sum+=900;
				break;	
			default:
				break;
			}
			return sum;
		}
}
public class Thread_test6 {

	public static void main(String[] args) throws Exception, ExecutionException {
		MyThread mt1=new MyThread();
		FutureTask<Object> ft1=new FutureTask<>(mt1);
		Thread t1=new Thread(ft1,"�߳�1");
		t1.start();
		System.out.println("1��10�Ľ����"+ft1.get());
		
		MyThread mt2=new MyThread();
		FutureTask<Object> ft2=new FutureTask<>(mt2);
		Thread t2=new Thread(ft2,"�߳�2");
		t2.start();
		MyThread mt3=new MyThread();
		FutureTask<Object> ft3=new FutureTask<>(mt3);
		Thread t3=new Thread(ft3,"�߳�3");
		t3.start();
		MyThread mt4=new MyThread();
		FutureTask<Object> ft4=new FutureTask<>(mt4);
		Thread t4=new Thread(ft4,"�߳�4");
		t4.start();
		MyThread mt5=new MyThread();
		FutureTask<Object> ft5=new FutureTask<>(mt5);
		Thread t5=new Thread(ft5,"�߳�5");
		t5.start();
		MyThread mt6=new MyThread();
		FutureTask<Object> ft6=new FutureTask<>(mt6);
		Thread t6=new Thread(ft6,"�߳�6");
		t6.start();
		MyThread mt7=new MyThread();
		FutureTask<Object> ft7=new FutureTask<>(mt7);
		Thread t7=new Thread(ft2,"�߳�7");
		t7.start();
		MyThread mt8=new MyThread();
		FutureTask<Object> ft8=new FutureTask<>(mt8);
		Thread t8=new Thread(ft8,"�߳�8");
		t8.start();
		MyThread mt9=new MyThread();
		FutureTask<Object> ft9=new FutureTask<>(mt9);
		Thread t9=new Thread(ft9,"�߳�9");
		t9.start();
		MyThread mt10=new MyThread();
		FutureTask<Object> ft10=new FutureTask<>(mt10);
		Thread t10=new Thread(ft10,"�߳�10");
		t10.start();
		System.out.println("10��20�Ľ����"+ft2.get());
		int total=(int)ft1.get()+(int)ft2.get()+(int)ft3.get()+(int)ft4.get()+(int)ft5.get()+(int)ft6.get()+(int)ft7.get()+(int)ft8.get()+(int)ft9.get()+(int)ft10.get();
		System.out.println("1-10�ĺ�"+total);
	}

}
