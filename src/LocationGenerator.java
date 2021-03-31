public class LocationGenerator {

    public static Location createLocation() {
        LocationType type = LocationType.randomLocation();
        if (type == LocationType.CABIN_CRUISER) {
            return new CabinCruiser("Cabin Cruiser","A cabin cruiser.");
        } else if (type == LocationType.COMMERCIAL_SHIP) {
            return new CommercialShip("Commercial Ship","A commercial ship.");
        } else if (type == LocationType.CRUISE_LINE) {
            return new CruiseLine("Cruise Line","A cruise line.");
        } else if (type == LocationType.ISLAND) {
            return new Island("Island","An island.");
        } else if (type == LocationType.OIL_RIG) {
            return new OilRig("Oil Rig","An oil rig");
        } else {
            return new Yatch("Yatch","A yatch.");
        }
    }
}
