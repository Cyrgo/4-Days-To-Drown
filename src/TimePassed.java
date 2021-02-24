public class TimePassed {
    private int day;

    public TimePassed(int day) {
        this.day = day;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void addDay() {
        this.day += 1;
    }

}
