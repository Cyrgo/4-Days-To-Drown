public class WaterCollector extends UsableItem {
    private final int waterCollectorStorage = 0;
    private final int maxCollectorStorage = 1;
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
