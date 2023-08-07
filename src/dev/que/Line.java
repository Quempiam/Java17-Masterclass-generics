package dev.que;

import java.util.ArrayList;
import java.util.List;

public class Line implements Mappable{
    private List<Point> points = new ArrayList<>(2);

    public Line(Point... points) {
        for (Point p : points) {
            if (p == null) {
                throw new RuntimeException("Cannot initialize 'Line' with 'null' parameters.");
            }
            this.points.add(p);
        }
    }

    public boolean addPoint(Point p, int index) {
        if (p == null) {
            return false;
        }
        if (points.contains(p)) {
            return false;
        }
        points.add(index, p);
        return true;
    }

    public boolean addPoint(Point p) {
        return addPoint(p, points.size());
    }

    public String renderPoint(int index) {
        return points.get(index).render();
    }

    @Override
    public String render() {
        StringBuilder ret = new StringBuilder();
        for (Point p : points) {
            ret.append(p.render());
            ret.append(", ");
        }

        ret.delete(ret.length() - 2, ret.length());
        return ret.toString();
    }
}
