package ex43;/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Thew
 */

public class App {
    public static void main(String[] args){
        //string input for arrays
        String[] inputs = siteFunctions.getInput();
        //generate site from inputs
        String created = siteFunctions.genSite(inputs);
        System.out.printf(created);
    }
}
