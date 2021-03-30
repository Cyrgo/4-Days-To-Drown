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

    public void createLocation() {
        LocationType.randomLocation();
        for (LocationType value: LocationType.values()) {
            if (value.name().equals(LocationType.CABIN_CRUISER.name())) {
                new CabinCruiser(LocationType.CABIN_CRUISER.getName(), "A cabin cruiser.");
            }
            else if (value.name().equals(LocationType.COMMERCIAL_SHIP.getName())) {
                new CommercialShip(LocationType.COMMERCIAL_SHIP.getName(), "A commercial ship.");
            }
            else if (value.name().equals(LocationType.CRUISE_LINE.getName())) {
                new CabinCruiser(LocationType.CRUISE_LINE.getName(), "A cruise line.");
            }
            else if (value.name().equals(LocationType.ISLAND.getName())) {
                new Island(LocationType.ISLAND.getName(),"An island.");
            }
            else if (value.name().equals(LocationType.OIL_RIG.getName())) {
                new OilRig(LocationType.OIL_RIG.getName(), "An oil rig.");
            }
            else {
                new Yatch(LocationType.YATCH.getName(), "A yatch.");
            }
        }
    }

    public void startGame() {
        welcomeMessage();
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        Player player = new Player(name);
        Boat boat = new Boat();
        createLocation();




    }

}