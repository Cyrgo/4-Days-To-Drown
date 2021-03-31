public enum AlcoholType {
    ABSINTHE("Absinthe",1,-10),
    ARDBEG_10("Ardbeg 10",2,-10),
    BEER("Beer",3,-5),
    DALMORE_12("Dalmore 12",4,-10),
    DALMORE_16("Dalmore 16",5,-10),
    DALMORE_CIGAR_MALT("Dalmore Cigar Malt",6,-10),
    DALMORE_PORT_WOOD("Dalmore Port Wood",7,-10),
    DRAGONS_MILK("Dragon's Milk",8,-5),
    EVERCLEAR("Everclear",9,-20),
    GLENFIDDICH_12("Glenfiddich 12",10,-10),
    GLENFIDDICH_21("Glenfiddich 21",11,-10),
    GLENMORANGIE_NECTOR_D_OR("Glenmorangie Nector D Or",12,-10),
    GRAPPA("Grappa",13,-10),
    HONEY_MEAD("Honey Mead",14,-5),
    JACK_DANIELS("Jack Daniels",15,-10),
    JAMESON("Jameson",16,-10),
    LAGAVULLIN_16("Lagavullin 16",17,-10),
    LAPHROAIG_SELECT("Laphroaig Select",18,-10),
    LARK_SYMPHONY_NO_1("Lark Symphony No. 1",19,-10),
    MAKERS_MARK("Makers Mark",20,-10),
    MALORT("Malort",21,-10),
    RUM("Rum",22,-10),
    SCOTCH("Scotch",23,-10),
    STARWARD("Starward",24,-10),
    TALISKER_10("Talisker 10",25,-10),
    TALISKER_15("Talisker 15",26,-10),
    TALISKER_18("Talisker 18",27,-10),
    TALISKER_STORM("Talisker Storm",28,-10),
    TEQUILA("Tequila",29,-10),
    THE_GOSPEL_STRAIGHT_RYE("The Gospel Straight Rye",30,-10),
    VIKINGS_BLOD("Vikings Blod",31,-10),
    VODKA("Vodka",32,-10),
    WHISKEY("Whiskey",33,-10),
    WILD_TURKEY("Wild Turkey",34,-10),
    WINE("Wine",35,-5);

    private String name;
    private int num;
    private int h2o;

    AlcoholType(String name, int num, int h2o) {
        this.name = name;
        this.num = num;
        this.h2o = h2o;
    }

    public String getName() {
        return this.name;
    }

    public static AlcoholType randomAlcohol() {
        int rng = (int) (1+ Math.random() * 35);
        for (AlcoholType value: AlcoholType.values()) {
            if (rng == value.num) {
                return value;
            }
        }
        return AlcoholType.BEER;
    }
}

