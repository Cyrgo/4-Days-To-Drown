public class Wind extends Weather {

    private Boat boat;
    private Player player;

    Wind(String name) {
        super(name);
    }

    @Override
    public void weatherEffect() {
        System.out.println("It is very windy today.");
    }
}
