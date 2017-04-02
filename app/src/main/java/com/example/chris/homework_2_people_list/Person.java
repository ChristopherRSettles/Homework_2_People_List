package com.example.chris.homework_2_people_list;

import android.widget.ImageView;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Chris on 3/4/2017.
 */

public class Person {

    private UUID mID;
    private String mPhoneNumber, mPersonName;
    private ImageView mImageView;

    public UUID getID() {
        return mID;
    }

    public void setID(UUID mID) {
        this.mID = mID;
    }

    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    public void setPhoneNumber(String mPhoneNumber) {
        this.mPhoneNumber = mPhoneNumber;
    }

    public String getPersonName() {
        return mPersonName;
    }

    public void setPersonName(String mPersonName) {
        this.mPersonName = mPersonName;
    }

    public ImageView getImageView() {
        return mImageView;
    }

    public void setImageView(ImageView mImageView) {
        this.mImageView = mImageView;
    }



//    private UUID mID;
//    private String mTitle;
//    private Date mDate;
//    private boolean mSolved;
//
//    Person()
//    {
//        mID = UUID.randomUUID();
//        mDate = new Date();
//
//    }
//
//    public boolean isSolved() {
//        return mSolved;
//    }
//
//
//    public void setSolved(boolean solved) {
//        mSolved = solved;
//    }
//
//    public Date getDate() {
//        return mDate;
//    }
//
//    public void setDate(Date date) {
//        mDate = date;
//    }
//
//    public UUID getID() {
//        return mID;
//    }
//
//    public String getTitle() {
//        return mTitle;
//    }
//
//    public void setTitle(String title) {
//        mTitle = title;
//    }

}
