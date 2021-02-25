public class Food extends Consumable {

    private FoodType foodType;

    public Food(FoodType foodType, int amount) {
        super(foodType.getName(), amount);
        this.foodType = foodType;
    }

    public boolean isCookable() {
        return this.foodType.isCookable();
    }

    public int getKcal() {
        return this.foodType.getKcal();
    }
    
}