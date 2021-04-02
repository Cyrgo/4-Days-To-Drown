public class WeatherGenerator {
    WeatherType weatherType;

    public WeatherType genWeather() {
        int rng = (int) (1+ Math.random() * 100);
        for (WeatherType value : WeatherType.values()) {
            if (rng <= value.to && rng >= value.from) {

                return value;

            }
        }
        return WeatherType.CLEAR;
    }
}
