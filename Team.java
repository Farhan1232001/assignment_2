import java.util.ArrayList;

class Team
{
    private int code;
    private ArrayList<Player> players;

    Team()
    {
        this.players = new ArrayList<Player>();
    }

    public void addPlayer(Player player)
    {
        
        this.players.add(player);
    }

    public void setCode(int code)
    {
        this.code = code;
    }

    @Override
    public String toString()
    {
        return String.format("team[%d, %s]", code, players.toString());
    }
}