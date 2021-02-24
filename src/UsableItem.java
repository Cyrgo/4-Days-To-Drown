public abstract class UsableItem extends Item {

    private int durability;

    public UsableItem(String name, int amount, int durability) {
        super(name, amount);
        this.durability = durability;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public void printDurability() {
        System.out.println(this.durability);
    }

    public void itemAbility() {
        setDurability(getDurability() - 1);
    }
}
