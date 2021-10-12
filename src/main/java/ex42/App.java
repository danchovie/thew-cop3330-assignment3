package ex42;/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Thew
 */

import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        //list is read from file
        ArrayList<String> list = parseFunctions.readFile();
        //string starting with header
        String s = "Last\tFirst\tSalary\n--------------------------\n";
        //string concatenated with list
        s += parseFunctions.printList(list);
        //print full string
        System.out.print(s);
    }
}
