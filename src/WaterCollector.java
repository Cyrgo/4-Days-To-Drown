public class WaterCollector extends UsableItem {

    public WaterCollector(String name, int amount, int durability) {
        super(name, amount, durability);
    }

    @Override
    public void itemAbility() {
        super.itemAbility();
        System.out.println("Water.");
    }
}
