
class Paw
{
    private int position;

    Paw(int position)
    {
        this.position = position;
    }

    @Override
    public String toString()
    {
        return String.format("Paw[%d]", position);
    }
}