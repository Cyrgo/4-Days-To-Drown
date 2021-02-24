public enum ItemRarity {
    COMMON(1,60),
    UNCOMMON(61,90),
    RARE(91,100);

    private int from;
    private int to;

    ItemRarity(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public static ItemRarity randomRarity() {
        int rng = (int) (1+ Math.random() * 100);
        for (ItemRarity value: ItemRarity.values()) {
            if (rng <= value.to && rng >= value.from) {
                return value;
            }
        }
        return ItemRarity.COMMON;
    }
}

