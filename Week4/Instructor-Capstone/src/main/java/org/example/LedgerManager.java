package org.example;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class LedgerManager {

    public static double getAccountBalance(){
        ArrayList<LedgerItem> items = readLedger();

        double sum = 0;
        for(LedgerItem item : items){
            sum += item.getAmount();
        }

        return sum;
    }
    public static ArrayList<LedgerItem> filterLedgerItemsByCriteria(FilterTypes filterType, String vendor){
        if(vendor == null){
            vendor = "";
        }
        ArrayList<LedgerItem> ledgerItems = readLedger();
        ArrayList<LedgerItem> finalList = new ArrayList<>();
        LocalDate currentDate = LocalDate.now();

        for(LedgerItem item : ledgerItems){
            LocalDate itemDate = item.getLocalDate();
            switch(filterType){
                case MonthToDate:
                    if(item.getLocalDate().isAfter(LocalDate.now().minusMonths(1))){
                        finalList.add(item);
                    }
                    break;
                case PreviousMonth:
                    if(currentDate.getYear() == itemDate.getYear() &&
                            currentDate.getMonthValue() - itemDate.getMonthValue() == 1){
                        finalList.add(item);
                    }
                    break;
                case PreviousYear:
                    if(currentDate.minusYears(1).getYear() == itemDate.getYear()){
                        finalList.add(item);
                    }
                    break;
                case ByVendor:
                    if(item.getVendor().equalsIgnoreCase(vendor)){
                        finalList.add(item);
                    }
                    break;
                case YearToDate:
                    if(itemDate.isAfter(currentDate.minusDays(365))){
                        finalList.add(item);
                    }
                    break;
                default:
                    break;
            }
        }

        return finalList;
    }

    //This is the more advanced version of how I'd do the filtering function
    //It's perfectly fine to not understand it, just wanted to give a taste of something more realistic
    //not perfect, but closer to how I'd do it.
    /*
    public static List<LedgerItem> filterLedgerItems(FilterTypes filterType, String vendor) {
    List<LedgerItem> ledgerItems = readLedger();
    LocalDate currentDate = LocalDate.now();

    return ledgerItems.stream()
        .filter(item -> {
            LocalDate itemDate = item.getLocalDate();
            switch (filterType) {
                case MonthToDate:
                    return itemDate.isAfter(LocalDate.now().minusMonths(1));
                case PreviousMonth:
                    return currentDate.getYear() == itemDate.getYear() &&
                            currentDate.getMonthValue() - itemDate.getMonthValue() == 1;
                case PreviousYear:
                    return currentDate.minusYears(1).getYear() == itemDate.getYear();
                case ByVendor:
                    return item.getVendor().equalsIgnoreCase(vendor);
                case YearToDate:
                    return itemDate.isAfter(currentDate.minusDays(365));
                default:
                    return false;
            }
        })
        .collect(Collectors.toList());
}
     */

    public static ArrayList<LedgerItem> getAllDeposits(){
        ArrayList<LedgerItem> ledgerItems = readLedger();
        ArrayList<LedgerItem> deposits = new ArrayList<>();

        for(LedgerItem item : ledgerItems){
            if(item.getAmount() >= 0){
                deposits.add(item);
            }
        }

        return deposits;
    }

    public static ArrayList<LedgerItem> getAllPayments(){
        ArrayList<LedgerItem> ledgerItems = readLedger();
        ArrayList<LedgerItem> payments = new ArrayList<>();

        for(LedgerItem item : ledgerItems){
            if(item.getAmount() < 0){
                payments.add(item);
            }
        }

        return payments;
    }
    public static ArrayList<LedgerItem> readLedger(){

        ArrayList<LedgerItem> ledgerItemArrayList = new ArrayList<>();

        try{
            FileInputStream fis = new FileInputStream("src/main/resources/transactions.csv");

            Scanner scanner = new Scanner(fis);

            String input;
            //skip the header
            scanner.nextLine();
            while(scanner.hasNextLine()){
                input = scanner.nextLine();

                String[] row = input.split("\\|");

                LedgerItem item = new LedgerItem(row[2], row[3], Double.parseDouble(row[4]), LocalDate.parse(row[0]), LocalTime.parse(row[1]));

                ledgerItemArrayList.add(item);
            }
        }
        catch(FileNotFoundException ex){
            System.out.println("Could not find the file sorry");
        }

        return ledgerItemArrayList;
    }

    public static void writeLedgerItem(LedgerItem item) {
        try {
            File file = new File("src/main/resources/transactions.csv");
            boolean fileExists = file.exists();

            FileWriter fileWriter = new FileWriter(file, true);

            if (!fileExists || file.length() == 0) {
                // Write the header line
                fileWriter.write("date|time|description|vendor|amount\n");
            }

            // Write the ledger item
            fileWriter.write(item.toString());

            fileWriter.close();
        } catch (IOException ex) {
            System.out.println("Had problems writing to the file.");
        }
    }
}
