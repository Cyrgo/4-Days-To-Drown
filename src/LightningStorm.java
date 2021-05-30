public class LightningStorm extends Weather {

    LightningStorm(String name) {
        super(name);
    }

    @Override
    public void weatherEffect(Boat boat, Player player) {
        setBoat(boat);
        boat.canTravel();
        System.out.println("The crash and flash of the storm wakes you.");
        System.out.println("It is best to stay inside.");
    }
}
