package thread;

public class B extends Thread {
	@Override
	public void run() {
		long startTime = System.nanoTime();
		
		// TODO Auto-generated method stub
		// 스레드가 해야할 일
		for (int i=1; i < 1000000; i++) {
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println(this + "b=>"+i);
		}
		long endTime = System.nanoTime();
		long duration = (endTime - startTime) / 1_000_000;
		
		
		System.out.println("실행 시간: " + duration+ "ms");
	}
}

