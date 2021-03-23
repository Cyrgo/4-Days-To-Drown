public enum AlcoholType {
    ABSINTHE("Absinthe"),
    ARDBEG_10("Ardbeg 10"),
    BEER("Beer"),
    DALMORE_12("Dalmore 12"),
    DALMORE_16("Dalmore 16"),
    DALMORE_CIGAR_MALT("Dalmore Cigar Malt"),
    DALMORE_PORT_WOOD("Dalmore Port Wood"),
    DRAGONS_MILK("Dragon's Milk"),
    EVERCLEAR("Everclear"),
    GLENFIDDICH_12("Glenfiddich 12"),
    GLENFIDDICH_21("Glenfiddich 21"),
    GLENMORANGIE_NECTOR_D_OR("Glenmorangie Nector D Or"),
    GRAPPA("Grappa"),
    HONEY_MEAD("Honey Mead"),
    JACK_DANIELS("Jack Daniels"),
    JAMESON("Jameson"),
    LAGAVULLIN_16("Lagavullin 16"),
    LAPHROAIG_SELECT("Laphroaig Select"),
    LARK_SYMPHONY_NO_1("Lark Symphony No. 1"),
    MAKERS_MARK("Makers Mark"),
    MALORT("Malort"),
    RUM("Rum"),
    SCOTCH("Scotch"),
    STARWARD("Starward"),
    TALISKER_10("Talisker 10"),
    TALISKER_15("Talisker 15"),
    TALISKER_18("Talisker 18"),
    TALISKER_STORM("Talisker Storm"),
    TEQUILA("Tequila"),
    THE_GOSPEL_STRAIGHT_RYE("The Gospel Straight Rye"),
    VIKINGS_BLOD("Vikings Blod"),
    VODKA("Vodka"),
    WHISKEY("Whiskey"),
    WILD_TURKEY("Wild Turkey"),
    WINE("Wine");

    private String name;

    AlcoholType(String Name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

