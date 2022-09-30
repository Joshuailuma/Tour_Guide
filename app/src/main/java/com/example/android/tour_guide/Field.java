package com.example.android.tour_guide;

public class Field {
    private static final int NO_IMAGE_PROVIDED = -1;
    private String mTitle;
    private String mDescription1;
    private String mDescription2;
    private int mImageResourceId;

    /* @param title
    @param description1
    @param imageResourceId
    @param description2
    * */
    public Field(String title, String description1, String description2, int imageResourceId) {
        mTitle = title;
        mDescription1 = description1;
        mDescription2 = description2;
        mImageResourceId = imageResourceId;
    }

    /*Get the Title
     * */
    public String getTitle() {
        return mTitle;
    }

    /*Get the first description
     * */
    public String getDescription1() {
        return mDescription1;
    }

    /*Get the second description
     * */
    public String getDescription2() {
        return mDescription2;
    }

    /*Get the image resource id
     * */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /*Check if image resource is present
     * */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}