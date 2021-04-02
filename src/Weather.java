public class Weather {
    private Boat boat;
    private Item item;
    private Player player;
    private String description;
    private String name;
    private WeatherType weatherType;

    Weather(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }
}
