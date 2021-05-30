public class Rain extends Weather {

    private WaterCollector waterCollector;

    Rain(String name) {
        super(name);
    }

    @Override
    public void weatherEffect(Boat boat, Player player) {
        setBoat(boat);
        boat.canTravel();
        System.out.println("It is raining.");
    }
}

