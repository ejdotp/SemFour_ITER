class Employee
{
	int Salary = 40000;
    void eat(){
        System.out.println("Employee is eating");
    }
}
class programmer extends Employee
{
	int Bonus = 10000;
    void bark(){
        System.out.println( "Programmer is Barking" );
    }
	public static void main(String[] args)
	{
		programmer obj = new programmer();
		System.out.println(obj.Salary);
		System.out.println(obj.Bonus);
        obj.eat();
        obj.bark();
	}
}
