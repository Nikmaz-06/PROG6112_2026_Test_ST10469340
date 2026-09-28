package com.mycompany.gamingconsolesales;

/**
 *
 * @author Nikyle Mazeau ST10469340
 */
public class GamingConsoleSales {

    public static void main(String[] args) {
        String[] cities = {"Cape Town", "Port Elizabteh", "Pretoria"};
        
        String[] consoles = {"PS5", "Xbox", "Switch"};
        
        int[][] sales = {
            
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };
        
        System.out.println("-----------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("-----------------------------------------");
        
        System.out.printf("%-20% %-12s %12s%n",
                "", consoles[0], consoles[1], consoles[2]);
        
        for (int i = 0; i < cities.length; i++) {

    System.out.printf("%-20s", cities[i]);

    for (int j = 0; j < sales[i].length; j++) {
        System.out.printf("%-12d", sales[i][j]);
    }

    System.out.println();
}
        System.out.println("------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < cities.length; i++) {

             int total = 0;

             for (int j = 0; j < sales[i].length; j++) {
             total = total + sales[i][j];
    }

    System.out.println(cities[i] + ": " + total);
}

            int highestSales = 0;
            String highestCity = "";

        for (int i = 0; i < cities.length; i++) {

        int total = 0;

               for (int j = 0; j < sales[i].length; j++) {
               total = total + sales[i][j];
    }

        if (total > highestSales) {
        highestSales = total;
        highestCity = cities[i];
    }
}

System.out.println("------------------------------------------------------------");
System.out.println("CITY WITH THE MOST GAMING CONSOLE SALES: " + highestCity);
System.out.println("------------------------------------------------------------");
        
      
        }
        
    }
