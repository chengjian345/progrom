package Com.ssq;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class ssq {

	public static void main(String[] args) throws Exception {
		// TODO �Զ����ɵķ������
		System.out.println("�������������");
		Thread.sleep(10000);
		Random r=new Random();
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<10000;i++){
			int hq=r.nextInt(33)+1;
		}
	}

}
