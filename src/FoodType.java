public enum FoodType {
    BANANA(false, "Banana",15),
    COCONUT(false, "Coconut",10),
    SNACK(false, "Snack",15),
    SMALLFISH(true, "Small Fish",50),
    MEDIUMFISH(true, "Medium Fish",100),
    LARGEFISH(true, "Small Fish",150);

    private boolean isCookable;
    private String name;
    private int kcal;


    FoodType(boolean isCookable, String name, int kcal) {
        this.name = name;
        this.kcal = kcal;
    }

    public boolean isCookable() {
        return this.isCookable;
    }

    public String getName() {
        return this.name;
    }

    public int getKcal() {
        return this.kcal;
    }

}
