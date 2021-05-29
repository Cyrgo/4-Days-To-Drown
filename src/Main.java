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
        String name = "Test";
        Player player = new Player(name);
        Boat boat = new Boat();
        player.boardBoat(boat);

        while (player.isAlive()) {
            weather();
            location();

            player.leaveBoat();

            player.enterLocation(location);
            player.pickUp(randomItem);
            player.printInv();
            player.leaveLocation();

            player.boardBoat(boat);
            player.takeDamage(10);
        }
        System.out.println("You died.");
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

    public void weather() {
        setWeather(Weather.createWeather());
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