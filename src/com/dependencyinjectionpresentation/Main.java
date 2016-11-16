package com.dependencyinjectionpresentation;

import com.dependencyinjectionpresentation.bicycle3.BikeService;

public class Main {

    public static void main(String[] args) {
        BikeService bikeService = null;

        try{
            bikeService = new BikeService();
            bikeService.createBike();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
