package com.dependencyinjectionpresentation.bicycle3;

import com.dependencyinjectionpresentation.bicycle2.FrameInterface;
import com.dependencyinjectionpresentation.bicycle2.WheelsInterface;

/**
 * Created by joshuaroberts on 11/16/16.
 */
public class BikeService {
    private FrameInterface frame;
    private WheelsInterface wheels;

    public BikeService() throws Exception {
        frame = ServiceFinder.getInstance().getFrameService();
        wheels = ServiceFinder.getInstance().getWheelsService();
    }

    public void createBike(){
        frame.createFrame();
        wheels.createWheels();
    }

    public void setWheels(WheelsInterface wheels) {
        this.wheels = wheels;
    }

    public WheelsInterface getWheels() {
        return wheels;
    }

    public FrameInterface getFrame() {
        return frame;
    }

    public void setFrame(FrameInterface frame) {
        this.frame = frame;
    }

}

