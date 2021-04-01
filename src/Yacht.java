import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Yacht extends Location{

    Yacht(String name, String description) {
        super(name, description);
    }

    public HashMap<ItemRarity, List<Item>> getLootTable() {
        HashMap<ItemRarity, List<Item>> lootTable = new HashMap<ItemRarity, List<Item>>();
        List<Item> commonLoot = new ArrayList<Item>();
        List<Item> uncommonLoot = new ArrayList<Item>();
        List<Item> rareLoot = new ArrayList<Item>();
        //Common Loot Objects
        Food snack = new Food(FoodType.SNACK, 1);
        Food tuna = new Food(FoodType.CAN_TUNA,1);
        commonLoot.add(snack);
        commonLoot.add(tuna);
        //Uncommon Loot Objects
        SimpleConsumable firstAid = new SimpleConsumable(ConsumableType.FIRST_AID_KIT,1);
        Food spam = new Food(FoodType.CAN_SPAM,1);
        uncommonLoot.add(firstAid);
        uncommonLoot.add(spam);
        //Rare Loot Objects
        Alcohol alcohol = new Alcohol(AlcoholType.randomAlcohol(),1);
        BoatItem jerryCan = new BoatItem(BoatItemType.JERRY_CAN,1);
        BoatItem repairParts = new BoatItem(BoatItemType.REPAIR_PARTS,1);
        rareLoot.add(alcohol);
        uncommonLoot.add(jerryCan);
        uncommonLoot.add(repairParts);
        lootTable.put(ItemRarity.COMMON, commonLoot);
        lootTable.put(ItemRarity.UNCOMMON, uncommonLoot);
        lootTable.put(ItemRarity.RARE, rareLoot);
        return lootTable;
    }
}
