package com.lemsst.designpatterns.decorator;

import com.lemsst.designpatterns.decorator.FlowerBouquet;
import com.lemsst.designpatterns.decorator.concrete.OrchidBouquet;
import com.lemsst.designpatterns.decorator.concrete.RoseBouquet;
import com.lemsst.designpatterns.decorator.decorators.Glitter;
import com.lemsst.designpatterns.decorator.decorators.PaperWrapper;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FlowerBouquetTest {

    @Test
    public void testFlowerBouquet() {
        FlowerBouquet rose = new Glitter(new PaperWrapper(new RoseBouquet()));
        Assert.assertEquals(rose.getDescription(),"Rose with paper wrapper with Glitters");
    }

    @Test
    public void testFlowerBouquet2() {
        FlowerBouquet rose = new Glitter(new Glitter(new OrchidBouquet()));
        Assert.assertEquals(rose.getDescription(),"Orchid with Glitters with Glitters");
    }

}