package objectOrienrtedProg;

class Library {
	private String name;
	private int age;
	private String address;
	
	
	
	public Library(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void getProfile() {
		System.out.println("-----Profile-----");
		System.out.println("Name: "+name);
		System.out.println("age: "+age);
		System.out.println("address: "+address);
	}

	public void dashboard() {
		System.out.println("-----User-Dashboard-----");
		System.out.println("Normal user login");
		System.out.println("See your issued book here Library.bookedIssued()");
		System.out.println("Your profile");
		getProfile();
	}
}

class LibraryAdmin extends Library{

	public LibraryAdmin(String name, int age, String address) {
		super(name, age, address);
	}

	@Override
	public void dashboard() {
		System.out.println("-----Admin-Dashboard-----");
		System.out.println("Admin login pannel");
		System.out.println("See your all issued book table here Library.getAllIssuedBook()");
		System.out.println("Your profile");
	}
	
}

public class DynamicPolynorphismExample {
	public static void main(String args[]) {
		LibraryAdmin ad1 = new LibraryAdmin("adi" , 25 , "xyz");
		ad1.getProfile();
		ad1.dashboard();
		Library l1 = new Library("Ajay" , 20 , "pqrs");
		l1.dashboard();
		l1.getProfile();
	}
}
