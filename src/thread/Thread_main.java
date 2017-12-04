package thread;

public class Thread_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread_run[] th = new Thread_run[1];
		th[0] = new Thread_run();
		th[0].run();
		
		Thread_runnable[] th2 = new Thread_runnable[1];
		th2[0] = new Thread_runnable();
		th2[0].run();
		
		try {
			th[0].join(); //スレッド側の出力が終わるまで待つようになる
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0; i < 10; i++) {
			System.out.println("mainから出力 : "+i);
		
		}	
		
	}

}
