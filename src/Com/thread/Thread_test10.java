package Com.thread;
class EmergencyThread implements Runnable{

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		for (int j = 1; j < 6; j++) {
			System.out.println(Thread.currentThread().getName()+"����"+j);
		}
		
	}
}
public class Thread_test10 {

	public static void main(String[] args) throws Exception {
		Thread t1=new Thread(new EmergencyThread(),"�߳�1");
		t1.start();
		for(int i=1; i<6; i++){
			System.out.println(Thread.currentThread().getName()+"����"+i);
			if(i==3) {
				t1.join();
			}
		}

	}

}
