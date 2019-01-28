package com.example.android.recentquake;

/**
 * Created by maruf on 14-Oct-16.
 */
public class Earthquake {


    private double mMag;
    private String mPlace;
    private long mDate;
    private String mUrl;

    public Earthquake(double mag, String place, long date, String url){

        mMag = mag;
        mPlace = place;
        mDate = date;
        mUrl=url;
    }

    public double getmMag(){ return  mMag;}

    public String getmPlace(){ return  mPlace;}

    public long getmDate(){ return  mDate;}

    public String getmUrl(){ return  mUrl;
    }
}

