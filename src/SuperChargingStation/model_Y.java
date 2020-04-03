package SuperChargingStation;

public class model_Y {
    private static double batCap = 75;
    public static double totalChargingCostForAllModelY = 0;
    public static double totalFreeChargingForAllModelY = 0;
    public static double totalChargingTimeForModelY = 0;
    public static double totalFreeChargingTimeForModelY = 0;
    public static double calculatedCapNeedCharge(double percentNeededToCharge){
        return batCap * percentNeededToCharge;
    }
}