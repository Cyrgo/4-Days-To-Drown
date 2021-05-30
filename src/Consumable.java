public class Consumable extends Item {
    public Consumable(String name, int amount) {
        super(name);
    }

    public void consumableAbility() {
        setAmount(getAmount() - 1);
    }
}
