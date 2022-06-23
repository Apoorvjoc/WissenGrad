import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MovieComparator{
	String name;
	int rating;
	String description;
	String genere;
	
	public MovieComparator(String name, int rating, String description, String genere) {
		this.name = name;
		this.rating = rating;
		this.description = description;
		this.genere = genere;
	}

	@Override
	public String toString() {
		return "MoveComparator [name=" + name + ", rating=" + rating + ", description=" + description + ", genere="
				+ genere + "]";
	}
	
}

class ratingComparator implements Comparator<MovieComparator>{

	@Override
	public int compare(MovieComparator o1, MovieComparator o2) {
		// TODO Auto-generated method stub
		return o1.rating - o2.rating;
	}
	
}

public class ComparatorDemo {

	public static void main(String[] args) {
		
		List<MovieComparator> l = new ArrayList<>();
		
		MovieComparator obj1 = new MovieComparator("abc" , 8 , "abcdef" , "Action");
		MovieComparator obj2 = new MovieComparator("def" , 4 , "defghi" , "romance");
		MovieComparator obj3 = new MovieComparator("ghi" , 6 , "ghijkl" , "thiller");
		MovieComparator obj4 = new MovieComparator("jkl" , 10 , "jklmno" , "sci-fi");
		MovieComparator obj5 = new MovieComparator("mno" , 9 , "pqrstu" , "Action");
		
		l.add(obj5);
		l.add(obj4);
		l.add(obj1);
		l.add(obj2);
		l.add(obj3);
		
		System.out.println("Data before sorting");
		for(MovieComparator x: l) {
			System.out.println(x);
		}
		
		System.out.println("Data after sorting");
		Collections.sort(l , new ratingComparator());
		for(MovieComparator x: l) {
			System.out.println(x);
		}
		
	}

}
