package objectOrienrtedProg;

interface player{
	void name();
	void strength();
}

class Cricketer implements player{
	
	private String name , strength;
	
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setStrength(String strength) {
		this.strength = strength;
	}

	@Override
	public void name() {
		System.out.print("Name of crickter is: "+name);
	}

	@Override
	public void strength() {
		System.out.println(" and strength is : "+strength);
	}
	
}

public class AbstractionExample {

	public static void main(String[] args) {
		Cricketer c1 = new Cricketer();
		c1.setName("Sachin");
		c1.setStrength("batsman");
		c1.name();
		c1.strength();
	}

}
