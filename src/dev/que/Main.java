package dev.que;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(new double[]{2.0, 7.66});
        System.out.println(p.render());
        Point pp = new Point(new double[]{88.4545, 98.222124});
        System.out.println(pp.render());

        Line l = new Line(p, pp);
        System.out.println(l.render());
        l.addPoint(new Point(new double[]{55.554, 66.68}));
        System.out.println(l.render());
    }
}
