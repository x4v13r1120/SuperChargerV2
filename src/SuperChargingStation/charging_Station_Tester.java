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
import java.util.Random;

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

        //simple answers
        List<String> answers = new ArrayList<String>();
        answers.add("1.Yes");
        answers.add("2.No");

        // constructor for a random number
        Random rand = new Random();

        //goes for each of the booth i hard coded 4 but can easy be changed for more or less
        for(int i = 0; i < charging_Stall.stall_List.size(); i++) {
            double totalStallTime = 0;
            for (int numberOfCarsAtStation = rand.nextInt(10); numberOfCarsAtStation > 0 &&
                    numberOfCarsAtStation != 0; numberOfCarsAtStation--) {

                System.out.println("Welcome to this Charging station.\n");
                System.out.println("You are at " + charging_Stall.stall_List.get(i) + "\n");
                System.out.println("What Kind of Tesla Model do you Drive?\n" + tesla_Models);
                int cartype = keyboard.nextInt();

                //if and else if for the type of cars as well as for model y and roadster free charger if and else's
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

                    System.out.println("Your charging cost is $" + df2.format(chargingCost) + "\n");

                    double timeInMinutes = charging_Stall.calculatedTimeInMinutes(chargingTime);
                    double timeJustHours = charging_Stall.calculatedTimeJustHours(chargingTime);
                    double hoursInMinutes = charging_Stall.calculatedHoursInMintues(timeJustHours);
                    double minutes = charging_Stall.calculatedMinutes(timeInMinutes, hoursInMinutes);

                    System.out.println("Your charging time is " + timeJustHours + " hrs and " + (int) (minutes) + " mins.\n");

                    model_X.totalChargingCostForAllModelX = +chargingCost;
                    model_X.totalChargingTimeForModelX = +chargingTime;
                    totalStallTime += chargingTime;

                } else if (cartype == 2) {
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

                    System.out.println("Your charging cost is $" + df2.format(chargingCost) + "\n");

                    double timeInMinutes = charging_Stall.calculatedTimeInMinutes(chargingTime);
                    double timeJustHours = charging_Stall.calculatedTimeJustHours(chargingTime);
                    double hoursInMinutes = charging_Stall.calculatedHoursInMintues(timeJustHours);
                    double minutes = charging_Stall.calculatedMinutes(timeInMinutes, hoursInMinutes);

                    System.out.println("Your charging time is " + timeJustHours + " hrs and " + (int) (minutes) + " mins.\n");

                    model_S.totalChargingCostForAllModelS = +chargingCost;
                    model_S.totalChargingTimeForModelS = +chargingTime;
                    totalStallTime += chargingTime;

                } else if (cartype == 3) {
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

                    System.out.println("Your charging cost is $" + df2.format(chargingCost) + "\n");

                    double timeInMinutes = charging_Stall.calculatedTimeInMinutes(chargingTime);
                    double timeJustHours = charging_Stall.calculatedTimeJustHours(chargingTime);
                    double hoursInMinutes = charging_Stall.calculatedHoursInMintues(timeJustHours);
                    double minutes = charging_Stall.calculatedMinutes(timeInMinutes, hoursInMinutes);

                    System.out.println("Your charging time is " + timeJustHours + " hrs and " + (int) (minutes) + " mins.\n");

                    model_3.totalChargingCostForAllModel3 = +chargingCost;
                    model_3.totalChargingTimeForModel3 = +chargingTime;
                    totalStallTime += chargingTime;

                } else if (cartype == 4) {
                    System.out.println("\nWhat charge is your Tesla at?");
                    double originalCharge = keyboard.nextDouble();

                    System.out.println("\nWhat charge would you like it to be at?");
                    double wantsChargeAt = keyboard.nextDouble();

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

                    System.out.println("Your charging cost is $" + df2.format(chargingCost) + "\n");
                    System.out.println("Your charging time is " + timeJustHours + " hrs and " + (int) (minutes) + " mins.\n");

                    model_Y.totalChargingCostForAllModelY = +chargingCost;
                    model_Y.totalChargingTimeForModelY = +chargingTime;

                    System.out.println("\nDo you have unlimited free super charging?\n" + answers);
                    double answerToFreeCharging = keyboard.nextDouble();
                    if (answerToFreeCharging == 1) {
                        charging_Stall.freeCharging = true;
                        System.out.println("Enjoy free charging! You are good to go!\n");
                        model_Y.totalFreeChargingForAllModelY = +chargingCost;
                        model_Y.totalFreeChargingTimeForModelY = +chargingTime;
                    } else {
                        System.out.println("Don't forget to pay!\n");
                    }
                    totalStallTime += chargingTime;

                } else if (cartype == 5) {
                    System.out.println("\nWhat charge is your Tesla at?");
                    double originalCharge = keyboard.nextDouble();

                    System.out.println("\nWhat charge would you like it to be at?");
                    double wantsChargeAt = keyboard.nextDouble();

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

                    System.out.println("Your charging cost is $" + df2.format(chargingCost) + "\n");
                    System.out.println("Your charging time is " + timeJustHours + " hrs and " + (int) (minutes) + " mins.\n");

                    roadster.totalChargingCostForAllRoadster = +chargingCost;
                    roadster.totalChargingTimeForRoadster = +chargingTime;

                    System.out.println("\nDo you have unlimited free super charging?\n" + answers);
                    double answerToFreeCharging = keyboard.nextDouble();
                    if (answerToFreeCharging == 1) {
                        charging_Stall.freeCharging = true;
                        System.out.println("Enjoy free charging! You are good to go!\n");
                        roadster.totalFreeChargingForAllRoadsters = +chargingCost;
                        roadster.totalFreeChargingTimeForRoadster = +chargingTime;
                    } else {
                        System.out.println("Don't forget to pay!\n");
                    }
                    totalStallTime += chargingTime;

                } else {
                    System.out.println("Invalid Input please try again.");
                }

            }
            double totalStallJustHours = charging_Stall.calculatedTimeJustHours(totalStallTime);
            double totalHoursInMinutes = charging_Stall.calculatedHoursInMintues(totalStallJustHours);
            double totalTimeInMinutes = charging_Stall.calculatedTimeInMinutes(totalStallTime);
            double totalStallMinutes = charging_Stall.calculatedMinutes(totalTimeInMinutes,totalHoursInMinutes);
            System.out.println("The total time all cars spent at this booth is "+ totalStallJustHours+" hrs and "
                    + (int) totalStallMinutes+" mins.\n");
        }

        double totalChargingCost = charging_Stall.calculatedTotalChargingCost(model_X.totalChargingCostForAllModelX,
                model_S.totalChargingCostForAllModelS,model_3.totalChargingCostForAllModel3,
                model_Y.totalChargingCostForAllModelY,roadster.totalChargingCostForAllRoadster);

        double totalChargingTime =charging_Stall.calculatedTotalTime(model_S.totalChargingTimeForModelS,
                model_X.totalChargingTimeForModelX,model_3.totalChargingTimeForModel3,
                model_Y.totalChargingTimeForModelY,roadster.totalChargingTimeForRoadster);
        double totalTimeJustHours = charging_Stall.calculatedTimeJustHours(totalChargingTime);
        double totalHoursInMinutes = charging_Stall.calculatedHoursInMintues(totalTimeJustHours);
        double totalTimeInMinutes = charging_Stall.calculatedTimeInMinutes(totalChargingTime);
        double totalMinutes = charging_Stall.calculatedMinutes(totalTimeInMinutes,totalHoursInMinutes);

        double totalFreeTimeChargingForAll = charging_Stall.calculatedTotalFreeChargingTimeAtStall(
                model_Y.totalFreeChargingTimeForModelY,
                roadster.totalFreeChargingTimeForRoadster);
        double totalFreeTimeJustHours = charging_Stall.calculatedTimeJustHours(totalFreeTimeChargingForAll);
        double totalFreeHoursInMinutes = charging_Stall.calculatedHoursInMintues(totalFreeTimeJustHours);
        double totalFreeTimeInMintues = charging_Stall.calculatedTimeInMinutes(totalFreeTimeChargingForAll);
        double totalFreeMinutes = charging_Stall.calculatedMinutes(totalFreeTimeInMintues,totalFreeHoursInMinutes);

        System.out.println("The total charging cost at this station is $"+ df2.format(totalChargingCost)+"\n");
        System.out.println("The total time for all vehicles that came to the station is "+ totalTimeJustHours +
                " hrs and " + (int) (totalMinutes) + " mins.\n");
        System.out.println("The total free charging cost that came to this station is $"
                + df2.format(charging_Stall.calculatedTotalFreeChargingTimeAtStation(model_Y.totalFreeChargingForAllModelY
                ,roadster.totalChargingCostForAllRoadster))+"\n");
        System.out.println("The total free charging time that came to this station is "+ totalFreeTimeJustHours+" hrs and "
                + (int) totalFreeMinutes+" mins.\n");
    }
}
