package ex46;/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Thew
 */

public class App {
    public static void main(String[] args){
        //string arr firstArr equals wordFunctions parsed file into a string
        String[] firstArr = wordFunctions.parseFile();
        //int arr secondArr equals wordFunctions frequency array
        int[] secondArr = wordFunctions.freq1(firstArr);
        //string fin_str equals wordFunctions frequency array data into string
        String fin_str = wordFunctions.printFreq(firstArr,secondArr);
        //print fin_str
        System.out.printf("%s", fin_str);
    }
}
