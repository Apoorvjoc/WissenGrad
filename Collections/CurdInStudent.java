import java.util.ArrayList;
import java.util.Scanner;

class Student{
	String name;
	int id;
	String course;
	
public Student(String name, int id, String course) {
		this.name = name;
		this.id = id;
		this.course = course;
	}
}



class CurdInStudent {
	
	public static int containsStudent(int roll , ArrayList<Student>al) {
		
		for(int i = 0 ; i<al.size() ; i++) {
			if(al.get(i).id == roll) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void insert(Student data , ArrayList<Student> al) {
		al.add(data);
		System.out.println("Element Inserted Successfully");
	}

	public static void display(ArrayList<Student> al) {
		if(al.size() == 0) {
			System.out.println("ArrayList is Empty..");
		}
		for(int i = 0 ; i<al.size() ; i++){
			System.out.print(al.get(i).name+" "+al.get(i).course+" "+al.get(i).id);
			System.out.println();
		}
		
	}

	public static void update(int id , ArrayList<Student> al) {
		Scanner sc = new Scanner(System.in);
		int idx = containsStudent(id , al);
		if(idx == -1){
			System.out.println("Element does not exists..");
		}else {
			System.out.println("enter the following for update: ");
			System.out.println("Enter the Name of Student: ");
			String name = sc.next();
			System.out.println("Enter the Course of Student: ");
			String course = sc.next();
			System.out.println("Enter the id of Student: ");
			int roll = sc.nextInt();
			Student obj = new Student(name , roll , course);
			al.set(idx, obj);
			System.out.println("Element Updated Successfully");
		}
	}

	public static void delete(int id , ArrayList<Student> al) {
		int idx = containsStudent(id , al);
		if(idx == -1){
			System.out.println("Element does not exists..");
		}else {
			al.remove(idx);
			System.out.println("Element Deleted Successfully");
		}
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> al = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your choice: ");
		
		while(true) {
			System.out.println("1 for insert: ");
			System.out.println("2 for display: ");
			System.out.println("3 for update: ");
			System.out.println("4 for delete: ");
			System.out.println("5 for exit: ");
			int ch = sc.nextInt();
			
			if(ch == 1) {
				System.out.println("Enter the Name of Student: ");
				String name = sc.next();
				System.out.println("Enter the Course of Student: ");
				String course = sc.next();
				System.out.println("Enter the id of Student: ");
				int id = sc.nextInt();
				Student obj = new Student(name , id , course);
				insert(obj , al);
			}else if(ch == 2) {
				display(al);
			}else if(ch == 3) {
				System.out.println("Enter the id of to update: ");
				Integer id = sc.nextInt();
				update(id , al);
			}else if(ch == 4) {
				if(al.size() == 0) {
					System.out.println("Records are Empty: ");
				}else {
					System.out.println("Enter the id of student: ");
					Integer id = sc.nextInt();
					delete(id , al);
				}
			}else {
				break;
			}
		}
	}

}
