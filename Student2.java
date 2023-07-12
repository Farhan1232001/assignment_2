
class Student2
{
    private String name;
    private Transcript transcript;
    
    Student2(String name, Transcript transcript)
    {
        this.name = name;
        this.transcript = transcript;
    }

    @Override
    public String toString()
    {
        return String.format("Student2[%s, %s]", name, transcript.toString());
    }
}