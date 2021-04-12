package method.referance;

public class PlayMethodReferance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = PlayMethodReferance::m1;
		Thread t= new Thread(r);
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("i am in main thread");
			
		}
		

	}
	public static void m1() {
		for(int i=0;i<10;i++) {
			System.out.println("i am in m1 method");
		}
	}

}
