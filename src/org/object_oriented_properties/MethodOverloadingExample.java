package org.object_oriented_properties;

public class MethodOverloadingExample {
    static int add(int a, int b) {
        return a + b;
    }
    static int add(int a, int b, int c) {

        return a + b + c;
    }

    static double add(double a,double b,double c,double d){

        return a + b + c + d;
    }
    public static void main(String[] args){
        System.out.println(MethodOverloadingExample.add(11, 11));

        System.out.println(MethodOverloadingExample.add(11, 11, 11));

                System.out.println(MethodOverloadingExample.add(9.9,8.7,5.6,7.8));
    }

}
