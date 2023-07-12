
class Player
{
    private String name;
    private boolean expert;

    Player(String name, boolean expert)
    {
        this.name = name;
        this.expert = expert;
    }

    @Override
    public String toString()
    {
        return String.format("team[%s, %b]", name, expert);
    }
}