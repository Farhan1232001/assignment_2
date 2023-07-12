
class Watch
{
    private int rating;
    private Person person;
    private Movie movie;

    Watch(int rating, Movie movie, Person person)
    {
        this.rating = rating;
        this.movie = movie;
        this.person = person;
    }

    @Override
    public String toString()
    {
        return String.format("(%s, %s, %d)", person, movie, rating);
    }
}