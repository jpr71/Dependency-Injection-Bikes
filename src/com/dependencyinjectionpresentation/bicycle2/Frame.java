package com.dependencyinjectionpresentation.bicycle2;

/**
 * Created by joshuaroberts on 11/16/16.
 */
public class Frame implements FrameInterface {

    @Override
    public void createFrame(){
        System.out.println("__ __         ");
        System.out.println("  Y          8");
        System.out.println("  |          |");
        System.out.println("  --------------- ");
        System.out.println(" /              \\");
    }
}
