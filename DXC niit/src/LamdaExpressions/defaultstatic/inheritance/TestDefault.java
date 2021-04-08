package LamdaExpressions.defaultstatic.inheritance;

public class TestDefault implements Left,Right{

	@Override
	public void m1() {
		Left.super.m1();
		
	}
	public static void main(String[] args) {
		TestDefault td = new TestDefault();
		td.m1();
	}

}
