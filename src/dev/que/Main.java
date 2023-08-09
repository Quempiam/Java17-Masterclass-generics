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

        NationalPark grandCanyon = new NationalPark("Grand Canyon",
                new double[]{36.28124634465445, -112.35443469811446});
        System.out.println(grandCanyon.render());

        River nile = new River("", 6550.0,
                new Point(new double[]{0.42112854146819506, 33.193817356676256}),
                new Point(new double[]{3.4505844785062543, 31.66122459951453}),
                new Point(new double[]{9.411267088001848, 30.400764048838443}),
                new Point(new double[]{24.394102051654354, 33.238319221049764}));

        nile.addPoint(new Point(new double[]{31.469200846815554, 30.366431872386688}));
        System.out.println(nile.render());
        nile.setName("Nile");
        System.out.println(nile.render());

        Layer<NationalPark> parksLayer = new Layer<>();
        parksLayer.addElement(grandCanyon);
        parksLayer.renderLayer();
        System.out.println("-".repeat(20));

        System.out.println(parksLayer.addElement(grandCanyon));
        System.out.println(parksLayer.removeElement(grandCanyon));
        System.out.println(parksLayer.renderLayer());
        System.out.println("-".repeat(20));

        System.out.println(parksLayer.addElement(grandCanyon));
        System.out.println(parksLayer.renderLayer());
    }
}
