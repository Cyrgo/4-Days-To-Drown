import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CruiseLine extends Location{

    CruiseLine(String name, String description) {
        super(name, description);
    }

    public HashMap<ItemRarity, List<Item>> getLootTable() {
        HashMap<ItemRarity, List<Item>> lootTable = new HashMap<ItemRarity, List<Item>>();
        List<Item> commonLoot = new ArrayList<Item>();
        List<Item> uncommonLoot = new ArrayList<Item>();
        List<Item> rareLoot = new ArrayList<Item>();
        Food banana = new Food(FoodType.BANANA, 1);
        Food coconut = new Food(FoodType.COCONUT, 1);
        Food snack = new Food(FoodType.SNACK, 1);
        commonLoot.add(banana);
        uncommonLoot.add(coconut);
        rareLoot.add(snack);
        lootTable.put(ItemRarity.COMMON, commonLoot);
        lootTable.put(ItemRarity.UNCOMMON, uncommonLoot);
        lootTable.put(ItemRarity.RARE, rareLoot);
        return lootTable;
    }
}
