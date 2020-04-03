/*
  Author_Xavier_Naranjo
  Start_Date_04/3/2020 END_DATE_
  This is a upgraded project for another tesla super charging station for my exam 2 in cop 2005. Its is a software
  prototype V2.0 to manage a particular supercharging station for Electric Vehicles (EVs) that you delivered in Exam01.
 */
package SuperChargingStation;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class charging_Station_Tester {
    //simple money format

    private static final DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //list of car models
        List<String> tesla_Models = new ArrayList<>();
        tesla_Models.add("1.Model X");
        tesla_Models.add("2.Model S");
        tesla_Models.add("3.Model 3");
        tesla_Models.add("4.Model Y");
        tesla_Models.add("5.Roadster");


        System.out.println("Welcome to this Charging station.\n");
        System.out.println("What Kind of Tesla Model do you Drive?\n"+tesla_Models);
        int cartype = keyboard.nextInt();

        if (cartype == 1) {

            System.out.println("\nWhat charge is your Tesla at?");
            double originalCharge = keyboard.nextDouble();

            System.out.println("\nWhat charge would you like it to be at?");
            double wantsChargeAt = keyboard.nextDouble();

            double percentNeededToCharge = charging_Stall.calculatedPercentNeededToCharge(wantsChargeAt, originalCharge);

            double chargeCapacityThatNeedsCharge = model_X.calculatedCapNeedCharge(percentNeededToCharge);

            double socketOutput = charging_Stall.calculateSocketOutput();
            double chargingIntake = charging_Stall.calculatedChargingIntake(socketOutput);
            double chargingTime = charging_Stall.calculatedChargingTime(chargeCapacityThatNeedsCharge, chargingIntake);
            double chargingCost = charging_Stall.calculatedChargingCost(chargeCapacityThatNeedsCharge);

            double timeInMinutes = charging_Stall.calculatedTimeInMinutes(chargingTime);
            double timeJustHours = charging_Stall.calculatedTimeJustHours(chargingTime);
            double hoursInMinutes = charging_Stall.calculatedHoursInMintues(timeJustHours);
            double minutes = charging_Stall.calculatedMinutes(timeInMinutes, hoursInMinutes);


        }else if(cartype == 2){
            System.out.println("\nWhat charge is your Tesla at?");
            double originalCharge = keyboard.nextDouble();

            System.out.println("\nWhat charge would you like it to be at?");
            double wantsChargeAt = keyboard.nextDouble();

            double percentNeededToCharge = charging_Stall.calculatedPercentNeededToCharge(wantsChargeAt, originalCharge);

            double chargeCapacityThatNeedsCharge = model_S.calculatedCapNeedCharge(percentNeededToCharge);

            double socketOutput = charging_Stall.calculateSocketOutput();
            double chargingIntake = charging_Stall.calculatedChargingIntake(socketOutput);
            double chargingTime = charging_Stall.calculatedChargingTime(chargeCapacityThatNeedsCharge, chargingIntake);
            double chargingCost = charging_Stall.calculatedChargingCost(chargeCapacityThatNeedsCharge);

            double timeInMinutes = charging_Stall.calculatedTimeInMinutes(chargingTime);
            double timeJustHours = charging_Stall.calculatedTimeJustHours(chargingTime);
            double hoursInMinutes = charging_Stall.calculatedHoursInMintues(timeJustHours);
            double minutes = charging_Stall.calculatedMinutes(timeInMinutes, hoursInMinutes);
        }else if (cartype == 3){
            System.out.println("\nWhat charge is your Tesla at?");
            double originalCharge = keyboard.nextDouble();

            System.out.println("\nWhat charge would you like it to be at?");
            double wantsChargeAt = keyboard.nextDouble();

            double percentNeededToCharge = charging_Stall.calculatedPercentNeededToCharge(wantsChargeAt, originalCharge);

            double chargeCapacityThatNeedsCharge = model_3.calculatedCapNeedCharge(percentNeededToCharge);

            double socketOutput = charging_Stall.calculateSocketOutput();
            double chargingIntake = charging_Stall.calculatedChargingIntake(socketOutput);
            double chargingTime = charging_Stall.calculatedChargingTime(chargeCapacityThatNeedsCharge, chargingIntake);
            double chargingCost = charging_Stall.calculatedChargingCost(chargeCapacityThatNeedsCharge);

            double timeInMinutes = charging_Stall.calculatedTimeInMinutes(chargingTime);
            double timeJustHours = charging_Stall.calculatedTimeJustHours(chargingTime);
            double hoursInMinutes = charging_Stall.calculatedHoursInMintues(timeJustHours);
            double minutes = charging_Stall.calculatedMinutes(timeInMinutes, hoursInMinutes);
        } else if (cartype == 4) {
            System.out.println("\nWhat charge is your Tesla at?");
            double originalCharge = keyboard.nextDouble();

            System.out.println("\nWhat charge would you like it to be at?");
            double wantsChargeAt = keyboard.nextDouble();

            System.out.println("\nDo you have unlimited free super charging?");

            double percentNeededToCharge = charging_Stall.calculatedPercentNeededToCharge(wantsChargeAt, originalCharge);

            double chargeCapacityThatNeedsCharge = model_Y.calculatedCapNeedCharge(percentNeededToCharge);

            double socketOutput = charging_Stall.calculateSocketOutput();
            double chargingIntake = charging_Stall.calculatedChargingIntake(socketOutput);
            double chargingTime = charging_Stall.calculatedChargingTime(chargeCapacityThatNeedsCharge, chargingIntake);
            double chargingCost = charging_Stall.calculatedChargingCost(chargeCapacityThatNeedsCharge);

            double timeInMinutes = charging_Stall.calculatedTimeInMinutes(chargingTime);
            double timeJustHours = charging_Stall.calculatedTimeJustHours(chargingTime);
            double hoursInMinutes = charging_Stall.calculatedHoursInMintues(timeJustHours);
            double minutes = charging_Stall.calculatedMinutes(timeInMinutes, hoursInMinutes);
        }else if (cartype == 5){
            System.out.println("\nWhat charge is your Tesla at?");
            double originalCharge = keyboard.nextDouble();

            System.out.println("\nWhat charge would you like it to be at?");
            double wantsChargeAt = keyboard.nextDouble();

            System.out.println("\nDo you have unlimited free super charging?");

            double percentNeededToCharge = charging_Stall.calculatedPercentNeededToCharge(wantsChargeAt, originalCharge);

            double chargeCapacityThatNeedsCharge = roadster.calculatedCapNeedCharge(percentNeededToCharge);

            double socketOutput = charging_Stall.calculateSocketOutput();
            double chargingIntake = charging_Stall.calculatedChargingIntake(socketOutput);
            double chargingTime = charging_Stall.calculatedChargingTime(chargeCapacityThatNeedsCharge, chargingIntake);
            double chargingCost = charging_Stall.calculatedChargingCost(chargeCapacityThatNeedsCharge);

            double timeInMinutes = charging_Stall.calculatedTimeInMinutes(chargingTime);
            double timeJustHours = charging_Stall.calculatedTimeJustHours(chargingTime);
            double hoursInMinutes = charging_Stall.calculatedHoursInMintues(timeJustHours);
            double minutes = charging_Stall.calculatedMinutes(timeInMinutes, hoursInMinutes);
        }else{
            System.out.println("Invalid Input please try again.");
        }

    }
}
