package ex44;/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Thew
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        String check_s = "Sorry, that product was not found in our inventory.\n";
        item[] i_arr = parseFunctions.jsonToStrings();
        String s = "";
        String input = "";
        Scanner n = new Scanner(System.in);
        while(s.equals(check_s)==true){
            System.out.print("What is the product name?\n");
            input = n.nextLine();
            s = parseFunctions.findItem(s, i_arr);
            System.out.printf("%s", s);
        }
    }
}
