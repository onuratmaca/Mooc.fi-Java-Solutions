public class Book {

    private String name;
    private int pageCount;
    private int year;

    public Book(String bookName, int pageCount, int publicationYear) {
        this.name = bookName;
        this.pageCount = pageCount;
        this.year = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getYear() {
        return year;
    }
}
