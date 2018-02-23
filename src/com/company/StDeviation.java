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

        // temporary value
        return INVALID;
    }

    // ---------*---------*---------*---------*---------*---------*---------*---------*
    // The following method returns a double precision value which is the average of all
    // of the data values
    //
    // You MUST write this method and I will use it during testing
    //
    public double calcAverage() {

        // temporary value
        return INVALID;
    }

    // ---------*---------*---------*---------*---------*---------*---------*---------*
    // The following method returns a double precision value which is the Variance of all
    // of the data values
    //
    // You MUST write this method and I will use it during testing
    //
    public double calcVariance() {

        // temporary value
        return INVALID;
    }
}

