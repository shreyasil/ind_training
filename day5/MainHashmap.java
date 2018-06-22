package day5;
import java.util.*;
public class MainHashmap {

	public static void main(String[] args) {
		// adding elements to map
		Map<Integer, String> obj = new HashMap<>();
		obj.put(1, "one");
		obj.put(2, "two");
		obj.put(3, "two");
		obj.put(1, "new");//replace the previous value
		System.out.println(obj);
		
		
		Collection<String> keys = obj.values();
		keys.forEach(System.out::println);
	}

}
