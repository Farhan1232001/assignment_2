import java.util.ArrayList;

class Course
{
    private int code;
    private ArrayList<Book> books;

    Course(int code, Book book)
    {
        this.books = new ArrayList<Book>();
        this.code = code;
        this.books.add(book);
    }

    public void addBook(Book book)
    {
        books.add(book);
    }

    public String toString()
    {
        return String.format("Course[%s, numOfBooks=%d]", code, books.size());
    }
}