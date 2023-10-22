package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ReceiptManager {
    public void writeReceipt(ArrayList<Product> products){
        try{
            FileWriter fw = new FileWriter("src/main/resources/receipts/receipt.txt");
        }
        catch (IOException ex){

        }
    }
}
