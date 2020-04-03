package super_Charging_Station;

public class model_Y {
    public static double totalChargingCostForAllModelY = 0;
    public static double totalFreeChargingForAllModelY = 0;
    public static double totalChargingTimeForModelY = 0;
    public static double totalFreeChargingTimeForModelY = 0;
    public static double calculatedCapNeedCharge(double percentNeededToCharge){
        double batCap = 75;
        return batCap * percentNeededToCharge;
    }
}