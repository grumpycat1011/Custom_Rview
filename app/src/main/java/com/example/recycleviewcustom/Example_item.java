package com.example.recycleviewcustom;

public class Example_item {
    private String mMagnitude;
    private String mLocation;
    private String mDate;

    public Example_item(String mMagnitude, String mLocation, String mDate) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mDate = mDate;
    }

    public String getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmDate() {
        return mDate;
    }
}
