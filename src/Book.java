public class Book {
    // Parameter
    private String title;
    private int pages;
    private String author;
    // Parameter - End

    // Constructor mit parameter
    public Book(String title, int pages, String author) {
        this.title = title;
        this.pages = pages;
        this.author = author;
    }
    // Constructor - End

    // Getter und Setter - methoden
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPages() {
        return pages;
    }
    public String getAuthor() {
        return author;
    }
    public void overview() {
        System.out.printf("%-20s %-10d %-20s\n", title, pages, author);
    }
    // Getter und Setter - methoden - End

}


