package org.object_oriented_properties;

public class BoxWeight extends Box{
    int weight;

    BoxWeight(int l,int w,int h,int weight){
        /* whether length in box class is private but when it is used in super class
        only private variable class(Box) is initiating,So it will not give me an error. */
        super(l,w,h);
        this.weight = weight;
    }

}
