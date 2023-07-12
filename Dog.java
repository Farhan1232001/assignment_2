
class Dog
{
    private String breed;
    private String name;
    private Paw frontLeftPaw;
    private Paw frontRightPaw;
    private Paw backLeftPaw;
    private Paw backRightPaw;

    Dog()
    {
        frontLeftPaw = new Paw(0);
        frontRightPaw = new Paw(1);
        backLeftPaw = new Paw(2);
        backRightPaw = new Paw(3);
    }

    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setFrontLeftPaw(Paw paw)
    {
        frontLeftPaw = paw;
    }
    public void setFrontRightPaw(Paw paw)
    {
        frontRightPaw = paw;
    }
    public void setBackLeftPaw(Paw paw)
    {
        frontLeftPaw = paw;
    }
    public void setBackRightPaw(Paw paw)
    {
        backRightPaw = paw;
    }

    @Override
    public String toString()
    {
        return String.format("Dog[%s, %s, %s, %s, %s, %s]", breed, name, frontLeftPaw, frontRightPaw, backLeftPaw, backRightPaw);
    }
}