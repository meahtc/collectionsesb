package edu.ti.caih313.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountFamiles {

    private static List<Double> data = new ArrayList<Double>();

    public static void main(String[] args) {

        CountFamiles countFamiles = new CountFamiles();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter values that represent family incomes. Enter a negative value to stop.");
        double value = keyboard.nextDouble();
        while (value >= 0)
        {
            data.add(value);
            value = keyboard.nextDouble();
        }

        countFamiles.findValuesUnderTenPercent();
    }

    public void findValuesUnderTenPercent()
    {
        double max = 0;
        for (int i = 0; i < data.size(); i++)
        {
            if (data.get(i) > max)
            {
                max = data.get(i);
            }
        }

        List<Double> lessThanTenPercent = new ArrayList<Double>();
        double tenPercent = max * .10;
        for (int i = 0; i < data.size(); i++)
        {
            if (data.get(i) < tenPercent)
            {
                lessThanTenPercent.add(data.get(i));
            }
        }

        for (int i = 0; i < lessThanTenPercent.size(); i++)
        {
            System.out.println(lessThanTenPercent.get(i));
        }
    }
}
