public class Alcohol extends Consumable{
    private AlcoholType alcoholType;

    public Alcohol(AlcoholType alcoholType, int amount) {
        super(alcoholType.getName(), amount);
        this.alcoholType = alcoholType;
    }
}
