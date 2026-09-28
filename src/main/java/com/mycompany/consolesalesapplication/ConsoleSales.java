package com.mycompany.consolesalesapplication;

//Extends the console class
public class ConsoleSales extends Console {
    
    //constructor for the class
    public ConsoleSales(String consoleType, String store, int totalSales) {
    super(consoleType, store, totalSales);
}
    
    public void printReport() {

    System.out.println("--------------------------------------");
    System.out.println("CONSOLE SALES REPORT");
    System.out.println("--------------------------------------");

    System.out.println("CONSOLE: " + getConsoleType());
    System.out.println("STORE: " + getStore());
    System.out.println("SALES: " + getTotalSales());

    System.out.println("--------------------------------------");
}
}
