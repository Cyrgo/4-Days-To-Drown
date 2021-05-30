import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CabinCruiser extends Location{

    CabinCruiser(String name, String description) {
        super(name, description);
    }

    @Override
    public HashMap<ItemRarity, List<Item>> getLootTable() {
        HashMap<ItemRarity, List<Item>> lootTable = new HashMap<>();
        List<Item> commonLoot = new ArrayList<>();
        List<Item> uncommonLoot = new ArrayList<>();
        List<Item> rareLoot = new ArrayList<>();
        //Common Loot Objects
        Food snack = new Food(FoodType.SNACK, 1);
        Food tuna = new Food(FoodType.CAN_TUNA,1);
        commonLoot.add(snack);
        commonLoot.add(tuna);
        //Uncommon Loot Objects
        Food spam = new Food(FoodType.CAN_SPAM,1);
        SimpleConsumable firstAid = new SimpleConsumable(ConsumableType.FIRST_AID_KIT, 1);
        uncommonLoot.add(spam);
        uncommonLoot.add(firstAid);
        //Rare Loot Objects
        Alcohol alcohol = new Alcohol(AlcoholType.randomAlcohol(),1);
        BoatItem jerryCan = new BoatItem(BoatItemType.JERRY_CAN,1);
        rareLoot.add(alcohol);
        rareLoot.add(jerryCan);
        lootTable.put(ItemRarity.COMMON, commonLoot);
        lootTable.put(ItemRarity.UNCOMMON, uncommonLoot);
        lootTable.put(ItemRarity.RARE, rareLoot);
        return lootTable;
    }
}
