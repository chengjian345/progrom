package Com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
class  MyThread6 implements Callable<Object>{

	@Override
	public Object call() throws Exception {
		// TODO �Զ����ɵķ������
		int i= 0;
		while (i++<5) {
			System.out.println(Thread.currentThread().getName()+"��call()����������");
		}
		return i;
	}
	
}
public class Thread_test14 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO �Զ����ɵķ������
		MyThread6 my6=new MyThread6();
		ExecutorService pool=Executors.newCachedThreadPool();
		Future<Object> result1=pool.submit(my6);
		Future<Object> result2=pool.submit(my6);
		Future<Object> result3=pool.submit(my6);
		pool.shutdown();
		System.out.println("thread-1���ؽ��"+result1.get());
		System.out.println("thread-2���ؽ��"+result2.get());
	}

}
