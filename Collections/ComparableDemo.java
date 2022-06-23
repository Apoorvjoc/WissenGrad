import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class InsuranceComparable{
	  int nPolicyID;
	  String policyHoldersName;
	  int insuranceAmt;

	public InsuranceComparable(int nPolicyID, String policyHoldersName, int insuranceAmt) {
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

class nameComparator implements Comparator<InsuranceComparable>{

	@Override
	public int compare(InsuranceComparable o1, InsuranceComparable o2) {
		// TODO Auto-generated method stub
		return o1.policyHoldersName.compareTo(o2.policyHoldersName);
	}
	
}


public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<InsuranceComparable> al = new ArrayList<>();
		
		InsuranceComparable obj1 = new InsuranceComparable(101 , "abc" , 1000000);
		InsuranceComparable obj2 = new InsuranceComparable(102 , "def" , 5000000);
		InsuranceComparable obj3 = new InsuranceComparable(104 , "ghi" , 6000000);
		InsuranceComparable obj4 = new InsuranceComparable(103 , "jkl" , 700000);
		InsuranceComparable obj5 = new InsuranceComparable(105 , "mno" , 100000);
		
		al.add(obj5);
		al.add(obj4);
		al.add(obj3);
		al.add(obj2);
		al.add(obj1);
		
		System.out.println("Data before sorting");
		for(InsuranceComparable x: al) {
			System.out.println(x);
		}
		
		System.out.println("Data after sorting");
		Collections.sort(al , new nameComparator());
		for(InsuranceComparable x: al) {
			System.out.println(x);
		}
		
	}

}
