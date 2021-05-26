public class TidalWave extends Weather{

    private Boat boat;
    private Player player;

    TidalWave(String name) {
        super(name);
    }

    @Override
    public void weatherEffect() {
        System.out.println("You are violently awoken by a massive tidal wave hitting you.");
    }
}
