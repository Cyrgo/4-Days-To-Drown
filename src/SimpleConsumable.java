public class SimpleConsumable extends Consumable{
    private ConsumableType consumableType;

    public SimpleConsumable(ConsumableType consumableType, int amount) {
        super(consumableType.getName(), amount);
    }
}
