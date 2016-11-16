package com.dependencyinjectionpresentation.bicycle3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.dependencyinjectionpresentation.bicycle2.FrameInterface;
import com.dependencyinjectionpresentation.bicycle2.WheelsInterface;



/**
 * Created by joshuaroberts on 11/16/16.
 */
public class ServiceFinder {
    private static ServiceFinder instance;
    private Properties properties;

    private ServiceFinder() throws IOException {
        properties = getProperties();
    }

    public static ServiceFinder getInstance() throws IOException {
        if (instance == null) {
            instance = new ServiceFinder();
        }

        return instance;
    }

    public FrameInterface getFrameService() throws Exception {
        FrameInterface frame = null;

        String name = properties.getProperty("frame.class");
        Class instantiatedClass = Class.forName(name);
        frame = (FrameInterface)instantiatedClass.newInstance();

        return frame;
    }

    public WheelsInterface getWheelsService() throws Exception {
        WheelsInterface wheels = null;

        String name = properties.getProperty("wheels.class");
        Class instantiatedClass = Class.forName(name);
        wheels = (WheelsInterface) instantiatedClass.newInstance();

        return wheels;
    }


    private Properties getProperties() throws IOException {
        Properties properties = new Properties();

        properties.load(new FileInputStream("src/config.properties"));

        return properties;
    }

}
