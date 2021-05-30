public class BoatItem extends Item {

    private final BoatItemType boatItemType;

    public BoatItem(BoatItemType boatItemType, int amount) {
        super(boatItemType.getName());
        this.boatItemType = boatItemType;
    }
}
