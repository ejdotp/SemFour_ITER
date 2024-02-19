class DemoEncap
{
	private int ssnValue;
	private int employeeAge;
	private String employeeName;
	
	// We will employ get and set methods to use the class objects
	public int getEmployeeSSN()
	{
		return ssnValue;
	}
	
	public String getEmployeeName()
	{
		return employeeName;
	}
	
	public int getEmployeeAge()
	{
		return employeeAge;
	}
	
	public void setEmployeeAge(int newValue)
	{
		employeeAge = newValue;
	}
	
	public void setEmployeeName(String newValue)
	{
		employeeName = newValue;
	}
	
	public void setEmployeeSSN(int newValue)
	{
		ssnValue = newValue;
	}
}

public class TestEncapsulation
{
	public static void main(String args[])
	{
		DemoEncap obj = new DemoEncap();
		obj.setEmployeeName("Mark");
		obj.setEmployeeAge(30);
		obj.setEmployeeSSN(12345);
		System.out.println("Employee Name is: " + obj.getEmployeeName());
		System.out.println("Employee SSN Code is: " + obj.getEmployeeSSN());
		System.out.println("Employee Age is: " + obj.getEmployeeAge());
	}
}