package nikolay.mine;

public class PlayerBPS {
    //defining the variable in the PlayerBPS object
    private String PlayerName;
    private int Count;


    //setters
    public void setPlayerName(String newPlayerName) {
        this.PlayerName = newPlayerName;
    }
    public void setCount(int newCount) {
        this.Count = newCount;
    }

    //getters
    public String getPlayerName() {
    return PlayerName;
    }
    public int getCount() {
        return Count;
    }

}