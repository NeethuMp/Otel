package com.oteltechnologies.databasesample;

/**
 * Created by Qvertz on 1/12/2017.
 */

public class UserData {

    String name;
    String date;

    public UserData(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public UserData() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
