package day4;
import java.util.ArrayList;
import java.util.List;
public class MainArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List data=new ArrayList();
		data.add(6);
		data.add("hello");
		data.add(6.9f);
		data.add(false);
		data.add(007);
		System.out.println(data.size());
		
		System.out.println(data);
		
		System.out.println(data.get(0)); 
		
		for(int i=0;i<data.size();i++)
		{
			System.out.println(data.get(i));
		}
	}

}

