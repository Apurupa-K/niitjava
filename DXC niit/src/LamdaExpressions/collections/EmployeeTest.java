package LamdaExpressions.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeTest {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("apurupa",1234));
		employees.add(new Employee("haritha",9876));
		employees.add(new Employee("apurva",7890));
		employees.add(new Employee("pandu",7806));
		employees.add(new Employee("pinky",6543));
		
		System.out.println(employees);
		//sort the employees based on their eid in ascending order
Comparator<Employee> c = (e1,e2) -> (e1.eid < e2.eid)? -1 :(e1.eid > e2.eid)? 1 :0;
		
		Collections.sort(employees,c);
				//new EmployeeComparator());
		System.out.println(employees);

	}

}
