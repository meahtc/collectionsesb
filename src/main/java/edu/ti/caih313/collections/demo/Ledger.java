package edu.ti.caih313.collections.demo;

import java.util.ArrayList;
import java.util.List;

public class Ledger {

    public static List<Double> sale = new ArrayList<Double>();
    private double totalSales;
    private static double totalValue;

    public static void main(String[] args) {

        Ledger ledger = new Ledger();

        ledger.addSale(7.89);
        ledger.addSale(4.56);
        ledger.addSale(1.23);
        ledger.addSale(3.69);

        int numberOfSales = ledger.getNumberOfSales();
        totalValue = ledger.getTotalSales();
        double averageSales = ledger.getAverageSale();
        int checkForMax = 200;
        int salesAboveMax = ledger.getCountAbove(checkForMax);

        System.out.println("Total number of sales = "+ numberOfSales);
        System.out.println("Total sales amount = "+ totalValue);
        System.out.println("Average sale amount = "+ averageSales);
        System.out.println("Number of sales exceeded "+ checkForMax + " in value = " + salesAboveMax);


    }

    public List<Double> addSale(double v)
    {
        sale.add(v);
        totalSales += v;
        return sale;
    }

    public int getNumberOfSales()
    {
        return sale.size();
    }

    public double getTotalSales()
    {
        return totalSales;
    }

    public double getAverageSale()
    {
        double totalSales = getTotalSales();
        double averageSales = totalValue/totalSales;
        return averageSales;
    }

    public int getCountAbove(double v)
    {
        int num = 0;
        for (int i = 0; i < sale.size(); i++)
        {
            if (sale.get(i) > v)
            {
                num++;
            }
        }
        return num;
    }

}
