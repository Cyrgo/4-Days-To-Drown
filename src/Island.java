import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Island extends Location {

    Island(String name, String description) {
        super(name, description);
    }

    @Override
    public HashMap<ItemRarity, List<Item>> getLootTable() {
        HashMap<ItemRarity, List<Item>> lootTable = new HashMap<ItemRarity, List<Item>>();
        List<Item> commonLoot = new ArrayList<Item>();
        List<Item> uncommonLoot = new ArrayList<Item>();
        List<Item> rareLoot = new ArrayList<Item>();
        //Common Loot Objects
        Food mango = new Food(FoodType.MANGO,1);
        Food pineapple = new Food(FoodType.PINEAPPLE,1);
        commonLoot.add(mango);
        commonLoot.add(pineapple);
        //Uncommon Loot Objects
        Food banana = new Food(FoodType.BANANA, 1);
        uncommonLoot.add(banana);
        //Rare Loot Objects
        Food coconut = new Food(FoodType.COCONUT, 1);
        rareLoot.add(coconut);
        lootTable.put(ItemRarity.COMMON, commonLoot);
        lootTable.put(ItemRarity.UNCOMMON, uncommonLoot);
        lootTable.put(ItemRarity.RARE, rareLoot);
        return lootTable;
    }

}
