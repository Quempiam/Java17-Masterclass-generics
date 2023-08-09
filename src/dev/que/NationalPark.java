package dev.que;

import java.util.Locale;

public class NationalPark extends Point{
    private String name;

    public NationalPark(String name, double[] coords) {
        super(coords);
        if (name.isEmpty()){
            this.name = "N/A";
        } else {
            this.name = name;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String render() {
        return String.format(Locale.US, "Render %s National Park as POINT (%s)",
                this.name, super.render());
    }
}
