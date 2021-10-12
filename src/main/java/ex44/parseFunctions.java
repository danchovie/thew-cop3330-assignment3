package ex44;/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Thew
 */

import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class parseFunctions {
    public static item[] jsonToStrings(){
        File file = new File("src/main/java/ex44/exercise44_input.json");
        String s = "";
        try {
            FileReader reader = new FileReader(file);
            s = reader.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Gson gson = new Gson();
        String q = gson.fromJson(s, String.class);
        item[] arr = gson.fromJson(s, item[].class);
        System.out.printf("%s\n", q);
        return arr;
    }
    public static String findItem(String item, item[] arr){
        String r_string = "Sorry, that product was not found in our inventory.\n";
        for(int i = 0; i < arr.length; i++){
            if(arr[i].name.equals(item)){
                r_string = "Name: " + arr[i].name + "\nPrice: " + arr[i].price + "\nQuantity: " + arr[i].quantity;
                return r_string;
            }
        }
        return r_string;
    }
}
