import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

class Insurance{
	  int nPolicyID;
	  String policyHoldersName;
	  int insuranceAmt;

	public Insurance(int nPolicyID, String policyHoldersName, int insuranceAmt) {
		this.nPolicyID = nPolicyID;
		this.policyHoldersName = policyHoldersName;
		this.insuranceAmt = insuranceAmt;
		
	}
	@Override
	public String toString() {
		return "Insurance [nPolicyID=" + nPolicyID + ", policyHoldersName=" + policyHoldersName + ", insuranceAmt="
				+ insuranceAmt + "]";
	} 
	  
}


public class MenuDribbenHashMap {
	
	public static void insert(Insurance data , HashMap<Integer , Insurance> hm) {
		hm.put(data.nPolicyID , data);
		System.out.println("Element Inserted Successfully");
	}
	
	public static void display(HashMap<Integer , Insurance> hm) {
		if(hm.size() == 0) {
			System.out.println("HashMap is Empty..");
			return;
		}
		Set<Entry<Integer , Insurance>>set = hm.entrySet();
		Insurance insuranceObj = null; 
		
		for(Entry<Integer , Insurance>setObj:set) {
			insuranceObj = setObj.getValue();
			//System.out.println("Policy id: "+insuranceObj.nPolicyID + " ,Policy Holder Name "+ insuranceObj.policyHoldersName + " ,Insurance Amount: "+insuranceObj.insuranceAmt);
			System.out.println(insuranceObj);
		}
	}
	
	public static void update(int id , Insurance updatedData ,HashMap<Integer , Insurance> hm) {
		if(!hm.containsKey(id)){
			System.out.println("Element does not exists..");
		}else {
			hm.put(id , updatedData);
			System.out.println("Element Updated Successfully");
		}
	}
	
	public static void delete(int id ,  HashMap<Integer , Insurance> hm) {
		if(!hm.containsKey(id)){
			System.out.println("Element does not exists..");
		}else {
			hm.remove(id);
			System.out.println("Element Deleted Successfully");
		}
	}
	


	public static void main(String[] args) {


		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		HashMap<Integer , Insurance>hm = new HashMap<>();

		System.out.println("Enter Your choice: ");
		
		while(true) {
			System.out.println("1 for insert: ");
			System.out.println("2 for display: ");
			System.out.println("3 for update: ");
			System.out.println("4 for delete: ");
			int ch = sc.nextInt();
			
			if(ch == 1) {
				System.out.println("Enter Policy holder Name: ");
				String name = sc.next();
				System.out.println("Enter Insurancre Amount: ");
				int amount = sc.nextInt();
				System.out.println("Enter Policy Number: ");
				int policyNum = sc.nextInt();
				Insurance data = new Insurance(policyNum , name , amount);
				insert(data , hm);
			}else if(ch == 2) {
				display(hm);
			}else if(ch == 3) {
				System.out.println("Enter the id to update: ");
				Integer id = sc.nextInt();
				System.out.println("enter the updated data: ");
				System.out.println("Enter Policy holder Name: ");
				String name = sc.next();
				System.out.println("Enter Insurancre Amount: ");
				int amount = sc.nextInt();
				System.out.println("Enter Policy Number: ");
				int policyNum = sc.nextInt();
				Insurance updatedData = new Insurance(policyNum , name , amount);
				
				update(id , updatedData , hm);
			}else if(ch == 4) {
				if(hm.size() == 0) {
					System.out.println("ArrayList is Empty: ");
				}else {
					System.out.println("Enter the element to delete: ");
					Integer element = sc.nextInt();
					delete(element , hm);
				}
			}else {
				break;
			}

		}

	}
}
