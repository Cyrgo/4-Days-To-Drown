public class HeatWave extends Weather {

    private Player player;

    HeatWave(String name) {
        super(name);
    }

    @Override
    public void weatherEffect() {
        System.out.println("It is extremely hot today. Make sure to stay hydrated.");
    }
}
