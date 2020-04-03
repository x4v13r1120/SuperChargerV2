package SuperChargingStation;

public class charging_Stall {
    private static double station_KWH_Cost = 0.18;
    private static double socketVoltage = 480;
    private static double socketAmps = 300;
    private static double averageChargeEfficiencyForAllTesla = 0.85; //85 percent

    public static double calculateSocketOutput(){
        return (socketVoltage * socketAmps) / 1000;
    }
    public static double calculatedChargingIntake(double socketOutput){
        return (socketOutput * averageChargeEfficiencyForAllTesla);
    }
    public static double calculatedPercentNeededToCharge(double wantsChargeAt, double originalCharge) {
        return (wantsChargeAt - originalCharge) / 100;
    }

    public static double calculatedChargingTime (double chargeCapacityThatNeedsCharge, double chargingIntake){
        return chargeCapacityThatNeedsCharge / chargingIntake;
    }
    public static double calculatedChargingCost( double chargeCapacityThatNeedsCharge){
        return (station_KWH_Cost * chargeCapacityThatNeedsCharge) / averageChargeEfficiencyForAllTesla;
    }
    public static double calculatedMinutes(double timeInMintues, double hoursInMinutes){
        return timeInMintues - hoursInMinutes;
    }
    public static double calculatedHoursInMintues(double timeInHours){
        return timeInHours * 60;
    }
    public static double calculatedTimeJustHours(double chargingTime){
        return (int) chargingTime;
    }
    public static double calculatedTimeInMinutes( double chargingTime) {
        return chargingTime * 60;
    }
}



