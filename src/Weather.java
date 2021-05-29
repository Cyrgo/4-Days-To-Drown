public class Weather {

    private final String name;

    Weather(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
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

    public void weatherEffect() {
    }
}
