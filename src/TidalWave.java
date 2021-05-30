public class TidalWave extends Weather {

    TidalWave(String name) {
        super(name);
    }

    @Override
    public void weatherEffect(Boat boat, Player player) {
        setBoat(boat);
        boat.setCantTravel();
        System.out.println("You are violently awoken by a massive tidal wave hitting your boat.");
        boat.takeDmg(30);
    }
}
