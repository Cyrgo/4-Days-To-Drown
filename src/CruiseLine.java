import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CruiseLine extends Location {

    CruiseLine(String name, String description) {
        super(name, description);
    }

    public HashMap<ItemRarity, List<Item>> getLootTable() {
        HashMap<ItemRarity, List<Item>> lootTable = new HashMap<>();
        List<Item> commonLoot = new ArrayList<>();
        List<Item> uncommonLoot = new ArrayList<>();
        List<Item> rareLoot = new ArrayList<>();
        //Common Loot Objects
        Food snack = new Food(FoodType.SNACK, 1);
        Food spam = new Food(FoodType.CAN_SPAM, 1);
        Food tuna = new Food(FoodType.CAN_TUNA, 1);
        commonLoot.add(snack);
        commonLoot.add(spam);
        commonLoot.add(tuna);
        //Uncommon Loot Objects
        BoatItem jerryCan = new BoatItem(BoatItemType.JERRY_CAN, 1);
        SimpleConsumable medicine = new SimpleConsumable(ConsumableType.MEDICINE, 1);
        uncommonLoot.add(jerryCan);
        uncommonLoot.add(medicine);
        //Rare Loot Objects
        Alcohol alcohol = new Alcohol(AlcoholType.randomAlcohol(), 1);
        rareLoot.add(alcohol);
        lootTable.put(ItemRarity.COMMON, commonLoot);
        lootTable.put(ItemRarity.UNCOMMON, uncommonLoot);
        lootTable.put(ItemRarity.RARE, rareLoot);
        return lootTable;
    }
}
