package com.company;


import static com.company.ProjConstants.*;

/**
 * Created by Robert Hubert on 21/02/2018.
 */
public class StDeviation {
    //creating necessary variables and arrays
    private int[] Data = new int[MAXDATA];
    private int counter  = 0;
    private double[] aVariance = new double[MAXDATA];


    public void addNewDataItem(int dataItem) {
        //adds data items from file to Array
        Data[counter] = dataItem;
        //setting a counter equal to the total number of data items
        counter++;
    }
    //returns counter
    public int getNumberOfDataItems() {
        return counter;
    }



    public double calcAverage() {
        //resets sum of numbers
       int sum = 0;
        //for loop that adds all of the numbers together
        for(int x = 0; x < counter;x++){
           sum+=Data[x];

        }
        //divides sum by total number of data items
        int average = sum/counter;

        return average;
    }

    public double calcVariance() {
        //resets variables
        double variance = 0;
        double sumVariance = 0;
        //for loop that subtracts the mean of data from the current data item and then squares it for the amount of number of data items
        for(int y = 0; y<counter; y++){
            aVariance[y] = (Data[y] - calcAverage())*(Data[y]- calcAverage());
        }
        //sets int sumVariance equal to the sum of all of the previous calculations
        for(int z = 0; z < counter; z++){
           sumVariance += aVariance[z];
        }
        //divides int sumVariance by number of data items
         variance = sumVariance/counter;

        return variance;
    }

    public double calcVarianceF(){
        //resets variables and creates necessary variables
        double variance = 0;
        int variable[] = new int[MAXDATA];
        double fVariance[] = new double[MAXDATA];
        double sumVariance = 0;
        int frequency;
        int cNum;
        boolean occured = false;

        //sets all numbers in array "variable" to -1
        for(int l = 0; l<counter;l++){
            variable[l] = INVALID;
        }
        //for loop that counts frequency of each data item
        for(int k = 0; k <counter; k++){
            frequency = 0; //resetting frequency variable
            cNum = Data[k]; //setting integer equal to number in data
            for (int j = 0; j <counter;j++){
                occured = false;
                if(cNum == variable[j]){ //if number in array is equal to a number in array at int j, set occured equal to true and stop the for loop
                    occured = true;
                    break;
                }
            }
            for(int h = 0; h<counter; h++){ //for loop that increases frequency if that number has not occured previously
                if(!occured&&cNum==Data[h]){
                    frequency++;
                }
                variable[k] = cNum;
            }
            //calculates variance using frequency
            fVariance[k] = ((Data[k] - calcAverage())*(Data[k]- calcAverage()))*frequency;
            variance += fVariance[k];
        }
        variance = variance/counter;
      return variance;
    }

    public double calcStandardDeviation(){
        //finds the square root of variance to calculate the standard deviation
        double StDeviation = Math.sqrt(calcVariance());
        return StDeviation;
    }

    public double calcStandardDeviationG(){

        return INVALID;
    }


}

