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
}
class puppy extends programmer
{
	int Fees = 1000000;
    void cry(){
        System.out.println( "Programmer is Crying" );
    }
	public static void main(String[] args)
	{
		puppy obj = new puppy();
		System.out.println(obj.Salary);
		System.out.println(obj.Bonus);
        obj.eat();
        obj.bark();
        obj.cry();
	}
}
