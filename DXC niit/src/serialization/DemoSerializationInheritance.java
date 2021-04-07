package serialization;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DemoSerializationInheritance {

	private static final String FILE_NAME = "inheritance.txt";

	public static void main(String[] args) throws Exception {
		Rabbit rabbit = new Rabbit();
		rabbit.i = 888;
		rabbit.k = 777;
		rabbit.i=999;
		FileOutputStream fos = new FileOutputStream(FILE_NAME);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(rabbit);

		FileInputStream fis = new FileInputStream(FILE_NAME);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Rabbit rabbit2 = (Rabbit)ois.readObject();

		System.out.println("values are i="+rabbit2.i+"j="+rabbit2.j+"k="+rabbit2.k);

	}

}


