package ex45;/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Thew
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class utilizeFunctions {
    //string parsefile
    public static String parseFile(){
        //string s to be returned
        String s = "";
        try {
            //new scanner
            Scanner reader = new Scanner(System.in);
            //new file from exercise42_input.txt
            File file = new File("src/main/java/ex45/exercise45_input.txt");
            //scanner reads from file
            reader = new Scanner(file);
            //while file isnt at end
            while(reader.hasNext()) {
                //add to string s the next line
                s += reader.nextLine() + "\n";
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        //return s
        return s;
    }
    //strings return s given string s1
    public static String returnS(String s1){
        //string s2 = s1 swap utilize with use
        String s2 = s1.replaceAll("utilize", "use");
        //return s2
        return s2;
    }
    //create file given string s1
    public static void createFile(String s1, String s2){
        //file is new file at path ending at s2
        File file = new File("src/main/java/ex45/" + s2);
        try {
            //fw is new filewriter for file
            FileWriter fw = new FileWriter(file);
            //write s1 to file
            fw.write(s1);
            //close fw
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
