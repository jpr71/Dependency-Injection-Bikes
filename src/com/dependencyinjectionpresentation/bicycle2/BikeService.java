package com.dependencyinjectionpresentation.bicycle2;

/**
 * Created by joshuaroberts on 11/16/16.
 */
public class BikeService {
    private FrameInterface frame;
    private WheelsInterface wheels;


    public BikeService(FrameInterface frame, WheelsInterface wheels){
        this.frame = frame;
        this.wheels = wheels;
    }

    public BikeService() {};

    public void createBike(){
        frame.createFrame();
        wheels.createWheels();
    }

    public FrameInterface getFrame() {
        return frame;
    }

    public void setFrame(FrameInterface frame) {
        this.frame = frame;
    }

    public WheelsInterface getWheels() {
        return wheels;
    }

    public void setWheels(WheelsInterface wheels) {
        this.wheels = wheels;
    }

}
