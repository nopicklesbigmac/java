package threads;

public class A2 extends Thread {
	@Override
	public void run() {
			for (int i=0; i <= 100; i++) {
				System.out.println("A2 : " + i);
			}
		}	

}
