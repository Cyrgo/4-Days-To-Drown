public class TidalWave extends Weather{

    TidalWave(String name) {
        super(name);
    }

    @Override
    public void weatherEffect() {
        System.out.println("You are violently awoken by a massive tidal wave hitting you.");
    }
}
