class Person
{
	private int Age;
	private String Name;
	
	// We will employ get and set methods to use the class objects
	public String getName()
	{
		return Name;
	}
	
	public int getAge()
	{
		return Age;
	}
	
	public void setAge(int Age)
	{
		this.Age = Age;
	}
	
	public void setName(String Name)
	{
		this.Name = Name;
	}
}

public class TestEncapsulation
{
	public static void main(String args[])
	{
		Person obj = new Person();
		obj.setName("Mark");
		obj.setAge(30);
		System.out.println("Name is: " + obj.getName());
		System.out.println("Age is: " + obj.getAge());
	}
}