public class WaterCollector extends UsableItem {
    private int waterCollectorStorage = 0;
    private int maxCollectorStorage = 1;
    private WeatherType weatherType;

    public WaterCollector(String name, int amount, int durability) {
        super(name, amount, durability);
    }

    @Override
    public void itemAbility() {
        super.itemAbility();
        System.out.println("Water.");
    }
}
