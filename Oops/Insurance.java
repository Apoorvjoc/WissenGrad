package objectOrienrtedProg;

public class Insurance {
	private
	int policyNumber;
	double monthlyPremium;
	String policyHolderName;
	int age;
	
	Insurance(int policyNumber, double monthlyPremium, String policyHolderName, int age) {
		this.policyNumber = policyNumber;
		this.monthlyPremium = monthlyPremium;
		this.policyHolderName = policyHolderName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Insurance [policyNumber=" + policyNumber + ", monthlyPremium=" + monthlyPremium + ", policyHolderName="
				+ policyHolderName + ", age=" + age + "]";
	}
}
