package ex41;/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Thew
 */

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        //ArrayList type String is declared
        ArrayList<String> list = new ArrayList<>();
        //list is full of names from getNames function in sortFunctions
        list = sortFunctions.getNames();
        //list is sorted alphabetically
        list = sortFunctions.sortList(list);
        //list is printed to output file
        sortFunctions.printList(list);
    }
}
