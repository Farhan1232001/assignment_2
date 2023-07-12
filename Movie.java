
class Movie
{
    private String name;
    private String genre;

    Movie(String name, String genre)
    {
        this.name = name;
        this.genre = genre;
    }

    @Override
    public String toString()
    {
        return String.format("%s", name);
    }
}