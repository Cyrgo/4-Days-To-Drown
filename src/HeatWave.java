public class HeatWave extends Weather {
    private Player player;

    HeatWave(String name) {
        super(name);
    }

    @Override
    public void weatherEffect(Boat boat, Player player) {
        setPlayer(player);
        System.out.println("It is extremely hot today. Make sure to stay hydrated.");
        player.loseH2o(30);
    }

    @Override
    public void setPlayer(Player player) {
        this.player = player;
    }
}
