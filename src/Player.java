import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int maxHp;
    private int currentHp;
    private int maxH2o;
    private int currentH2o;
    private int maxKcal;
    private int currentKcal;
    //delete final if you have level system
    private final int invLimit;
    private Boat boat;
    private Location location;

    private List<Item> inv = new ArrayList<Item>();

    public Player(String name) {
        this.name = name;
        this.maxHp = 100;
        this.currentHp = 75;
        this.maxH2o = 100;
        this.currentH2o = 75;
        this.maxKcal = 100;
        this.currentKcal = 75;
        this.invLimit = 20;
        this.inv = inv;

    }

    public boolean isAlive() {
        return this.currentHp > 0;
    }

    public String getName() {
        return this.name;
    }

    public int getMaxHp() {
        return this.maxHp;
    }

    public int getHp() {
        return this.currentHp;
    }

    public int getMaxH2o() {
        return this.maxH2o;
    }

    public int getH2o() {
        return this.currentH2o;
    }

    public int getMaxKcal() {
        return this.maxKcal;
    }

    public int getKcal() {
        return this.currentKcal;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.currentHp = hp;
    }

    public void setMaxH2o(int maxH2o) {
        this.maxH2o = maxH2o;
    }

    public void setH2o(int h2o) {
        this.currentH2o = h2o;
    }

    public void setMaxKcal(int maxKcal) {
        this.maxKcal = maxKcal;
    }

    public void setKcal(int kcal) {
        if (kcal > maxKcal) {
            this.currentKcal = this.maxKcal;
            System.out.println("You are full");
        } else {
            this.currentKcal = kcal;
        }
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void pickUp(Item item) {
        if (this.inv.size() == 20) {
            System.out.println("Your inventory is full.");
            return;
        }
        this.inv.add(item);
    }

    public void consume(Consumable consumable) {
        consumable.consumableAbility();
    }

    public void eat(Food food) {
        if (food.getAmount() <= 0) {
            System.out.println("You are out of " + food.getName() + "s");
        } else {
            setKcal(this.currentKcal + food.getKcal());
            //inv.delitem
        }
    }

    public void fullHeal() {
        setHp(this.maxHp);
    }

    public void healHp(int heal) {
        setHp(this.currentHp + heal);
    }

    public void printInv() {
        for (Item item : inv) {
            System.out.println(item.getName());
        }
    }

    public void printKcal() {
        System.out.println(currentKcal);
    }

    public void takeDamage(int dmg) {
        setHp(this.currentHp - dmg);
    }

    public void use(UsableItem usableItem) {
        usableItem.itemAbility();
    }



}
