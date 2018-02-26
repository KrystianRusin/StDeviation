package com.company;

// ---------*---------*---------*---------*
// The use of static imports is something that should be used carefully.
// I have only ever used this technique for the project wide constants.
//
import static com.company.ProjConstants.*;
import java.math.*;

/**
 * Created by Robert Hubert on 21/02/2018.
 */
public class StDeviation {


    // ---------*---------*---------*---------*---------*---------*---------*---------*
    // As discussed in class we are using a class populated with Project Constants to
    // ensure help manage the project data. This ensures that each class can access the
    // constant values, but in the event that a change is needed/required that this will
    // only need to be made in one location, or file.
    //
    // Notice: If I had not done the "static import com.company.ProjConstants.*;" then
    //         the use of the constant would have been written as:
    //
    //         private int[] Data = new int[ProjConstants.MAXDATA];
    //
    private int[] Data = new int[MAXDATA];
    private int i  = 0;
    private int sum;
    private int average;
    private double StDeviation;
    private double[] aVariance = new double[MAXDATA];
    private double sumVariance;
    private double variance;

    public String KeepOut(){
            String range = "68% of the data falls in between " + (calcAverage() - StDeviation) + " and " + (calcAverage() + StDeviation) + "\n" +
                    "95% of the data falls in between " + (calcAverage() - (2 * StDeviation)) + " and " + (calcAverage() + (2 * StDeviation)) + "\n" +
                    "99% of the data falls in between " + (calcAverage() - (3 * StDeviation)) + " and " + (calcAverage() + (3 * StDeviation));
            return range;
    }



    // ---------*---------*---------*---------*---------*---------*---------*---------*
    // The following method will take a new data item and add it into the 1 Dimensional
    // Array of data values to be used later.
    //
    // You MUST write this method and I will use it during testing
    //
    public void addNewDataItem(int dataItem) {
        Data[i] = dataItem;
        i++;
    }

    // ---------*---------*---------*---------*---------*---------*---------*---------*
    // The following method will return the total number of data items currently stored
    //
    // You MUST write this method and I will use it during testing
    //
    public int getNumberOfDataItems() {
        return i;
    }

    // ---------*---------*---------*---------*---------*---------*---------*---------*
    // The following method returns a double precision value which is the average of all
    // of the data values
    //
    // You MUST write this method and I will use it during testing
    //
    public double calcAverage() {
        sum = 0;

        for(int x = 0; x < i;x++){

           sum+=Data[x];

        }

        average = sum/i;

        return average;
    }


    // ---------*---------*---------*---------*---------*---------*---------*---------*
    // The following method returns a double precision value which is the Variance of all
    // of the data values
    //
    // You MUST write this method and I will use it during testing
    //
    public double calcVariance() {
        variance = 0;
        sumVariance = 0;

        for(int y = 0; y<i; y++){
            aVariance[y] = (Data[y] - calcAverage())*(Data[y]- calcAverage());
        }

        for(int z = 0; z < i; z++){
           sumVariance += aVariance[z];
        }
         variance = sumVariance/i;

        return variance;
    }

    // ---------*---------*---------*---------*---------*---------*---------*---------*
    // The following method returns a double precision value which is the Standard
    // Deviation of all of the data values
    //
    // You MUST write this method and I will use it during testing
    //

    public double calcStandardDeviation(){
        StDeviation = Math.sqrt(calcVariance());
        System.out.println(KeepOut());

        return StDeviation;
    }

}

