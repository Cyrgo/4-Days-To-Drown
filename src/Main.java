import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main game = new Main();
        game.startGame();
    }

    public void welcomeMessage() {
        System.out.println("Welcome to 4 Days to Drown!");
        System.out.println("You must survive a zombie apocalypse while living off your boat.");
        System.out.println("You must manage your stats and resources against punishing RNG.");
        System.out.println("Good Luck!");
        System.out.println("What is your name?");
    }

    public void startGame() {
        welcomeMessage();
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        Player player = new Player(name);
        Boat boat = new Boat();
        boat.boardBoat(player);
        var location = LocationGenerator.createLocation();
        boat.leaveBoat();
        location.enterLocation(player);
        var randomItem = location.getRandomItem();
        player.pickUp(randomItem);
        player.printInv();
        startGame();
    }

}