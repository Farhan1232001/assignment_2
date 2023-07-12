
class Staff extends Employee
{
    private int role;

    Staff(String name, int hours, int role)
    {
        super(name, hours);
        this.role = role;
    }

    @Override
    public String toString()
    {
        return String.format("Employee[%d]", role);
    }
}