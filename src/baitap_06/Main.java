package baitap_06;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle(4, 5));
        shapes.add(new Circle(2));
        shapes.add(new Circle(10, true));

        double totalArea = 0;
        for (Shape s : shapes) {
            System.out.println(s.getClass().getSimpleName() + " | Diện tích: " + s.area());
            totalArea += s.area();
        }

        System.out.println("Tổng diện tích: " + totalArea);
    }
}