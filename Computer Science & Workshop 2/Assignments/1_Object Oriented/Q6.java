abstract class LibraryResource
{
    private String title;
    private String author;

    public LibraryResource(String title, String author)
    {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public abstract void displayDetails(); 
}

class Book extends LibraryResource
{
    private int pageCount;

    public Book(String title, String author, int pageCount)
    {
        super(title, author);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void displayDetails() {
        System.out.println("Book - Title: " + getTitle() + ", Author: " + getAuthor() + ", Pages: " + pageCount);
    }
}

class Magazine extends LibraryResource
{
    private String issueDate;

    public Magazine(String title, String author, String issueDate)
    {
        super(title, author);
        this.issueDate = issueDate;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public void displayDetails() {
        System.out.println("Magazine - Title: " + getTitle() + ", Author: " + getAuthor() + ", Issue Date: " + issueDate);
    }
}

class DVD extends LibraryResource
{
    private int duration; 

    public DVD(String title, String author, int duration)
    {
        super(title, author);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void displayDetails() {
        System.out.println("DVD - Title: " + getTitle() + ", Author: " + getAuthor() + ", Duration (mins): " + duration);
    }
}

class LibrarySystem
{
    public static void main(String[] args)
    {
        LibraryResource[] resources = new LibraryResource[]
        {
            new Book("The Hobbit", "J.R.R. Tolkien", 310),
            new Magazine("National Geographic", "Various", "March 2023"),
            new DVD("The Lord of the Rings: The Fellowship of the Ring", "Peter Jackson", 178)
        };

        for (LibraryResource resource : resources)
            resource.displayDetails();
    }
}

/*
Book - Title: The Hobbit, Author: J.R.R. Tolkien, Pages: 310
Magazine - Title: National Geographic, Author: Various, Issue Date: March 2023
DVD - Title: The Lord of the Rings: The Fellowship of the Ring, Author: Peter Jackson, Duration (mins): 178
*/
