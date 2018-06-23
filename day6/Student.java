package day6;

 class Student1 {
	private int age;
	private String name;//encapsulation
	/*public Student1(String name, int age)
	{
		super();
		this.name= name;
		this.age= age;
	}*/

		public int getAge() {
		return age;
	}



	public void setAge(int age)throws Exception {
		if(age<18)
			throw new Exception();
		else
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override                                                                                                      
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	

}
public class Student
{
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Student1 ob = new Student1();
		ob.setAge(21);
		ob.setName("shreya");
		System.out.println(ob);
	}
}