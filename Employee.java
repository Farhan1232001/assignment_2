
class Employee
{
    private String name;
    private int hours;

    Employee(String name, int hours)
    {
        this.name = name;
        this.hours = hours;
    }

    public double calculateSalary()
    {
        return hours * 20;
    }

    public int getHours()
    {
        return hours;
    }

    @Override
    public String toString()
    {
        return String.format("Employee[%s, %d]", name, hours);
    }
}