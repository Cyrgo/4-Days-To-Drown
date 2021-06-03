import java.util.Scanner;

public class Main {

    private Item randomItem;
    private Location location;
    private Weather weather;

    public static void main(String[] args) {
        Main game = new Main();
        //game.welcomeMessage();
        game.logicLoop();
    }

    public void location() {
        setLocation(Location.createLocation());
        setRandomItem(location.getRandomItem());
        location.printLocation();
    }

    public void logicLoop() {
        Day day = new Day();
        String name = "Test";
        Player player = new Player(name);
        Boat boat = new Boat();
        player.boardBoat(boat);

        while (player.isAlive() && boat.isGood()) {
            day.printDay();
            setWeather(Weather.createWeather());
            weather.weatherEffect(boat, player);

            if (boat.isNotTravel()) {
                System.out.println("The weather won't allow travel.");
            } else {
                location();

                player.leaveBoat();

                player.enterLocation(location);
                player.pickUp(randomItem);
                player.printInv();
                //player.printArray();
                player.leaveLocation();
                player.boardBoat(boat);
            }
            day.addDay();
        }
        if (!boat.isGood()) {
            System.out.println("The boat has been destroyed, you drowned.");
        } else if (!player.isAlive()) {
            System.out.println("You died.");
        }
        day.daysSurvived();
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setRandomItem(Item randomItem) {
        this.randomItem = randomItem;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public void welcomeMessage() {
        System.out.println("Welcome to 4 Days to Drown!");
        System.out.println("You must survive a zombie apocalypse while living off your boat.");
        System.out.println("You must manage your stats and resources against punishing RNG.");
        System.out.println("Good Luck!");
        System.out.println("What is your name?");
        //Scanner input = new Scanner(System.in);
        //String name = input.nextLine();
    }
}