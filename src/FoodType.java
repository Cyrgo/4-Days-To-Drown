public enum FoodType {
    BANANA(false, "Banana",15,1,30),
    COCONUT(false, "Coconut",10,31,60),
    SNACK(false, "Snack",15,61,100),
    SMALLFISH(true, "Small Fish",50, 1,30),
    MEDIUMFISH(true, "Medium Fish",100,31,60),
    LARGEFISH(true, "Small Fish",150,61,100);

    private boolean isCookable;
    private String name;
    private int kcal;
    private int from;
    private int to;

    FoodType(boolean isCookable, String name, int kcal, int from, int to) {
        this.name = name;
        this.kcal = kcal;
        this.from = from;
        this.to = to;
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
