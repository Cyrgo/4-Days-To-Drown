public class Weather {

    Boat boat;
    Player player;

    private final String name;

    Weather(String name) {
        this.name = name;
    }

    public static Weather createWeather() {
        return switch (WeatherType.randomWeather()) {
            case CLEAR -> new ClearSkies("Clear Skies");
            case RAIN -> new Rain("Rain");
            case WIND -> new Wind("Wind");
            case STORM -> new LightningStorm("Storm");
            case HEATWAVE -> new HeatWave("Heatwave");
            case TIDALWAVE -> new TidalWave("Tidal Wave");
            case HURRICANE -> new Hurricane("Hurricane");
        };
    }

    public String getName() {
        return this.name;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void weatherEffect(Boat boat, Player player) {
    }
}
