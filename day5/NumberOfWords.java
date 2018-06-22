package day5;
import java.util.*;
public class NumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		String inp="the horse raced past the barn";
		System.out.println(inp);
		String a[]=inp.split(" ");
		for(int i=0;i<a.length;i++)
		{
			int n=0;
			if(map.containsKey(a[i]))
				n=map.get(a[i]);
			map.put(a[i],n+1);
		}
		System.out.println(map);
	}

}
