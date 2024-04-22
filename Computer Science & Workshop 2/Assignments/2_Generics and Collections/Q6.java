//Write a program to create an Animal class with member variables name, color, types (pet/wild). Override the hashCode method to print the unique id for the object. Create the objects of the Animal class and print its hashcode.

class Animal
{
    private String name;
    private String color;
    private String type; // pet or wild

    public Animal(String name, String color, String type)
    {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    public String toString() {
        return "Animal [name=" + name + ", color=" + color + ", type=" + type + "]";
    }

    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;

        //or
        // return color.hashCode() + name.hashCode() + type.hashCode();
    }
}

class Q6
{
    public static void main(String[] args)
    {
        Animal animal1 = new Animal("Leo", "Brown", "Wild");
        Animal animal2 = new Animal("Milo", "White", "Pet");

        System.out.println("Hashcode of animal1: " + animal1.hashCode());
        System.out.println("Hashcode of animal2: " + animal2.hashCode());
    }
}

/*Hashcode of animal1: 1820676265
Hashcode of animal2: -1239147832 */