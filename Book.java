
class Book
{
    private String name;
    private String author;
    private Course course;

    public void setName(String name)
    {
        this.name = name;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
    public void setCourse(Course course)
    {
        this.course = course;
    }

    public String toString()
    {
        return String.format("Book[%s, %s, %s]", name, author, course);
    }
}