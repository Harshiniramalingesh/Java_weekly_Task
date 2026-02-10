package org.object_oriented_properties;
class Speed{
    final int speedLimit = 90;

    void speedChange(){
//        speedLimit = 400;
        System.out.println(speedLimit);
    }
}
public class FinalKeywordExample {
    public static void main(String[] args){
        Speed sp = new Speed();
        sp.speedChange();
    }
}
