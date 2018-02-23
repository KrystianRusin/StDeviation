package com.company;
import java.io.*;
import java.util.*;
import javax.swing.*;


import static com.company.ProjConstants.*;

public class Main {



    public static void main(String[] args) {

        // ---------*---------*---------*---------*---------*
        // Create a new object from the StDeviation Class
        //
        StDeviation calcSDev =  new StDeviation();
        String error = "You made an oops";

        try{
            String fileName =  JOptionPane.showInputDialog("Enter The File Name");
            File f = new File(fileName);
            Scanner s  = new Scanner(f);

            for(int i = 0;i<MAXDATA;i++){
                if(s.hasNextInt()){
                    calcSDev.addNewDataItem(s.nextInt());

                } else {

                }
            }
            s.close();

        }catch(Exception e){
            System.out.println(error);
            e.printStackTrace();
        }

    }
}