
class Student
{
    private String name;
    private String major;
    private double gpa;

    Student()
    {

    }

    Student(String name, String major)
    {
        this.name = name;
        this.major = name;
    }

    Student(String name, String major, double gpa)
    {
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getMajor()
    {
        return major;
    }

    public void setMajor(String major)
    {
        this.major = major;
    }

    public double getGpa()
    {
        return gpa;
    }

    public void setGpa(double gpa)
    {
        this.gpa = gpa;
    }

    @Override
    public String toString()
    {
        return String.format("Student info: %s, %s, %f", name, major, gpa);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;

        if (obj instanceof Student)
        {
            Student other = (Student) obj;
            return this.name.equals(other.name) && this.major.equals(other.major);
        }

        return false;
    }
}