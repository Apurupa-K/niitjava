package LamdaExpressions.defaultstatic;

public interface SomeInterface {
	public void method1();
	public void method2();

	default public void method3() { 

		System.out.println("default method of some interface");
	}

}

