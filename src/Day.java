public class Day {
    private int day;

    Day() {
    }

    public Day(int day) {
        this.day = day;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void printDay() {
        System.out.println("You survived " + day + " day(s).");
    }

    public void addDay() {
        this.day += 1;
    }
}
