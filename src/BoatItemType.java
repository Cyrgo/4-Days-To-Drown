public enum BoatItemType {
    JERRY_CAN("Jerry Can",25,0,0),
    REPAIR_PARTS("Repair Parts",0,25,0),
    UPGRADE_PARTS("Upgrade Parts",0,25,25);

    private String name;
    private int fuel;
    private int repair;
    private int upgrade;

    BoatItemType(String name, int fuel, int repair, int upgrade) {
        this.name = name;
        this.fuel = fuel;
        this.repair = repair;
        this.upgrade = upgrade;
    }

    public String getName() {
        return this.name;
    }
}
