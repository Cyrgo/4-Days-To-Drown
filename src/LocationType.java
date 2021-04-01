public enum LocationType {
    CABIN_CRUISER("Cabin Cruiser",1,16),
    COMMERCIAL_SHIP("Commercial Ship",17,33),
    CRUISE_LINE("Cruise Line",34,50),
    ISLAND("Island",51,67),
    OIL_RIG("Oil Rig",68,84),
    YACHT("Yacht", 85,100);

    private String name;
    private int from;
    private int to;

    LocationType(String name, int from, int to) {
        this.name = name;
        this.from = from;
        this.to = to;
    }

    public String getName() {
        return name;
    }

    public static LocationType randomLocation() {
        int rng = (int) (1+ Math.random() * 100);
        for (LocationType value: LocationType.values()) {
            if (rng <= value.to && rng >= value.from) {
                return value;
            }
        }
        return LocationType.ISLAND;
    }

}
