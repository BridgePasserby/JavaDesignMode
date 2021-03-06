package com.zingking.javadesignmode.factory.simplefactory.product;

/**
 * Copyright (c) 2018, Z.kai All rights reserved.
 * author：Z.kai
 * date：2018/10/16
 * description：
 */
public class FruitOrange implements IFruit {
    @Override
    public void grow() {
        System.out.println("Orange grow.");
    }

    @Override
    public void ripe() {
        System.out.println("Orange ripe.");
    }

    @Override
    public void fade() {
        System.out.println("Orange fade.");
    }
}
