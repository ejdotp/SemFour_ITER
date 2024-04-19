//Q8. Write a Java code snippet that comprises of a User class and an ArrayListUser class. The User class should define private fields for name and age, along with a parameterized constructor and getter/setter methods for these attributes. Create an ArrayListUser class of User objects. After addition of objects, the ArrayListUser class should retrieve and print the name and age of users. Then, it should sort the user according to age using getter methods and print the updated array list of users.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class User
{
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}

class ArrayListUser
{
    public static void main(String[] args)
    {
        List<User> users = new ArrayList<>();

        users.add(new User("Ashutosh", 21));
        users.add(new User("Dishant", 20));
        users.add(new User("Sujan", 20));

        System.out.println("Initial users:");
        for (User user : users)
            System.out.println(user);

        Collections.sort(users, (u1, u2) -> Integer.compare(u1.getAge(), u2.getAge()));

        System.out.println("\nSorted users by age:");
        for (User user : users)
            System.out.println(user);
    }
}
