import java.util.HashMap;
import java.util.List;

public abstract class Location {
    private String name;
    private String description;
    private String size;
    private Player player;
    private Item item;

    Location(String name, String description, String size) {
        this.name = name;
        this.description = description;
        this.size = size;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public void enterLocation(Player player) {
        this.player = player;
        player.setLocation(this);
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
        HashMap<ItemRarity,List<Item>> lootTable = getLootTable();
        List<Item> itemList = lootTable.get(rarity);

    }

    public abstract HashMap<ItemRarity, List<Item>> getLootTable();
}
