package com.company;

/**
 * Created by Robert Hubert on 21/02/2018.
 */
public final class ProjConstants {

    // ---------*---------*---------*---------*---------*
    // Integer Constants

    public static final int INVALID = -1;
    public static final int MAXDATA = 2000;

    public static final int INVALID_CALC_METHOD = -11;
    public static final int INVALID_RANGE       = -21;

    public static final int DISCRETE = -111;
    public static final int FRQTABLE = -112;
    public static final int GROUPED  = -113;


    // PRIVATE //

    // ---------*---------*---------*---------*---------*---------*---------*---------*
    // The caller references the constants using ProjConstants.MAXDATA,
    // and so on. So we prevent the caller should be prevented from constructing objects of
    // this class, by declaring this private constructor.
    //
    private ProjConstants(){
        //this prevents even the native class from calling this constructor as well
        throw new AssertionError();
    }


}