public class Hurricane extends Weather {

    private Boat boat;
    private Player player;

    Hurricane(String name) {
        super(name);
    }

    @Override
    public void weatherEffect(Boat boat, Player player) {
        setBoat(boat);
        boat.setCantTravel();
        setPlayer(player);
        System.out.println("Get ready. A hurricane is on its way.");
        boat.takeDmg(50);
        player.takeDmg(25);

    }
}
