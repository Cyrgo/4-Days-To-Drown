public class Day {
    private int day;

    Day() {
        this.day = 1;
    }

    public Day(int day) {
        this.day = day;
    }

    public int getDay() {
        return this.day;
    }

    public void addDay() {
        this.day += 1;
    }

    public void printDay() {
        System.out.println("It is day: " + getDay() + ".");
    }

    public void daysSurvived() {
        System.out.println("You survived " + day + " day(s).");
    }

    public void setDay(int day) {
        this.day = day;
    }


}
