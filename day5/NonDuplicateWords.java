package day5;
import java.util.*;
public class NonDuplicateWords {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inp="the horse raced past the barn";
		System.out.println(inp);
		String a[]=inp.split(" ");
		Set set = new HashSet();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		for(Object s:set)
		System.out.println(s+" ");
		System.out.println();

	}
}
