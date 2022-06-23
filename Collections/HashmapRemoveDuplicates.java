
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


class StudentHS{
	String name;
	int age;
	String gender;
	int rollNumber;
	
	public StudentHS(String name, int age, String gender, int rollNumber) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.rollNumber = rollNumber;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", rollNumber=" + rollNumber + "]";
	}
}


public class HashmapRemoveDuplicates {
	
	public static void insert(StudentHS data , TreeMap<Integer , StudentHS>hm) {
		hm.put(data.rollNumber , data);
		System.out.println("Element Inserted Successfully");
	}
	
	public static void display(TreeMap<Integer , StudentHS>hm) {
		if(hm.size() == 0) {
			System.out.println("HashMap is Empty..");
			return;
		}
		Set<Entry<Integer, StudentHS>> set = hm.entrySet();
		for(Entry<Integer, StudentHS> setObj:set ) {
			StudentHS studentObj = setObj.getValue();
			//System.out.println("Policy id: "+insuranceObj.nPolicyID + " ,Policy Holder Name "+ insuranceObj.policyHoldersName + " ,Insurance Amount: "+insuranceObj.insuranceAmt);
			System.out.println(studentObj);
		}
	}
	
	public static void update(int id , StudentHS updatedData ,TreeMap<Integer , StudentHS>hm) {
		if(!hm.containsKey(id)){
			System.out.println("Element does not exists..");
		}else {
			hm.put(id , updatedData);
			System.out.println("Element Updated Successfully");
		}
	}
	
	public static void delete(int id ,  TreeMap<Integer , StudentHS>hm) {
		if(!hm.containsKey(id)){
			System.out.println("Element does not exists..");
		}else {
			hm.remove(id);
			System.out.println("Element Deleted Successfully");
		}
	}
	

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeMap<Integer , StudentHS>hm = new TreeMap<>();
		System.out.println("Enter Your choice: ");
		
		while(true) {
			System.out.println("1 for insert: ");
			System.out.println("2 for display: ");
			System.out.println("3 for update: ");
			System.out.println("4 for delete: ");
			System.out.println("5 for exit: ");
			int ch = sc.nextInt();
			
			if(ch == 1) {
				System.out.println("Enter Name of student: ");
				String name = sc.next();
				System.out.println("Enter Gender : ");
				String gender = sc.next();
				System.out.println("Enter Roll Number: ");
				int rollNumber = sc.nextInt();
				System.out.println("Enter Age of Student: ");
				int age = sc.nextInt();
				StudentHS data = new StudentHS(name , age , gender , rollNumber);
				insert(data , hm);
			}else if(ch == 2) {
				display(hm);
			}else if(ch == 3) {
				System.out.println("Enter the id to update: ");
				Integer id = sc.nextInt();
				if(!hm.containsKey(id)) {
					System.out.println("Student does not exists..");
					return;
				}
				System.out.println("Enter Name of student: ");
				String name = sc.next();
				System.out.println("Enter Gender : ");
				String gender = sc.next();
				System.out.println("Enter Roll Number: ");
				int rollNumber = sc.nextInt();
				System.out.println("Enter Age of Student: ");
				int age = sc.nextInt();
				StudentHS updatedData = new StudentHS(name , age , gender , rollNumber);
				update(id , updatedData , hm);
			}else if(ch == 4) {
				if(hm.size() == 0) {
					System.out.println("Records are Empty: ");
				}else {
					System.out.println("Enter the element to delete: ");
					int rollNUmber = sc.nextInt();
					delete(rollNUmber , hm);
				}
			}else {
				break;
			}		
		
		}

	}
}
