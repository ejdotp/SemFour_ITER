//Q11. Create a Class Book that has id, name, author and quantity for each book issued. The Book class should define a parameterised constructor. Design a class Library that create a HashMap of books which contains an entry of key as Integer and value as Book object. Instantiate atleast two Book objects and display the collection of books in the HashMap. Use proper method of HashMap class to return the following things(a.)Check if a particular book name is present in the map(b.) remove the value associated with a particular key value which will remove the book entry.  

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Book {
    private int id;
    private String name;
    private String author;
    private int quantityIssued;

    public Book(int id, String name, String author, int quantityIssued) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantityIssued = quantityIssued;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantityIssued() {
        return quantityIssued;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Book book = (Book) o;
        return id == book.id && quantityIssued == book.quantityIssued &&
                Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, author, quantityIssued);
    }
}

class Library {
    private Map<Integer, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getId(), book);
    }

    public void removeBook(int id) {
        books.remove(id);
    }

    public boolean isBookPresent(String name) {
        for (Book book : books.values()) {
            if (book.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void displayBooks() {
        for (Book book : books.values()) {
            System.out.println("Book: " + book.getName() + ", Author: " +
                    book.getAuthor() + ", Quantity Issued: " + book.getQuantityIssued());
        }
    }
}

class Q11 {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald",
                100);
        Book book2 = new Book(2, "To Kill a Mockingbird", "Harper Lee", 120);

        library.addBook(book1);
        library.addBook(book2);
        library.displayBooks();

        System.out.println("The Great Gatsby is present in the library: " +
                library.isBookPresent("The Great Gatsby"));
        System.out.println(
                "The Catcher in the Rye is present in the library:" + library.isBookPresent("The Catcher in the Rye"));

        library.removeBook(1);

        library.displayBooks();
    }
}