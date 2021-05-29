import java.util.ArrayList;
import java.util.List;

public class Boat {
    private int durability;
    private int invLimit;
    private int fuel;
    private Player player;
    private Weather weather;

    private List<Item> inv = new ArrayList<Item>();

    public Boat() {
        this.durability = 100;
        this.fuel = 100;
        this.inv = inv;
        this.invLimit = 40;
    }

    public Boat(int durability, int fuel, int speed) {
        this.durability = durability;
        this.fuel = fuel;
    }

    public void boardBoat(Player player) {
        this.player = player;
        player.setBoat(this);
    }

    public void leaveBoat() {
        if (this.player == null) {
            throw new NullPointerException("ERROR: The player is not on the boat.");
        }
        this.player.setBoat(null);
        this.player = null;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
