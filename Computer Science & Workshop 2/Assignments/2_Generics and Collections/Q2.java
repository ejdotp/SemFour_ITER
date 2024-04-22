//Write a program to create a Book class with member variables bookId, bookName, and price. Add the respective method and constructor to it. Create a driver class in that class and create two book objects. Compare the book objects according to their price. Print the details of the book objects. Note: Overload toString and equals method.

class Book{
    private int bookId;
    private String bookName;
    private double price;

    public Book(int bookId, String bookName, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public String toString() {
        return "Book [bookId=" + bookId + ", bookName=" + bookName + ", price=" + price + "]";
    }

    public boolean equals(Object other) {
        if (this == other)
            return true;

        if (other == null || getClass() != other.getClass())
            return false;

        Book otherBook = (Book) other;
        return price == otherBook.price;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Book book1 = new Book(101, "The Alchemist", 15.99);
        Book book2 = new Book(102, "The Power of Habit", 12.99);

        System.out.println(book1);
        System.out.println(book2);

        System.out.println(book1.equals(book2)); // False
    }
}

/*
 * Book [bookId=101, bookName=The Alchemist, price=15.99]
 * Book [bookId=102, bookName=The Power of Habit, price=12.99]
 * false
 */