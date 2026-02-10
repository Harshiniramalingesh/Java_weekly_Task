package org.object_oriented_properties;

public class Box {
    int length;
    int width;
    int height;


    Box(int l,int w,int h){
        this.length = l;
        this.width = w;
        this.height = h;
    }

    Box(Box box){
        this.length = box.length;
        this.width = box.width;
        this.height = box.height;
    }
}
