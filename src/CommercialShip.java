import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CommercialShip extends Location {

    CommercialShip(String name, String description) {
        super(name, description);
    }

    public HashMap<ItemRarity, List<Item>> getLootTable() {
        HashMap<ItemRarity, List<Item>> lootTable = new HashMap<ItemRarity, List<Item>>();
        List<Item> commonLoot = new ArrayList<Item>();
        List<Item> uncommonLoot = new ArrayList<Item>();
        List<Item> rareLoot = new ArrayList<Item>();
        //Common Loot Objects
        Food snack = new Food(FoodType.SNACK, 1);
        Food spam = new Food(FoodType.CAN_SPAM,1);
        Food tuna = new Food(FoodType.CAN_TUNA,1);
        commonLoot.add(snack);
        commonLoot.add(spam);
        commonLoot.add(tuna);
        //Uncommon Loot Objects
        BoatItem jerryCan = new BoatItem(BoatItemType.JERRY_CAN,1);
        BoatItem repairParts = new BoatItem(BoatItemType.REPAIR_PARTS,1);
        uncommonLoot.add(jerryCan);
        uncommonLoot.add(repairParts);
        //Rare Loot Objects
        Alcohol alcohol = new Alcohol(AlcoholType.randomAlcohol(),1);
        BoatItem upgradeParts = new BoatItem(BoatItemType.UPGRADE_PARTS,1);
        rareLoot.add(alcohol);
        lootTable.put(ItemRarity.COMMON, commonLoot);
        lootTable.put(ItemRarity.UNCOMMON, uncommonLoot);
        lootTable.put(ItemRarity.RARE, rareLoot);
        return lootTable;
    }
}
