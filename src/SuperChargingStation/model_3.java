package SuperChargingStation;

public class model_3 {
    private static double batCap = 75;
    public static double totalChargingCostForAllModel3 = 0;
    public static double totalChargingTimeForModel3 = 0;
    public static double calculatedCapNeedCharge(double percentNeededToCharge){
        return batCap * percentNeededToCharge;
    }
}
