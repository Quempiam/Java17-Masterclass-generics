package dev.que;

import java.util.Locale;

public class Point implements Mappable {
    private double[] coords;

    public Point(double[] coords) {
        this.coords = coords;
    }

    public void setLatitude(double lat) {
        coords[0] = lat;
    }

    public void setLongitude(double lon){
        coords[1] = lon;
    }

    public double getLatitude(){
        return coords[0];
    }

    public double getLongitude(){
        return coords[1];
    }

    @Override
    public void render() {
        System.out.printf(Locale.US,"[%f, %f]", coords[0], coords[1]);
    }
}
