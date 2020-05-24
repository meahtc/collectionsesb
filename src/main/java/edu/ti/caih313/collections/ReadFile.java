package edu.ti.caih313.collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        List<List> textFile = new ArrayList<List>();
        textFile = ReadFile.getArrayListOfArrayLists();
        for (int i = 0; i < textFile.size(); i++)
        {
            for (int j = 0; j < textFile.get(i).size(); j++)
            {
                System.out.println(textFile.get(i).get(j));
            }
        }

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a sentence number followed by a word number and that word will be displayed.");
        int sentenceNumber = keyboard.nextInt() - 1;
        int wordNumber = keyboard.nextInt() - 1;
        if ((sentenceNumber > (textFile.size() - 1)) || (wordNumber > (textFile.get(sentenceNumber).size() - 1)) ||
                (sentenceNumber < 0) || (wordNumber < 0))
        {
            System.out.println("Sorry, the number you have entered is an invalid position number.");
        }
        else
        {
            //sentenceNumber--;
            //wordNumber--;
            List<String> sentence = textFile.get(sentenceNumber);
            String word = sentence.get(wordNumber);
            System.out.println(word);
        }
    }

    public static List<List> getArrayListOfArrayLists() throws FileNotFoundException {
        List<List> sentencesList = new ArrayList<List>();
        Scanner fileName = new Scanner(new File("C:/Users/esthe/Documents/GitHub/collections/src/main/java/edu/ti/caih313/collections/textFile"));

            String fileString = "";
            while(fileName.hasNextLine())
            {
                fileString += (fileName.nextLine() + " ");
            }
            String [] fileSentences = fileString.split("(?<=[.!?])\\s*");
            for (int i = 0; i < fileSentences.length; i++)
            {
                String sentence = fileSentences[i];
                String [] words = sentence.split(" ");

                List<String> wordList = new ArrayList<String>();
                for (int j = 0; j < words.length; j++)
                {
                    wordList.add(words[j]);
                }
                sentencesList.add(wordList);
            }
        fileName.close();
        return sentencesList;
    }
}