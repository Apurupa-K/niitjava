package serialization;


	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;


	public class SerializationDemo {

	public static void main(String[] args) {
	//Serialization
	Dog d1=new Dog();
	try {
	FileOutputStream fos =new FileOutputStream("D://testoutDxc.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(d1);
	}
	catch(IOException e) {
	System.out.println(e);
	}
	//De-serialaization
	try {


	FileInputStream fis;
	fis=new FileInputStream("D://testoutDxc.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Dog d2=(Dog)ois.readObject();
	System.out.println(d2.i+"\t"+d2.j);
	}
	catch(Exception e)

	{
	System.out.println(e);
	}




	}

	}

	