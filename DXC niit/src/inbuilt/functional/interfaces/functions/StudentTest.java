package inbuilt.functional.interfaces.functions;

import java.util.ArrayList;
import java.util.function.Function;


public class StudentTest {
static ArrayList<JavaStudent> javaStudents;
	
	public static void main(String[] args) {
		populateStudents();
		
		Function<JavaStudent,String> f = (j) -> {
			if(j.marks > 80) return "Distinction";
			else if(j.marks > 60) return "first class";
			return "pass class";
		};
		
		for(JavaStudent s : javaStudents) {
			
			System.out.println(s.name +"\t"+ f.apply(s));
		}
	}

	public static ArrayList<JavaStudent> populateStudents() {
		javaStudents = new ArrayList<JavaStudent>();
		javaStudents.add(new JavaStudent("honey",65));
		javaStudents.add(new JavaStudent("kutty",60));
		javaStudents.add(new JavaStudent("pinky",100));
		javaStudents.add(new JavaStudent("pandu",90));
		javaStudents.add(new JavaStudent("chintu",95));
		return javaStudents;

	}

}
