package super_Charging_Station;

public class roadster {
    public static double totalChargingCostForAllRoadster = 0;
    public static double totalFreeChargingForAllRoadsters = 0;
    public static double totalChargingTimeForRoadster = 0;
    public static double totalFreeChargingTimeForRoadster = 0;
    public static double calculatedCapNeedCharge(double percentNeededToCharge){
        double batCap = 100;
        return batCap * percentNeededToCharge;
    }
}
