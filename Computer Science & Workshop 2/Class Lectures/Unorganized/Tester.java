import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class User implements Comparable<User> {
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
  public int compareTo(User user) {
    return this.age - user.age;
  }

  @Override
  public String toString() {
    return "Name : " + name + " , Age : " + age;
  }
}

class ArrayListUser {
  public static void main(String[] args) {
    ArrayList<User> users = new ArrayList<>();
    users.add(new User("Ananya", 21));
    users.add(new User("Aishwayra", 20));
    users.add(new User("Priyanka", 19));
    users.add(new User( "Suman", 22));
    for (user: users)
      System.out.println(user);
    Collections.sort(users);
    System.out.println("After Sorting");
    for (User user : users)
      System.out.println(user);
  }
}