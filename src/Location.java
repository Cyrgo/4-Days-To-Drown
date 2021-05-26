import java.util.HashMap;
import java.util.List;

public class Location {
    private String name;
    private String description;
    private Player player;
    private Item item;

    Location(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void enterLocation(Player player) {
        this.player = player;
        player.setLocation(this);
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public void leaveLocation() {
        if (this.player == null) {
            throw new NullPointerException("can't leave the island if you're not here");
        }
        this.player.setLocation(null);
        this.player = null;
    }

    public Item getRandomItem() {
        ItemRarity rarity = ItemRarity.randomRarity();
        HashMap<ItemRarity, List<Item>> lootTable = getLootTable();
        List<Item> itemList = lootTable.get(rarity);
        System.out.println(itemList);
        return itemList.get((int) (Math.random() * itemList.size()));
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

    public HashMap<ItemRarity, List<Item>> getLootTable() {
        return null;
    }
}
