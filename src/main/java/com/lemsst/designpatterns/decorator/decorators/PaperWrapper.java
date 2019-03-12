package com.lemsst.designpatterns.decorator.decorators;

import com.lemsst.designpatterns.decorator.FlowerBouquet;

public class PaperWrapper extends FlowerBouquetDecorator {

    private FlowerBouquet flowerBouquet;

    public PaperWrapper(FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    @Override
    public String getDescription() {
        return this.flowerBouquet.getDescription() + " with paper wrapper";
    }

    @Override
    public double cost() {
        return 5 + this.flowerBouquet.cost();
    }
}
