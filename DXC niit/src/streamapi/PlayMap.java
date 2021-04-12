package streamapi;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PlayMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>marks= new ArrayList<Integer>();
		marks.add(56);
		marks.add(98);
		marks.add(40);
		marks.add(65);
		marks.add(50);
		System.out.println(marks);
		List<Integer> updatedMarks = marks.stream().map(i ->i+5).collect(Collectors.toList());
		System.out.println(updatedMarks);
		List<Integer> evennumbers = marks.stream().filter(i ->i%2==0).collect(Collectors.toList());
		System.out.println(evennumbers);
		Long noStudentMarksLessFifty = marks.stream().filter(i->i<50).count(); 
		System.out.println(noStudentMarksLessFifty+" of them have scored less than fifty");
	


		
		

		

	}

}
