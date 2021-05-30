public enum FoodType {
    BANANA(false, "Banana", 15, 0),
    CAN_SPAM(true, "Can of Spam", 30, 0),
    CAN_TUNA(true, "Can of Tuna", 20, 5),
    COCONUT(false, "Coconut", 10, 10),
    MANGO(false, "Mango", 5, 5),
    PINEAPPLE(false, "Pineapple", 10, 5),
    SNACK(false, "Snack", 50, -5),
    SMALLFISH(true, "Small Fish", 50, 0),
    MEDIUMFISH(true, "Medium Fish", 100, 0),
    LARGEFISH(true, "Small Fish", 150, 0);

    private boolean isCookable;
    private final String name;
    private final int kcal;
    private final int h2o;


    FoodType(boolean isCookable, String name, int kcal, int h2o) {
        this.name = name;
        this.kcal = kcal;
        this.h2o = h2o;
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
