package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    public static void mainMenu(){
        boolean isInMainMenu = true;
        Scanner scanner = new Scanner(System.in);

        while(isInMainMenu){
            System.out.println("Welcome to Hop Industries Financial!");
            System.out.println("We make our financial dreams come true!");
            System.out.println("Select from the following options:");
            System.out.println("D) Make a deposit.");
            System.out.println("P) Make a payment.");
            System.out.println("L) Ledger Screen");
            System.out.println("E) Exit");

            String userInput = scanner.nextLine().toLowerCase();

            switch(userInput){
                case "d":
                    System.out.println("You selected: deposit.");
                    writeTransaction(true);
                    break;
                case "p":
                    System.out.println("You selected: payment");
                    writeTransaction(false);
                    break;
                case "l":
                    ledgerScreen();
                    break;
                case "e":
                    System.out.println("See ya!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("That is not one of the options. Please try again.");
                    break;
            }
        }

    }

    private static void ledgerScreen(){
        boolean isOnLedgerScreen = true;
        Scanner scanner = new Scanner(System.in);

        while(isOnLedgerScreen){
            System.out.printf("Current Balance: $%.2f%n", LedgerManager.getAccountBalance());
            System.out.println("Please select from the following options:");
            System.out.println("A) Show all Transactions");
            System.out.println("D) Show all Deposits");
            System.out.println("P) Show all Payments");
            System.out.println("R) Reports");
            System.out.println("B) Back");

            String userInput = scanner.nextLine().toLowerCase();

            switch(userInput){
                case "a":
                    displayLedgerItems(FilterTypes.ALL, null);
                    break;
                case "d":
                    displayLedgerItems(FilterTypes.DEPOSIT, null);
                    break;
                case "p":
                    displayLedgerItems(FilterTypes.PAYMENT, null);
                    break;
                case "b":
                    isOnLedgerScreen = false;
                    break;
                case "r":
                    reportScreen();
                    break;
                default:
                    System.out.println("That is not a valid option try again.");
                    break;
            }
        }
    }

    private static void reportScreen(){
        boolean isOnReportsScreen = true;

        Scanner scanner = new Scanner(System.in);

        while(isOnReportsScreen){
            System.out.println("Please select from the following reports:");
            System.out.println("1) Month to Date");
            System.out.println("2) Previous Month");
            System.out.println("3) Year to Date");
            System.out.println("4) Previous Year");
            System.out.println("5) Search By Vendor");
            System.out.println("0) Back");

            try{
                int userInput = scanner.nextInt();

                switch(userInput){
                    case 1:
                        displayLedgerItems(FilterTypes.MonthToDate, null);
                        break;
                    case 2:
                        displayLedgerItems(FilterTypes.PreviousMonth, null);
                        break;
                    case 3:
                        displayLedgerItems(FilterTypes.YearToDate, null);
                        break;
                    case 4:
                        displayLedgerItems(FilterTypes.PreviousYear, null);
                        break;
                    case 5:
                        System.out.println("Please enter the name of the vendor");
                        scanner.nextLine();
                        String vendor = scanner.nextLine();
                        displayLedgerItems(FilterTypes.ByVendor, vendor);
                        break;
                    default:
                        System.out.println("That is not one of the options. Try again");
                        break;
                }
            }
            catch (Exception ex){
                System.out.println("Please input a number.");
            }
        }
    }

    private static void displayLedgerItems(FilterTypes type, String vendor){
        ArrayList<LedgerItem> items = new ArrayList<>();

        switch(type){
            case ALL -> items = LedgerManager.readLedger();
            case DEPOSIT -> items = LedgerManager.getAllDeposits();
            case PAYMENT -> items = LedgerManager.getAllPayments();
            default -> items = LedgerManager.filterLedgerItemsByCriteria(type, vendor);
        }

        for(LedgerItem item : items){
            System.out.println(String.format("Date: %s Time: %s Description: %s Vendor: %s Amount $%.2f%n", item.getLocalDate(), item.getLocalTime(), item.getDescription(), item.getVendor(), item.getAmount() ));
        }
    }

    private static void writeTransaction(boolean isDeposit){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the amount:");
        double amount = Double.parseDouble(scanner.nextLine());

        if(!isDeposit){
            amount *= -1;
        }

        System.out.println("Please enter the vendor:");
        String vendor = scanner.nextLine();

        System.out.println("Please enter a description:");
        String description = scanner.nextLine();

        LedgerItem item = new LedgerItem(description, vendor, amount, LocalDate.now(), LocalTime.now());

        LedgerManager.writeLedgerItem(item);

        System.out.println("Transaction successfully recorded!");
    }
}
