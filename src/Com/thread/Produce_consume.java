package Com.thread;

import java.util.ArrayList;
import java.util.List;

public class Produce_consume {

	public static void main(String[] args) {
		List<Object> goods=new ArrayList<>();
		long start=System.currentTimeMillis();
		Thread thread1 =new Thread(()->{
			int num=0;
			while(System.currentTimeMillis()-start<=100) {
				synchronized (goods) {
					if (goods.size()>0) {
						try {
							goods.wait();
						} catch (InterruptedException e) {
							// TODO �Զ����ɵ� catch ��
							e.printStackTrace();
						}
						
					}else {
						goods.remove("��Ʒ"+(++num));
						System.out.println("������Ʒ"+num);
					}
				}
			}
		},"������");
		Thread thread2 =new Thread(()->{
			int num=0;
			while(System.currentTimeMillis()-start<=100) {
				synchronized (goods) {
					if (goods.size()<=0) {
						goods.notify();
					}else {
						goods.remove("��Ʒ"+(++num));
						System.out.println("������Ʒ"+num);
					}
				}
			}
		},"������");
		thread1.start();
		thread2.start();
	}

}
