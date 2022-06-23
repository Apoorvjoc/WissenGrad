package objectOrienrtedProg;

class Add{
	public int add(int num1 , int num2) {
		return num1 + num2;
	}
	
	public int add(int num1 , int num2 , int num3) {
		return num1 + num2 + num3;
	}
}

public class StaticPolymorphismExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add ad = new Add();
		System.out.println(ad.add(10, 20));
		System.out.println(ad.add(10, 20 , 30));
	}

}
