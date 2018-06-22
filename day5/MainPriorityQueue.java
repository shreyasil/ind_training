package day5;
import java.util.*;
public class MainPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pr = new PriorityQueue<>();
		pr.add("world");
		pr.add("2hello");
		pr.add("1world");
		
		//passing a function as a parameter 
		pr.forEach(System.out::println);
		System.out.println(pr.peek());
	}

}
