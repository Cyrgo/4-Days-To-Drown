public class BoatItem extends Item{

    private BoatItemType boatItemType;

    public BoatItem(BoatItemType boatItemType, int amount) {
        super(boatItemType.getName(), amount);
        this.boatItemType = boatItemType;
    }
}
