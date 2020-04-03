package SuperChargingStation;

public class roadster {
    private static double batCap = 100;
    public static double totalChargingCostForAllRoadster = 0;
    public static double totalFreeChargingForAllRoadsters = 0;
    public static double totalChargingTimeForRoadster = 0;
    public static double totalFreeChargingTimeForRoadster = 0;
    public static double calculatedCapNeedCharge(double percentNeededToCharge){
        return batCap * percentNeededToCharge;
    }
}
