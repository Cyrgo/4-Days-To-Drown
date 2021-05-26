public class LightningStorm extends Weather {

    private Boat boat;
    private Player player;

    LightningStorm(String name) {
        super(name);
    }

    @Override
    public void weatherEffect() {
        System.out.println("The crash and flash of the storm wakes you.");
        System.out.println("It is best to stay inside.");
    }
}
