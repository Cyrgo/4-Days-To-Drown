public enum WeatherType {
    //30%
    CLEAR(1, 29, "You wake a to nice sunny day, the clouds are clear and there is no chance of bad weather."),
    //10%
    RAIN(30, 49, "Rain"),
    //15%
    WIND(50, 64, "Windy"),
    //10%
    STORM(64, 73, "Lightning Storm"),
    //10%
    TIDALWAVE(73, 84, "Tidal Wave"),
    //10%
    HEATWAVE(85, 94, "Heat Wave"),
    //5%
    HURRICANE(94, 100, "Hurricane");

    public int from;
    public int to;
    public String name;

    WeatherType(int f, int t, String name) {
        this.from = f;
        this.to = t;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static Object randomWeather() {
        int rng = (int) (1+ Math.random() * 100);
        for (WeatherType value : WeatherType.values()) {
            if (rng <= value.to && rng >= value.from) {
                return value;
            }
        }
        return WeatherType.CLEAR;
    }

}
