package com.lemsst.designpatterns.decorator;

public abstract class FlowerBouquet {
    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
