package ex41;/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Thew
 */

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sortFunctions {
    //function to get names from input file
    public static ArrayList<String> getNames(){
        //list of strings
        ArrayList<String> list = new ArrayList<>();
        //try such that there is no exception
        try {
            //new scanner
            Scanner reader = new Scanner(System.in);
            //new file from exercise42_input.txt
            File file = new File("C:\\Users\\Daniel Thew\\IdeaProjects\\thew-cop3330-assignment3\\src\\main\\java\\ex41\\exercise41_input.txt");
            //scanner reads from file
            reader = new Scanner(file);
            //while scanner has a next line
            while(reader.hasNextLine()){
                //add next line to list
                list.add(reader.nextLine());
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        //return list
        return list;
    }
//function to sort list alphabetically
    public static ArrayList<String> sortList(ArrayList<String> list){
        //collections sorts list alphabetically
        Collections.sort(list);
        //return list
        return list;
    }
//function to print list to output file
    public static void printList(ArrayList<String> list){
        //try such that there is no exception thrown
        try {
            //new printwriter for output file
            PrintWriter toFile = new PrintWriter("exercise41_output.txt");
            //print Total of X names, new line, -----------------, new line, to output file
            toFile.printf("Total of %d names\n-----------------\n", list.size());
            //for the size of the list
            for(int i = 0; i < list.size(); i++){
                //print each index of list to file
                toFile.printf("%s\n", list.get(i));
            }
            //close file
            toFile.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
