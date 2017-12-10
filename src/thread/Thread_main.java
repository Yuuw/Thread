package thread;

public class Thread_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread_run th[];
		Thread_runnable th2[];
		int num = 3;
		
		th = new Thread_run[num];
		th2 = new Thread_runnable[num];
		for(int i=0;i<num;i++) {
			th[i] = new Thread_run();
			th2[i] = new Thread_runnable();
			th[i].start();
			th2[i].run();
		
		    try {
				th[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		    for(int i = 0;i < 10; i++) {
		    	System.out.println(Thread.currentThread().getName() + ": "+i);
		    }

	}

}
