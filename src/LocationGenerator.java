public class LocationGenerator {

    public static Location createLocation() {
        Location type = switch (LocationType.randomLocation()) {
            case CABIN_CRUISER -> new CabinCruiser("Cabin Cruiser", "A Cabin Cruiser");
            case COMMERCIAL_SHIP -> new CommercialShip("Commercial Ship", "A commercial ship.");
            case CRUISE_LINE -> new CruiseLine("Cruise Line", "A cruise line.");
            case ISLAND -> new Island("Island", "An island.");
            case OIL_RIG -> new OilRig("Oil rig", "An oil rig.");
            case YACHT -> new Yacht("Yacht", "A yacht");
        };
        return type;
    }
}
