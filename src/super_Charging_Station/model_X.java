package super_Charging_Station;

public class model_X {
    public static double totalChargingCostForAllModelX = 0;
    public static double totalChargingTimeForModelX = 0;
    public static double calculatedCapNeedCharge(double percentNeededToCharge){
        double batCap = 100;
        return batCap * percentNeededToCharge;
    }
}
