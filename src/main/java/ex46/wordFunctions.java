package ex46;/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Thew
 */

import java.io.File;
import java.util.Scanner;

public class wordFunctions {
    //function returning string arr from file
    public static String[] parseFile() {
        try {
            //file from input file
            File file = new File("src/main/java/ex46/exercise46_input.txt");
            //scanner for file
            Scanner scanner = new Scanner(file);
            //string value
            String s = "";
            //while file has a next line
            while (scanner.hasNextLine()) {
                //string line is the next line
                String line = scanner.nextLine();
                //add line and a space
                s += line + " ";
            }
            //turn string s into an array split at the spaces
            String[] arr = s.split(" ");
            //close scanner
            scanner.close();
            //return arr
            return arr;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //return value for random cases when test fails
        String[] f = {};
        return f;
    }
    //function returning int array given string array
    public static int[] freq1(String[] arr1){
        //int array arr2 is new int array of length arr1.length
        int arr2[] = new int[arr1.length];
        //for arr2.length
        for(int a = 0; a < arr2.length; a++){
            //arr2 index equals -1
            arr2[a] = -1;
        }
        //for length of arr2
        for(int b = 0; b < arr2.length; b++){
            //int num equals 1
            int num = 1;
            //for arr2.length from b+1
            for(int c = b+1; c < arr2.length; c++){
                //if the strings at the indices are equal
                if(arr1[b].equals(arr1[c])){
                    //num increase 1
                    num++;
                    //arr2 at indec c equals 0
                    arr2[c] = 0;
                }
            }
            //if arr2 at b equals 0
            if(arr2[b]!=0){
                //arr2 at b equals num
                arr2[b] = num;
            }
        }
        //for one less than arr2 length
        for(int d = 0; d < arr2.length-1; d++){
            //for arr2 length from d+1
            for(int e = d+1; e < arr2.length; e++){
                //if arr2 at d is less than arr2 at e
                if(arr2[d]<arr2[e]){
                    //placeholder for arr1 at d
                    String holder_s = arr1[d];
                    //placeholder for arr2 at d
                    int holder_i = arr2[d];
                    //arr1 at d equals arr1 at e
                    arr1[d] = arr1[e];
                    //arr2 at d equals arr2 at e
                    arr2[d] = arr2[e];
                    //arr1 at e equals the placeholder
                    arr1[e] = holder_s;
                    //arr2 at e equals the placeholder
                    arr2[e] = holder_i;
                }
            }
        }
        //return arr2
        return arr2;
    }
    //function to return string of display data given string arr s and int arr i
    public static String printFreq(String[] s, int[] i){
        //string return string
        String r_string = "";
        //for s.length
        for(int a = 0; a < s.length; a++){
            //if i at a isnt 0
            if(i[a]!=0){
                //add s at a and colon to r_string
                r_string += s[a] + ": ";
                //for i at a
                for(int b = 0; b < i[a]; b++){
                    //add asterisk to r_string
                    r_string += "*";
                }
                //add new line to r_string
                r_string += "\n";
            }
        }
        //return r_string
        return r_string;
    }
}
