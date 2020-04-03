package super_Charging_Station;

public class model_S {
    public static double totalChargingCostForAllModelS = 0;
    public static double totalChargingTimeForModelS = 0;
    public static double calculatedCapNeedCharge(double percentNeededToCharge){
        double batCap = 100;
        return batCap * percentNeededToCharge;
    }
}
