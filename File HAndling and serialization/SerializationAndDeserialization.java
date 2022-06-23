import java.beans.Transient;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Library implements Serializable {
	int libId;
	String bookName;
	String studentName;
	transient int refNumber; 
	public Library(int libId, String bookName, String studentName , int refNumber) {
		this.libId = libId;
		this.bookName = bookName;
		this.studentName = studentName;
		this.refNumber = refNumber;
	}
	
}

public class SerializationAndDeserialization {
	private static final String FILE_PATH = "C:\\Users\\User\\eclipse-workspace\\FileHandling and serialization\\src\\input.txt";
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Library lb1 = new Library(101 , "Head First Java" , "Ajay" , 11111);
		FileOutputStream fos = new FileOutputStream(FILE_PATH);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(lb1);
		System.out.println("Name: "+lb1.studentName);
		System.out.println("id: "+lb1.libId);
		System.out.println("bookname: "+lb1.bookName);
		System.out.println("refNumber: "+lb1.refNumber);
		
		System.out.println("--------------------------------------------------------------");
		
		FileInputStream fis = new FileInputStream(FILE_PATH);
		ObjectInputStream ois  = new ObjectInputStream(fis);
		Library lb = (Library)ois.readObject();
		System.out.println("Name: "+lb.studentName);
		System.out.println("id: "+lb.libId);
		System.out.println("bookname: "+lb.bookName);
		System.out.println("refNumber: "+lb.refNumber);
	}

}
