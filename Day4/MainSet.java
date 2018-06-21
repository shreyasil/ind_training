package day4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class MainSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		set.add("hello");
		set.add("hello");//does not allow duplication. Overrides the previous
		for(Object s:set)
		{
			System.out.println(s);
		}
	}

}
