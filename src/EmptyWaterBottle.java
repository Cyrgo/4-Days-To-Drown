public class EmptyWaterBottle extends UsableItem{
    public EmptyWaterBottle(String name, int amount, int durability) {
        super(name, amount, durability);
    }

    @Override
    public int getAmount() {
        return super.getAmount();
    }

    @Override
    public int getDurability() {
        return super.getDurability();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setAmount(int amount) {
        super.setAmount(amount);
    }

    @Override
    public void setDurability(int durability) {
        super.setDurability(durability);
    }
}
