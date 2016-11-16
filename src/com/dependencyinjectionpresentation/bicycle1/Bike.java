package com.dependencyinjectionpresentation.bicycle1;

/**
 * Created by joshuaroberts on 11/16/16.
 */
public class Bike {
    private Frame frame;
    private Wheels wheels;

    public void createBike(){
        frame = new Frame();
        frame.createFrame();

        wheels = new Wheels();
        wheels.createWheels();
    }

}
