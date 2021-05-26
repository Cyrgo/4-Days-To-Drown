public class Rain extends Weather {

    private Boat boat;
    private Player player;
    private WaterCollector waterCollector;

    Rain(String name) {
        super(name);
    }

    @Override
    public void weatherEffect() {
        System.out.println("It is raining.");
    }
}

