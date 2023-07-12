
class Transcript
{
    private String course;
    private double grade;

    Transcript(String course, double grade)
    {
        this.course = course;
        this.grade = grade;
    }

    @Override
    public String toString()
    {
        return String.format("transcript[%s, %.2f]", course, grade);
    }
}