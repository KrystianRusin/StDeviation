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
        String error = " FIX IT "; //creating string to output as an error message

        try{ //tells program to try the following commands and print out any exceptions found if it does not work
            String fileName =  JOptionPane.showInputDialog("Enter The File Name"); //setting string equal to user input
            int precision = Integer.parseInt(JOptionPane.showInputDialog("Enter Precison")); //parsing for integers in user input for desired accuracy
            File f = new File(fileName + ".txt"); //creaing file name equal to user input
            Scanner s  = new Scanner(f); //scanner that scans file


            //for loop that adds data to array in STDeviation class
            for(int i = 0;i<MAXDATA;i++){
                if(s.hasNextInt()){
                    calcSDev.addNewDataItem(s.nextInt());
                } else {
                    break;
                }
            }
            s.close();//closes scanner
            System.out.printf("VARIANCE F %." +precision + "f\n", calcSDev.calcVarianceF());
            System.out.printf("MEAN %." +precision + "f\n", calcSDev.calcAverage());
            System.out.printf("VARIANCE %." + precision + "f\n", calcSDev.calcVariance());
            System.out.printf("VARIANCE WITH FREQUENCY: %."+precision + "f\n", calcSDev.calcVarianceF());
            System.out.printf("STANDARD DEVIATION %." + precision + "f\n", calcSDev.calcStandardDeviation());
            System.out.printf("68 percent of the data falls between %." + precision + "f", calcSDev.calcAverage() - calcSDev.calcStandardDeviation());
            System.out.printf(" and %." + precision + "f\n", calcSDev.calcAverage() + calcSDev.calcStandardDeviation());
            System.out.printf("95 percent of the data falls between %."+precision+"f" , calcSDev.calcAverage() - (calcSDev.calcStandardDeviation()*2));
            System.out.printf(" and %." + precision + "f\n",calcSDev.calcAverage() + (calcSDev.calcStandardDeviation()*2));
            System.out.printf("99 percent of the data falls between %."+precision+"f" , calcSDev.calcAverage() - (calcSDev.calcStandardDeviation()*3));
            System.out.printf(" and %." + precision + "f",calcSDev.calcAverage() + (calcSDev.calcStandardDeviation()*3));

        }catch(Exception e){ //catch statement for try that prints out exception statement and error message when exception is found
            System.out.println(error);
            e.printStackTrace();


        }

    }
}