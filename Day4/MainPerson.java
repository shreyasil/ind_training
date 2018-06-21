package day4;

public class MainPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new  Person("Jon","Snow",20);
		System.out.println(p1.toString());
		//Person p2=p1;
		Person p2 = new Person("Jon","stark",45);
		System.out.println(p2.toString());
		System.out.println(p1.equals(p2));
	}

}
class Person
{
	private String fname;
	private String lname;
	private int age;
	Person(String f, String l,int a)
	{
		this.fname=f;
		this.lname=l;
		this.age=a;
	}
	@Override
	public String toString()
	{
		return "Person {"+"fname="+fname+", lname="+lname+",age="+age+"}";
	}
	public boolean equals(Object obj)//overriding the equals method
	{
		Person that = (Person)obj;//typecasting to our class
		if(this.fname.equals(that.fname)) {
			return true;
		}
		return false;
	}
}
