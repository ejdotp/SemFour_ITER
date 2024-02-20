class Employee
{
	int Salary = 40000;
}
class programmer extends Employee
{
	int Bonus = 10000;
	public static void main(String[] args)
	{
		programmer obj = new programmer();
		System.out.println(obj.Salary);
		System.out.println(obj.Bonus);
	}
}
