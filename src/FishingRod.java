public class FishingRod extends UsableItem {
    public FishingRod(String name, int amount, int durability) {
        super(name, amount, durability);
    }
    @Override
    public void itemAbility() {
        super.itemAbility();
        System.out.println("Fishing.");
    }
}
