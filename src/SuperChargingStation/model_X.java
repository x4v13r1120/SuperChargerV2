package SuperChargingStation;

public class model_X {
    private static double batCap = 100;
    public static double totalChargingCostForAllModelX = 0;
    public static double totalChargingTimeForModelX = 0;
    public static double calculatedCapNeedCharge(double percentNeededToCharge){
        return batCap * percentNeededToCharge;
    }
}
