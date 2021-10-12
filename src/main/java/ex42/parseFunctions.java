package ex42;/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Thew
 */

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class parseFunctions {
    //function to read from file
    public static ArrayList<String> readFile(){
        ArrayList<String> list = new ArrayList<>();
        try {
            //new scanner
            Scanner reader = new Scanner(System.in);
            //new file from exercise42_input.txt
            File file = new File("C:\\Users\\Daniel Thew\\IdeaProjects\\thew-cop3330-assignment3\\src\\main\\java\\ex42\\exercise42_input.txt");
            //scanner reads from file
            reader = new Scanner(file);
            //while scanner has a next line
            while(reader.hasNextLine()){
                //array of strings equals next line split into parts by commas
                String[] col = reader.nextLine().split(",");
                //for the number of strings add each index of strings to list
                for(int i = 0; i < col.length; i++){
                    list.add(col[i]);
                }
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return list;
    }
    //function to return string of list
    public static String printList(ArrayList<String> list){
        //string
        String s = "";
        //for size of list
        for(int i = 0; i < list.size(); i++){
            //add to string the index of list at i
            s += list.get(i);
            //for the difference between some arbitrary "max length of a name" and the actual length of the current name
            //add a space to string
            for(int j = 0; j < 10-list.get(i).length(); j++){
                s += " ";
            }
            //if i+1 modulus 3 is 0, add a new line
            if((i+1)%3==0){
                s+="\n";
            }
        }
        return s;
    }
}
