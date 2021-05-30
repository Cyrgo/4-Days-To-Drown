public class HeatWave extends Weather {

    HeatWave(String name) {
        super(name);
    }

    @Override
    public void weatherEffect(Boat boat, Player player) {
        setBoat(boat);
        boat.canTravel();
        setPlayer(player);
        System.out.println("It is extremely hot today. Make sure to stay hydrated.");
        player.loseH2o(30);
    }

}
