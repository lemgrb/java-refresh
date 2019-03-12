package com.lemsst.designpatterns.decorator.concrete;

import com.lemsst.designpatterns.decorator.FlowerBouquet;

public class OrchidBouquet extends FlowerBouquet {

    public OrchidBouquet() {
        description = "Orchid";
    }

    @Override
    public double cost() {
        return 20.0;
    }
}
