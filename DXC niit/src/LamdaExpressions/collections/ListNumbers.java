package LamdaExpressions.collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ListNumbers {

public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(23456);
	al.add(500);
	al.add(3678);
	al.add(1);
	al.add(8987);
	al.add(197);
	System.out.println(al);
	Comparator<Integer> c = (o1,o2)->(o1 < o2)? -1 : (o1 > o2)? 1 : 0;
	Collections.sort(al,c);// new Comapator = c
	System.out.println(al);
}

}
