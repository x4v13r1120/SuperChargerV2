package super_Charging_Station;

public class model_3 {
    public static double totalChargingCostForAllModel3 = 0;
    public static double totalChargingTimeForModel3 = 0;
    public static double calculatedCapNeedCharge(double percentNeededToCharge){
        double batCap = 75;
        return batCap * percentNeededToCharge;
    }
}
