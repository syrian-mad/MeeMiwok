package com.example.android.meemiwok;

/**
 * Created by MacBookPro on 8/14/17.
 */

public class MyClass {
    private String mMiwokText;
    private String mDefultText;
    private int mImage = NO_IMAGE_TO_VIEW;
    private static final int NO_IMAGE_TO_VIEW = -1;

    // setters and getters

    public String getmMiwokText() {
        return mMiwokText;
    }

    public void setmMiwokText(String mMiwokText) {
        this.mMiwokText = mMiwokText;
    }

    public String getmDefultText() {
        return mDefultText;
    }

    public void setmDefultText(String mDefultText) {
        this.mDefultText = mDefultText;
    }

    public int getmImage() {
        return mImage;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }

    /*
    / method to make the adapter know if there is an image or not
    / @return true when there is an image
     */
    public boolean hasImage(){
        return mImage != NO_IMAGE_TO_VIEW;
    }

    //// main methods

    public MyClass(String defultText ,String miwokText , int image){
        setmDefultText(defultText);
        setmMiwokText(miwokText);
        setmImage(image);
    }
    public MyClass(String miwokText,String defultText){
        setmMiwokText(miwokText);
        setmDefultText(defultText); }


}


