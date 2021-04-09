package inbuilt.functional.interfaces.predicates;

import java.util.function.Predicate;

public class ChainPredicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p1= i -> i%2==0;
		Predicate<Integer> p2= i -> i>10;
		int[] intArray = {10,5,7,11,12,34,56};
		System.out.println("if no>10 and if it is even then print it");
		for(int i : intArray) {
			if(p1.and(p2).test(i)) {
				System.out.println(i);
			}
		}
		System.out.println("if no>10 and if it is even then print it");
		for(int i : intArray) {
			if(p1.or(p2).test(i)) {
				System.out.println(i);//if no>10 and if it is even then print it");

			}

		}
	}
}

