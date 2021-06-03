import java.util.*;

public class Player {

    private Boat boat;
    private int currentH2o;
    private int currentHp;
    private int currentKcal;
    private int maxH2o;
    private int maxHp;
    private int maxKcal;
    private List<Item> inv = new ArrayList<>();
    private Location location;
    private String name;

    public Player(String name) {
        this.name = name;
        this.maxHp = 100;
        this.maxH2o = 100;
        this.maxKcal = 100;
        this.currentHp = 75;
        this.currentH2o = 75;
        this.currentKcal = 75;
        //delete final if you have level system
        int invLimit = 20;
    }

    public boolean isAlive() {
        return this.currentHp >= 1 && this.currentH2o >= 1 && this.currentKcal >= 1;
    }

    public int getH2o() {
        return this.currentH2o;
    }

    public int getHp() {
        return this.currentHp;
    }

    public int getKcal() {
        return this.currentKcal;
    }

    public int getMaxH2o() {
        return this.maxH2o;
    }

    public int getMaxHp() {
        return this.maxHp;
    }

    public int getMaxKcal() {
        return this.maxKcal;
    }

    public String getName() {
        return this.name;
    }

    public void boardBoat(Boat boat) {
        this.boat = boat;
        boat.setPlayer(this);
    }

    public void consume(Consumable consumable) {
        consumable.consumableAbility();
    }

    public void drinkAlcohol(Alcohol alcohol) {
    }

    public void eat(Food food) {
        if (food.getAmount() <= 0) {
            System.out.println("You are out of " + food.getName() + "s");
        } else {
            setKcal(this.currentKcal + food.getKcal());
            //inv.delitem
        }
    }

    public void enterLocation(Location location) {
        this.location = location;
        location.setPlayer(this);
    }

    public void fullHeal() {
        setHp(this.maxHp);
    }

    public void healHp(int heal) {
        setHp(this.currentHp + heal);
    }

    public void invSort() {
        inv.sort(((o1, o2) -> o1.getName().compareTo(o2.getName())));
    }

    public void leaveBoat() {
        if (this.boat == null) {
            throw new NullPointerException("ERROR: The player is not on the boat.");
        }
        this.boat.setPlayer(null);
        this.boat = null;
    }

    public void leaveLocation() {
        if (this.location == null) {
            throw new NullPointerException("Error: player is not in a location");
        }
        this.location.setPlayer(null);
        this.location = null;
    }

    public void loseH2o(int h2oLoss) {
        setH2o(this.currentH2o - h2oLoss);
    }

    public void pickUp(Item item) {
        if (this.inv.size() == 20) {
            System.out.println("Your inventory is full.");
        } else {
            this.inv.add(item);
            item.setAmount(1);
        }
    }

    public void printInv() {
        invSort();

        for (Item item : inv) {
            System.out.println(item.getName() + ": " + item.getAmount());
        }
    }

    /*public void printArray() {
        Object[] array = inv.toArray(new Object[inv.size()]);
        System.out.println(Arrays.toString(array));
    }*/

    public void printKcal() {
        System.out.println(currentKcal);
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }

    public void setH2o(int h2o) {
        this.currentH2o = h2o;
    }

    public void setHp(int hp) {
        this.currentHp = hp;
    }

    public void setKcal(int kcal) {
        if (kcal > maxKcal) {
            this.currentKcal = this.maxKcal;
            System.out.println("You are full");
        } else {
            this.currentKcal = kcal;
        }
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setMaxH2o(int maxH2o) {
        this.maxH2o = maxH2o;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public void setMaxKcal(int maxKcal) {
        this.maxKcal = maxKcal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void takeDmg(int dmg) {
        setHp(this.currentHp - dmg);
    }

    public void use(UsableItem usableItem) {
        usableItem.itemAbility();
    }
}