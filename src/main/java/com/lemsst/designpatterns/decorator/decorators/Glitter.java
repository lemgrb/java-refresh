package com.lemsst.designpatterns.decorator.decorators;

import com.lemsst.designpatterns.decorator.FlowerBouquet;

public class Glitter extends FlowerBouquetDecorator {

    private FlowerBouquet flowerBouquet;

    public Glitter(FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    @Override
    public String getDescription() {
        return this.flowerBouquet.getDescription() + " with Glitters";
    }

    public double cost() {
        return 4 + flowerBouquet.cost();
    }

}
