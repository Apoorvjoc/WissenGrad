import java.util.ArrayList;
import java.util.Scanner;

public class CRUDInArrayList {
	
	public static void insert(int data , ArrayList<Integer> al) {
		al.add(data);
		System.out.println("Element Inserted Successfully");
	}
	
	public static void display(ArrayList<Integer> al) {
		if(al.size() == 0) {
			System.out.println("ArrayList is Empty..");
		}
		System.out.println("Data inside arraylist is : "+al);
	}
	
	public static void update(int data , int updatedData , ArrayList<Integer> al) {
		if(!al.contains(data)){
			System.out.println("Element does not exists..");
		}else {
			int idx = al.indexOf(data);
			al.set(idx, updatedData);
			System.out.println("Element Updated Successfully");
		}
	}
	
	public static void delete(int element , ArrayList<Integer> al) {
		if(!al.contains(element)){
			System.out.println("Element does not exists..");
		}else {
			int idx = al.indexOf(element);
			al.remove(idx);
			System.out.println("Element Deleted Successfully");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your choice: ");
		
		while(true) {
			System.out.println("1 for insert: ");
			System.out.println("2 for display: ");
			System.out.println("3 for update: ");
			System.out.println("4 for delete: ");
			int ch = sc.nextInt();
			
			if(ch == 1) {
				System.out.println("Enter the element to insert: ");
				Integer data = sc.nextInt();
				insert(data , al);
			}else if(ch == 2) {
				display(al);
			}else if(ch == 3) {
				System.out.println("Enter the element to update: ");
				Integer data = sc.nextInt();
				System.out.println("enter the updated data: ");
				Integer updatedData = sc.nextInt();
				update(data , updatedData , al);
			}else if(ch == 4) {
				if(al.size() == 0) {
					System.out.println("ArrayList is Empty: ");
				}else {
					System.out.println("Enter the element to delete: ");
					Integer element = sc.nextInt();
					delete(element , al);
				}
			}else {
				break;
			}
		}
	}

}
