package edu.ti.caih313.collections.demo;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class HashMapHistogram {

    public static<K> void increment(Map<K, Integer> map, K key) {
        map.putIfAbsent(key, 0);
        map.put(key, map.get(key) + 1);
    }

    public static void main(String[] args)
    {
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        Map<Integer, Integer> countNumber = new HashMap();

        System.out.println("Enter a number to compute a histogram:");
        Scanner keyboard = new Scanner(System.in);
        int input = keyboard.nextInt();
        while(input>-1) {
            histogram.put(input, 1);
            if (countNumber.containsKey(input)) {
                increment(countNumber, input);
                increment(histogram, input);
            } else {
                countNumber.put(input, 1);
            }
            System.out.println("Enter another number, enter -1 to end:");
            input=keyboard.nextInt();
        }

        for (Integer number : countNumber.keySet())
        {
            Integer numberOfTimesAppeared = countNumber.get(number);
            System.out.println("The number " + number + " appears " + numberOfTimesAppeared + " times.");
            System.out.println();
        }
    }
}
