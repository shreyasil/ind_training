package day5;
import java.util.*;
public class MainArraylist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List data = new ArrayList();
		data.add("jon snow");
		data.add("ned stark");
		//typecasting from object type to string type
		String s1=(String)data.get(1);
		System.out.println(s1.toUpperCase());
	}

}
