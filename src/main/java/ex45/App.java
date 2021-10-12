package ex45;/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Thew
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        System.out.print("Name of output file: ");
        Scanner n = new Scanner(System.in);
        String s = n.nextLine();
        //input is string resultant of parsing file
        String input = utilizeFunctions.parseFile();
        //replace utilizes with uses
        input = utilizeFunctions.returnS(input);
        //create file with updated string
        utilizeFunctions.createFile(input, s);
    }
}
