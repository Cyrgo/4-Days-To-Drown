import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OilRig extends Location {

    OilRig(String name, String description) {
        super(name, description);
    }

    @Override
    public HashMap<ItemRarity, List<Item>> getLootTable() {
        HashMap<ItemRarity, List<Item>> lootTable = new HashMap<ItemRarity, List<Item>>();
        List<Item> commonLoot = new ArrayList<Item>();
        List<Item> uncommonLoot = new ArrayList<Item>();
        List<Item> rareLoot = new ArrayList<Item>();
        Food snack = new Food(FoodType.SNACK,1);
        SimpleConsumable firstAidKit = new SimpleConsumable(ConsumableType.FIRST_AID_KIT, 1);
        SimpleConsumable medicine = new SimpleConsumable(ConsumableType.MEDICINE,1);
        commonLoot.add(snack);
        uncommonLoot.add(firstAidKit);
        rareLoot.add(medicine);
        lootTable.put(ItemRarity.COMMON, commonLoot);
        lootTable.put(ItemRarity.UNCOMMON, uncommonLoot);
        lootTable.put(ItemRarity.RARE, rareLoot);
        return lootTable;
    }
}
