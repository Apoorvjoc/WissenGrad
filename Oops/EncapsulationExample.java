package objectOrienrtedProg;

class MyInsurance{
	private String name;
	private int age;
	private int policyNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}
	
	
}


public class EncapsulationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInsurance i = new MyInsurance();
		i.setAge(25);
		i.setName("Raj");
		i.setPolicyNumber(12345);
		System.out.println("Name: "+i.getName());
		System.out.println("Age: "+i.getAge());
		System.out.println("PolicyNumber: "+i.getPolicyNumber());
	}

}
