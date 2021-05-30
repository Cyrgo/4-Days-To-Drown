import java.util.ArrayList;
import java.util.List;

public class Boat {
    private boolean cantTravel;
    private int durability;
    private int invLimit;
    private final int fuel;
    private Player player;
    private Weather weather;

    private List<Item> inv = new ArrayList<>();

    public Boat() {
        this.durability = 100;
        this.fuel = 100;
        this.invLimit = 40;
    }

    public Boat(int durability, int fuel, int speed) {
        this.durability = durability;
        this.fuel = fuel;
    }

    public boolean isNotTravel() {
        return cantTravel;
    }

    public boolean isGood() {
        return this.durability >= 1;
    }

    public void boardBoat(Player player) {
        this.player = player;
        player.setBoat(this);
    }

    public void canTravel() {
        cantTravel = false;
    }

    public void setCantTravel() {
        cantTravel = true;
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

    public void takeDmg(int dmg) {
        durability -= dmg;
        System.out.println("Your boat lost " + dmg + " durability.");
    }
}
