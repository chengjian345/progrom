package Com.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Thread_test15 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO �Զ����ɵķ������
		CompletableFuture<Integer> cf1=CompletableFuture.supplyAsync(()->{
			int sum=0;
			for(int i=1;i<11;i++) {
				sum+=i;
				System.out.println(Thread.currentThread().getName()+"�߳�����ִ�м�i:"+i);
			}
			return sum;
		});
		
		CompletableFuture<Integer> cf2=CompletableFuture.supplyAsync(()->{
			int sum=0;
			for(int j=11;j<21;j++) {
				sum+=j;
				System.out.println(Thread.currentThread().getName()+"�߳�����ִ�м�i:"+j);
			}
			return sum;
		});
		int total=cf1.get()+cf2.get();
		System.out.println("�����߳��ܺͽ����:"+total);
	}

}
