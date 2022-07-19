package com.knubisoft.base.queue.car;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
