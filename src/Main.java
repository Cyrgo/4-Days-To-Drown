import java.util.Scanner;

public class Main {
    private Location location;
    private Item randomItem;

    public Main() {
    }

    public static void main(String[] args) {
        Main game = new Main();
        //game.welcomeMessage();
        game.logicLoop();
    }

    public void location() {
        var location = Location.createLocation();
        location.printLocation();
        var randomItem = location.getRandomItem();
        randomItem.printItem();
    }

    public void logicLoop() {
        String name = "Test";
        Player player = new Player(name);
        Boat boat = new Boat();
        boat.boardBoat(player);

        weather();

        setLocation(Location.createLocation());
        setRandomItem(Location.createLocation().getRandomItem());
        location.printLocation();

        boat.leaveBoat();

        location.enterLocation(player);
        player.pickUp(randomItem);
        player.printInv();
        location.leaveLocation();

        boat.boardBoat(player);
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setRandomItem(Item randomItem) {
        this.randomItem = randomItem;
    }

    public void weather() {
        var weather = Weather.createWeather();
        weather.weatherEffect();
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