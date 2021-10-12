package ex43;/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Thew
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class siteFunctions {
    //function to get inputs
    public static String[] getInput(){
        //scanner read is new scanner for input
        Scanner read = new Scanner(System.in);
        //string array inputs size 4
        String[] inputs = new String[4];
        //prompt site name, receive in inputs 0
        System.out.print("Site name: ");
        inputs[0] = read.nextLine();
        //prompt author, receive in inputs 1
        System.out.print("Author: ");
        inputs[1] = read.nextLine();
        //prompt y/n for folder for javascript, receive in inputs 2
        System.out.print("Do you want a folder for JavaScript?");
        inputs[2] = read.nextLine();
        //prompt y/n for folder for css, receive in inputs 3
        System.out.print("Do you want a folder for CSS?");
        inputs[3] = read.nextLine();
        //return inputs
        return inputs;
    }
    public static String genSite(String[] inputs){
        //string r to be returned
        String r = "";
        //folderPath = path to ex43 + site title
        String folderPath = "src\\main\\java\\ex43\\" + inputs[0];
        //folder is new file at folderPath
        File folder = new File(folderPath);
        //folder becomes directory
        folder.mkdir();
        r += "Created: " + folderPath + "\n";
        //sitePath = path to folder + index.html
        String sitePath = folderPath + "\\index.html";
        //site = new file at index.html
        File site = new File(sitePath);
        r += "Created: " + sitePath + "\n";
        try {
            //filewriter for site
            FileWriter fw = new FileWriter(site);
            //string html has all necessary html formatting with user input added at necessary points
            String html = "<html><head><title>" + inputs[0] + "</title><meta name=\"author\" content=\"" + inputs[1] + "\">" + "</head><body></body>";
            //write in fw (site file) html string
            fw.write(html);
            //close fw
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //if inputs 2 is y
        if(inputs[2].equals("y")){
            //string jspath = folder path + /js
            String jsPath = folder.getPath()+ "\\js";
            //js becomes file
            File js = new File(jsPath);
            //js becomes folder
            js.mkdir();

            r += "Created: " + jsPath + "\n";
        }
        //if inputs 3 is y
        if(inputs[3].equals("y")){
            //cssPath is folder path + /css
            String cssPath = folder.getPath() + "\\css";
            //css becomes file
            File css = new File(cssPath);
            //css becomes folder
            css.mkdir();

            r += "Created: " + cssPath + "\n";
        }
        return r;
    }
}
