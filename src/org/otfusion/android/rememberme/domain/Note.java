/*
 * Note.java:
 * Saturday 16 June 2012
 * Remember Me is a notepad that will remember the notes
 * when you are near a location.
 * 
 * Coded by Jose Miguel Salcido (jms)
 */
package org.otfusion.android.rememberme.domain;

import android.text.format.Time;

/**
 * A personal Note.
 * @author jms
 */
public class Note {
    
    // Database Constants 
    public static final String DB_KEY_ROWID = "_id";
    public static final String DB_KEY_TITLE = "title";
    public static final String DB_KEY_BODY = "body";
    public static final String DB_KEY_TIME = "time";
    
    private long mId;
    private String mTitle;
    private String mBody;
    private Time mTime;
    private Place mPlace;
    
    public Note() {
        this.mTitle = null;
        this.mBody = null;
        this.mTime = new Time();
        this.mPlace = null;
    }
    
    public Note(long id) {
        this.mId = id;
    }
    
    public Note(long id, String title) {
        this.mId = id;
        this.mTitle = title;
        this.mTime = new Time();
    }
    
    public Note(String title) {
        this.mTitle = title;
        this.mTime = new Time();
    }
    
    public Note(String title, String body) {
        this.mTitle = title;
        this.mBody = body;
        this.mTime = new Time();
    }
    
    public Note(String title, String body, Place place) {
        this.mTitle = title;
        this.mBody = body;
        this.mTime = new Time();
        this.mPlace = place;
    }
    
    public Note(String title, String body, Time time) {
        this.mTitle = title;
        this.mBody = body;
        this.mTime = time;
    }
    
    public Note(long id, String title, String body, Time time) {
        this.mId = id;
        this.mTitle = title;
        this.mBody = body;
        this.mTime = time;
    }
    
    public Note(long id, String title, String body, Time time, Place place) {
        this.mId = id;
        this.mTitle = title;
        this.mBody = body;
        this.mTime = time;
        this.mPlace = place;
    }
    
    //id
    public long getId() {
        return mId;
    }
    
    public void setId(long id) {
        this.mId = id;
    }
    
    //title
    public String getTitle() {
        return mTitle;
    }
    
    public void setTitle(String title) {
        this.mTitle = title;
    }
    //body
    public String getBody() {
        return mBody;
    }
    
    public void setBody(String body) {
        this.mBody = body;
    }
    //time
    public Time getTime() {
        return mTime;
    }
    
    public void setTime(Time time) {
        this.mTime = time;
    }
    
    public void setTime(long time) {
        mTime.set(time);
    }
    
    //location
    public Place getLocation() {
        return mPlace;
    }
    
    public void setLocation(Place place) {
        this.mPlace = place;
    }
}
