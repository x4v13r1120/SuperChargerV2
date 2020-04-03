package SuperChargingStation;

public class model_S {
    private static double batCap = 100;
    public static double totalChargingCostForAllModelS = 0;
    public static double totalChargingTimeForModelS = 0;
    public static double calculatedCapNeedCharge(double percentNeededToCharge){
        return batCap * percentNeededToCharge;
    }
}
