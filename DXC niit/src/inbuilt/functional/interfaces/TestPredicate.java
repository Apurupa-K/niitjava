package inbuilt.functional.interfaces;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestPredicate {

	static public ArrayList<Employee> employees;
	public static void main(String[] args) {
		Predicate<Integer> p = i -> i % 2 == 0;
		System.out.println(p.test(10));
		populateEmployees();
		Predicate<Employee> p1 = (e) -> e.salary >= 50000;

		for(Employee e : employees) {
			if(p1.test(e)) {
				System.out.println(e.name);
			}
		}
	}

	private static void populateEmployees() {
		employees = new ArrayList<Employee>();
		employees.add(new Employee("saha", 150000));
		employees.add(new Employee("yamu", 15000));
		employees.add(new Employee("mouni", 5500));
		employees.add(new Employee("ashu", 60000));
		employees.add(new Employee("hari", 25000));

	}

}
