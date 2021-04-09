package inbuilt.functional.interfaces.biparams;

import java.util.function.BiFunction;

import inbuilt.functional.interfaces.Employee;
public class TestBiFunction {
	
	public static void main(String[] args) {
		BiFunction< Integer, String, Employee> bif = (i,s) -> new Employee(s, i);
		
		Employee employee = bif.apply(1234, "apurupa");
		System.out.println(employee.name);
	}

}
