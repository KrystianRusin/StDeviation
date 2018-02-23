package com.company;

// ---------*---------*---------*---------*
// The use of static imports is something that should be used carefully.
// I have only ever used this technique for the project wide constants.
//
import static com.company.ProjConstants.*;

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
    private int StDeviation;
    private double[] aVariance = new double[MAXDATA];
    private double sumVariance;
    private double variance;



    // ---------*---------*---------*---------*---------*---------*---------*---------*
    // The following method will take a new data item and add it into the 1 Dimensional
    // Array of data values to be used later.
    //
    // You MUST write this method and I will use it during testing
    //
    public void addNewDataItem(int dataItem) {
        Data[i] = dataItem;
        i++;
        System.out.println(dataItem);
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
        average = 0;
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

        for(int y = 0; y<i; y++){
            aVariance[y] = (Data[y] - calcAverage())*(Data[y]- calcAverage());
            System.out.println(aVariance[y]);
        }
        for(int z = 0; z < i; z++){
           sumVariance += aVariance[z];
        }
         variance = sumVariance/i;

        return variance;
    }
}

