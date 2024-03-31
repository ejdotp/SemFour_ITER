// Write a Java code snippet comprising two classes: Laptop and Main. The Laptop class
// defines private fields model and price, alongside setter methods for each attribute.
// Additionally, it overrides the toString() method to return a string representation of the laptop's
// model and price. In the Main class, create an instance of Laptop, setting its model using the
// setter method. Then, print the laptop object using the toString() method. Describe the
// functionality of the toString() method in the Laptop class and explain how it is utilized in the
// Main class.

class Laptop
{
    private String model;
    private int price;

    public void set(String model, int price)
    {
        this.model = model;
        this.price = price;
    }

    public String toString()
    {
        return "Laptop Model: " + model + ", Price: ₹" + price;
    }
}

class Main
{
    public static void main(String[] args)
    {
        Laptop britney = new Laptop();

        britney.set("HP Pavillion", 45000);

        System.out.println(britney.toString());
    }
}

/*Output: Laptop Model: HP Pavillion, Price: ₹45000

Functionality of toString() and its Usage:

toString(): When you print an object directly, Java implicitly calls the toString() method of that object. This overridden method in Laptop defines how the object's information (model and price) should be displayed as a string.
Utilization in Main: In the main method, printing myLaptop directly triggers the toString() method of the Laptop class, resulting in the formatted output "Laptop Model: Dell XPS 13, Price: $ (price)".
*/


