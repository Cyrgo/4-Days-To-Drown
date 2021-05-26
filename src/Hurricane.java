public class Hurricane extends Weather {

    private Boat boat;
    private Player player;

    Hurricane(String name) {
        super(name);
    }

    @Override
    public void weatherEffect() {
        System.out.println("Get ready. A hurricane is on its way.");
    }
}
