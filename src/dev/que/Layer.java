package dev.que;

import java.util.ArrayList;
import java.util.List;

public class Layer<T extends Mappable> {
    private List<T> elements;

    public Layer() {
        elements = new ArrayList<>();
    }

    public boolean addElement(T e) {
        if (e == null) {
            return false;
        }

        if (elements.contains(e)) {
            return false;
        }
        elements.add(e);
        return true;
    }

    public boolean removeElement(T e) {
        return elements.removeAll(List.of(e));
    }

    public boolean renderLayer() {
        if (elements.isEmpty()) {
            return false;
        }

        for (T e : elements) {
            System.out.println(e.render());
        }

        return true;
    }

}
