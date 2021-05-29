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

    public String getDescription() {
        return this.description;
    }

    public String getName() {
        return this.name;
    }

    public HashMap<ItemRarity, List<Item>> getLootTable() {
        return null;
    }

    public Item getRandomItem() {
        ItemRarity rarity = ItemRarity.randomRarity();
        HashMap<ItemRarity, List<Item>> lootTable = getLootTable();
        List<Item> itemList = lootTable.get(rarity);
        //Prints out item list with memory address
        //System.out.println(itemList);
        return itemList.get((int) (Math.random() * itemList.size()));
    }

    public void printLocation() {
        System.out.println(name);
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
