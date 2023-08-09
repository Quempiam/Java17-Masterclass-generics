package dev.que;

import java.util.Locale;

public class River extends Line{
    private String name;
    private double lengthKm;

    public River(String name, double lengthKm, Point... points) {
        super(points);
        if (name.isEmpty()){
            this.name = "N/A";
        } else {
            this.name = name;
        }

        if (lengthKm < 0.0) {
            this.lengthKm = 0.0;
        } else {
            this.lengthKm = lengthKm;
        }
    }

    public River(String name, Point... points) {
        this(name, 0.0, points);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLengthKm(double lengthKm) {
        this.lengthKm = lengthKm;
    }

    public double getLengthKm() {
        return lengthKm;
    }

    @Override
    public String render() {
        return String.format(Locale.US, "Render %s River as LINE (%s)",
                this.name, super.render());
    }
}
