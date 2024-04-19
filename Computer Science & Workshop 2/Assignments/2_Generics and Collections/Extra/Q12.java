//Q12. Write a program to create a TreeSet of Integer type and perform the belowoperation on it.(a.) Display the TreeSet(b.) Ask the user to enter a number and search that number is it present in thelist or not.(c.) Remove an element from tree.

import java.util.Scanner;
import java.util.TreeSet;

class Q12 {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(7);
        treeSet.add(3);
        treeSet.add(9);

        System.out.println("The TreeSet: " + treeSet);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to search: ");
        int num = scanner.nextInt();
        System.out.println("Is " + num + " present in the TreeSet? " +
                treeSet.contains(num));
        scanner.nextLine();
        System.out.println("Enter a number to remove: ");
        treeSet.remove(scanner.nextInt());
        System.out.println("The updated TreeSet: " + treeSet);

        scanner.close();
    }
}