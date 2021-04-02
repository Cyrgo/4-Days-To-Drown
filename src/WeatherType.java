public enum WeatherType {
    //29%
    //normal day, locGen, canTravel
    CLEAR(true, 1, 29, "You wake a to nice sunny day, the clouds are clear and there is no chance of bad weather."),
    //20%
    //can collect rainwater, locGen, canTravel
    RAIN(true, 30, 49, "Rain"),
    //10%
    //Uses more fuel to travel, locGen, canTravel
    WIND(true, 50, 59, "Windy"),
    //10%
    STORM(false, 60, 69, "Lightning Storm"),
    //5%
    //take damage, cabin cruiser takes damage, !locGen, !canTravel
    TIDALWAVE(false, 70, 74, "Tidal Wave"),
    //5%
    //more nutrition is lost, locGen, canTravel
    HEATWAVE(true, 75, 79, "Heat Wave"),
    //5%
    //severe damage to cabin cruiser, !locGen, !canTravel
    HURRICANE(false, 80, 84, "Hurricane"),
    //5%
    //cabin cruiser takes damage, !locGen, !canTravel
    HAIL(false, 85, 89, "Hail"),
    //5%
    //more nutrition is lost, !locGen, !canTravel
    SNOW(true, 90, 94, "Snow"),
    //6%
    //severe nutrition loss, hypothermia, !locGen, !canTravel
    BLIZZARD(false, 95, 100, "Blizzard");

    public boolean canTravel;
    public int from;
    public int to;
    public String name;

    //weatherDesc = Weather Description
    //descWeather = Description of weather in the form of a string.
    WeatherType(boolean traversable, int f, int t, String name) {
        this.canTravel = canTravel;
        this.from = f;
        this.to = t;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
