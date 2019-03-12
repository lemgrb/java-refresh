package com.lemsst.designpatterns.decorator.concrete;

import com.lemsst.designpatterns.decorator.FlowerBouquet;

public class RoseBouquet extends FlowerBouquet {

    public RoseBouquet() {
        description = "Rose";
    }

    @Override
    public double cost() {
        return 12.0;
    }

}

