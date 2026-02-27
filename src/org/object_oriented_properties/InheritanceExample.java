package org.object_oriented_properties;
public class InheritanceExample {
    public static void main(String[] args) {
            Box box1 = new Box(2,4,6);
            Box box2 = new Box(box1);

        System.out.println(box1.length + " " + box1.width + " " + box1.height);
        System.out.println(box2.length + " " + box2.width + " " + box2.height);

        BoxWeight box3 = new BoxWeight(6,7,8,9);
        System.out.println(box3.length + " " + box3.width + " " + box3.height + " " + box3.weight);

        Box box4 = new BoxWeight(12,13,4,8);
        System.out.println(box4.length + " " + box4.width + " " + box4.height);
    }
}
