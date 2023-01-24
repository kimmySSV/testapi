package com.ldb.testapi.Model;

public class Test {
    private String atmId;
    private String Location;

    public Test() {
    }



    public Test(String atmId, String Location) {
        this.atmId = atmId;
        this.Location = Location;
    }

    public Test(String atmId) {
        this.atmId = atmId;
        this.Location = Location;
    }

    public String getAtmId() {
        return atmId;
    }

    public void setAtmId(String atmId) {
        this.atmId = atmId;
    }

   

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    @Override
    public String toString() {
        return "Test{" +
                "atmId='" + atmId + '\'' +
                ", Location='" + Location + '\'' +
                '}';
    }
}
