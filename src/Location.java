import java.util.HashMap;
import java.util.List;

public class Location {
    private final String name;
    private final String description;
    private Player player;

    Location(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public static Location createLocation() {
        return switch (LocationType.randomLocation()) {
            case CABIN_CRUISER -> new CabinCruiser("Cabin Cruiser", "A Cabin Cruiser");
            case COMMERCIAL_SHIP -> new CommercialShip("Commercial Ship", "A commercial ship.");
            case CRUISE_LINE -> new CruiseLine("Cruise Line", "A cruise line.");
            case ISLAND -> new Island("Island", "An island.");
            case OIL_RIG -> new OilRig("Oil rig", "An oil rig.");
            case YACHT -> new Yacht("Yacht", "A yacht");
        };
    }

    public void enterLocation(Player player) {
        this.player = player;
        player.setLocation(this);
    }

    public String getDescription() {
        return this.description;
    }

    public String getName() {
        return this.name;
    }

    public Item getRandomItem() {
        ItemRarity rarity = ItemRarity.randomRarity();
        HashMap<ItemRarity, List<Item>> lootTable = getLootTable();
        List<Item> itemList = lootTable.get(rarity);
        //Prints out item list with memory address
        //System.out.println(itemList);
        return itemList.get((int) (Math.random() * itemList.size()));
    }

    public HashMap<ItemRarity, List<Item>> getLootTable() {
        return null;
    }

    public void leaveLocation() {
        if (this.player == null) {
            throw new NullPointerException("Error: player is not in a location");
        }
        this.player.setLocation(null);
        this.player = null;
    }

    public void printLocation() {
        System.out.println(name);
    }
}
