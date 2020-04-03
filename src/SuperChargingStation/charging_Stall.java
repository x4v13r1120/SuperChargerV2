package SuperChargingStation;

import java.util.Arrays;
import java.util.List;

public class charging_Stall {
    public static List<String> stall_List = Arrays.asList("Booth One","Booth Two","Booth Three","Booth Four");
    private static double averageChargeEfficiencyForAllTesla = 0.85; //85 percent
    public static boolean freeCharging = false;
    public static double calculateSocketOutput(){
        double socketVoltage = 480;
        double socketAmps = 300;
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
        double station_KWH_Cost = 0.18;
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
    public static double calculatedTotalChargingCost(double totalChargingCostForAllModelX,double totalChargingCostForAllModelS,
                                                     double totalChargingCostForAllModelThree,
                                                     double totalChargingCostForAllModelY,
                                                     double totalChargingCostForAllRoadster){
        return  totalChargingCostForAllModelS+totalChargingCostForAllModelThree+totalChargingCostForAllModelX+
                totalChargingCostForAllModelY+totalChargingCostForAllRoadster;
    }
    public static double calculatedTotalTime(double totalChargingTimeForModelS,double totalChargingTimeForModelX,
                                             double totalChargingTimeForModel3,double totalChargingTimeForModelY,
                                             double totalChargingTimeForRoadster){
        return totalChargingTimeForModelS+totalChargingTimeForModel3+totalChargingTimeForModelX+
                totalChargingTimeForModelY+totalChargingTimeForRoadster;
    }
}



