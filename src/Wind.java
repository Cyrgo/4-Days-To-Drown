public class Wind extends Weather {

    Wind(String name) {
        super(name);
    }

    @Override
    public void weatherEffect(Boat boat, Player player) {
        setBoat(boat);
        boat.canTravel();
        System.out.println("It is very windy today.");
    }
}
