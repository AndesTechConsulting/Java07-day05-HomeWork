package org.abdestech.learning.rfb18;

public class Library  {

    private String LName, LAddress;

    Library(String LName, String LAddress) {
        this.LName = LName;
        this.LAddress = LAddress;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getLAddress() {
        return LAddress;
    }

    public void setLAddress(String LAddress) {
        this.LAddress = LAddress;
    }


}
