public class Rain extends Weather {

    private Boat boat;
    private Player player;
    private WaterCollector waterCollector;

    Rain(String name) {
        super(name);
    }

    @Override
    public void weatherEffect(Boat boat, Player player) {
        System.out.println("It is raining.");
    }
}

