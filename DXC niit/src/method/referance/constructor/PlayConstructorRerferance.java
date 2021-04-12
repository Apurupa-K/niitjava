package method.referance.constructor;

public class PlayConstructorRerferance {

	public static void main(String[] args) {
		ISample iSample = Sample::new;
		Sample s1= iSample.get("hello");
		// TODO Auto-generated method stub

	}

}
