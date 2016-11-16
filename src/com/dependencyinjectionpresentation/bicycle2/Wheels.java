package com.dependencyinjectionpresentation.bicycle2;

/**
 * Created by joshuaroberts on 11/16/16.
 */
public class Wheels implements WheelsInterface{
    @Override
    public void createWheels() {
        System.out.println(" *               * ");
        System.out.println("***             *** ");
        System.out.println("***             *** ");
    }
}
