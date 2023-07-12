
class Professor extends Employee
{
    private String field;

    Professor(String name, int hours, String field)
    {
        super(name, hours);
        this.field = field;
    }

    public double calculateSalary()
    {
        return getHours() * 30;
    }

    @Override
    public String toString()
    {
        return String.format("Employee[%s]", field);
    }
}