public class ClearSkies extends Weather{

    ClearSkies(String name) {
        super(name);
    }

    @Override
    public void weatherEffect() {
        System.out.println("The skies are clear. You are free to explore.");
    }
}
