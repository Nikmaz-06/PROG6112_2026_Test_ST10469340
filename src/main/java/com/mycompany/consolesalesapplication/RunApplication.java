/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consolesalesapplication;

public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("SELECT A CONSOLE DEVICE");
    System.out.println("1 - PS5");
    System.out.println("2 - XBOX");
    System.out.println("3 - NINTENDO SWITCH");
    System.out.print("Enter your selection: ");

    int choice = input.nextInt();
    input.nextLine();

    String consoleType;

    switch (choice) {
        case 1:
            consoleType = "PS5";
            break;
        case 2:
            consoleType = "XBOX";
            break;
        case 3:
            consoleType = "NINTENDO SWITCH";
            break;
        default:
            consoleType = "UNKNOWN";
            break;
    }

    System.out.print("Enter the store name: ");
    String store = input.nextLine();

    System.out.print("Enter the total console sales: ");
    int totalSales = input.nextInt();

    ConsoleSales sales = new ConsoleSales(consoleType, store, totalSales);

    sales.printReport();
}
