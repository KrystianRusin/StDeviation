package com.company;


import static com.company.ProjConstants.*;

/**
 * Created by Robert Hubert on 21/02/2018.
 */
public class StDeviation {

    private int[] Data = new int[MAXDATA];
    private int counter  = 0;
    private double[] aVariance = new double[MAXDATA];


    public void addNewDataItem(int dataItem) {
        Data[counter] = dataItem;
        counter++;
    }

    public int getNumberOfDataItems() {
        return counter;
    }



    public double calcAverage() {
       int sum = 0;

        for(int x = 0; x < counter;x++){

           sum+=Data[x];

        }
        int average = sum/counter;

        return average;
    }

    public double calcVariance() {
        double variance = 0;
        double sumVariance = 0;

        for(int y = 0; y<counter; y++){
            aVariance[y] = (Data[y] - calcAverage())*(Data[y]- calcAverage());
        }

        for(int z = 0; z < counter; z++){
           sumVariance += aVariance[z];
        }
         variance = sumVariance/counter;

        return variance;
    }

    public double calcVarianceF(){
        double variance = 0;
        int variable[] = new int[MAXDATA];
        double fVariance[] = new double[MAXDATA];
        double sumVariance = 0;
        int frequency;
        int cNum;
        boolean occured = false;


        for(int l = 0; l<counter;l++){
            variable[l] = INVALID;
        }
        for(int k = 0; k <counter; k++){
            frequency = 0;
            cNum = Data[k];
            for (int j = 0; j <counter;j++){
                occured = false;
                if(cNum == variable[j]){
                    occured = true;
                    break;
                }
            }
            for(int h = 0; h<counter; h++){
                if(!occured&&cNum==Data[h]){
                    frequency++;
                }
                variable[k] = cNum;
            }

            fVariance[k] = ((Data[k] - calcAverage())*(Data[k]- calcAverage()))*frequency;
            System.out.println(fVariance[k]);
            variance += fVariance[k];
            variance = variance/counter;
        }
      return variance;
    }

    public double calcStandardDeviation(){
       double StDeviation = Math.sqrt(calcVariance());
        return StDeviation;
    }

}

