package day5;
import java.util.*;
public class ArraylistGenerics {

	public static void main(String[] args) {
		// making the data structure homogeneous 
		List<String> data = new ArrayList();
		data.add("jon snow");
		data.add("ned stark");
		String s1 = data.get(0);
		System.out.println(s1.toUpperCase());
	}

}
