public class ClearSkies extends Weather{

    ClearSkies(String name) {
        super(name);
    }

    @Override
    public void weatherEffect(Boat boat, Player player) {
        System.out.println("The skies are clear. You are free to explore.");
    }
}
