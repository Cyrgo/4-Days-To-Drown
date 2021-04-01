public enum ConsumableType {
    FIRST_AID_KIT("First Aid Kit",0,20,0),
    MEDICINE("Medicine",65,10,-10),
    FULL_WATER_BOTTLE("Full Water Bottle",0,0,15);

    private String name;
    private int cure;
    private int heal;
    private int h2o;

    ConsumableType(String name, int cure, int heal, int h2o) {
        this.name = name;
        this.cure = cure;
        this.heal = heal;
        this.h2o = h2o;
    }

    public String getName() {
        return this.name;
    }
}
