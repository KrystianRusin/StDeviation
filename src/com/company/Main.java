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
        String error = " FIX IT ";

        try{
            String fileName =  JOptionPane.showInputDialog("Enter The File Name");
            int precision = Integer.parseInt(JOptionPane.showInputDialog("Enter Precison"));
            File f = new File(fileName + ".txt");
            Scanner s  = new Scanner(f);

            for(int i = 0;i<MAXDATA;i++){
                if(s.hasNextInt()){
                    calcSDev.addNewDataItem(s.nextInt());
                } else {
                    break;
                }
            }
            s.close();
            calcSDev.calcVarianceF();
           /* System.out.printf("MEAN %." +precision + "f\n", calcSDev.calcAverage());
            System.out.printf("VARIANCE %." + precision + "f\n", calcSDev.calcVariance());
            System.out.printf("VARIANCE WITH FREQUENCY: %."+precision + "f\n", calcSDev.calcVarianceF());
            System.out.printf("STANDARD DEVIATION %." + precision + "f\n", calcSDev.calcStandardDeviation());
            System.out.printf("68 percent of the data falls between %." + precision + "f", calcSDev.calcAverage() - calcSDev.calcStandardDeviation());
            System.out.printf(" and %." + precision + "f\n", calcSDev.calcAverage() + calcSDev.calcStandardDeviation());
            System.out.printf("95 percent of the data falls between %."+precision+"f" , calcSDev.calcAverage() - (calcSDev.calcStandardDeviation()*2));
            System.out.printf(" and %." + precision + "f\n",calcSDev.calcAverage() + (calcSDev.calcStandardDeviation()*2));
            System.out.printf("99 percent of the data falls between %."+precision+"f" , calcSDev.calcAverage() - (calcSDev.calcStandardDeviation()*3));
            System.out.printf(" and %." + precision + "f",calcSDev.calcAverage() + (calcSDev.calcStandardDeviation()*3));
*/

        }catch(Exception e){
            System.out.println(error);
            e.printStackTrace();


        }

    }
}