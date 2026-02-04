package baitap_tonghop;

import java.util.Random;

public abstract class Shape {
    private double perimeter;
    private double acreage;


    public void caculatorShape(double heigth, double width) {
        perimeter = 2 * (heigth + width);
        acreage = heigth * width;
    }

    public void caculatorShape(double a, double b, double c) {
        perimeter = a + b + c;

        double p = (a + b + c) / 2;
        acreage = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }


    public void caculatorShape(double r) {
        perimeter = 2 * Math.PI * r;
        acreage = Math.PI * r * r;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Shape[] shapes = new Shape[10];


        for (int i = 0; i < shapes.length; i++) {
            int type = rand.nextInt(3);
            switch (type) {
                case 0:
                    double width = rand.nextInt(10) + 1;
                    double heigth = rand.nextInt(10) + 1;
                    shapes[i] = new Rectangle(width,heigth);
                    shapes[i].caculatorShape(width,heigth);
                    break;
                case 1:

                    double a = rand.nextInt(10) + 1;
                    double b = rand.nextInt(10) + 1;
                    double c = rand.nextInt(10) + 1;

                    if (a + b <= c) c = a + b - 1;
                    shapes[i] = new Triangle(a, b, c);
                    shapes[i].caculatorShape(a,b,c);
                    break;
                case 2:
                    double r = rand.nextInt(10) + 1;
                    shapes[i] = new Circle(r);
                    shapes[i].caculatorShape(r);
                    break;
            }
        }


        for (int i = 0; i < shapes.length; i++) {
            Shape shape = shapes[i];
            String type = shape.getClass().getSimpleName();

            System.out.println(type + shape.toString() + " | Chu vi: " + shape.perimeter + " | Diện tích: " + shape.acreage);
        }

        int countRec = 0;
        int countTri = 0;
        int countCir = 0;


        for (Shape shape : shapes){
            if (shape instanceof  Rectangle){
                countRec++;
            }
            if (shape instanceof  Triangle){
                countTri++;
            }
            if (shape instanceof  Circle){
                countCir++;
            }
        }


        System.out.println("Số lượng hình chữ nhật: " + countRec);
        System.out.println("Số lượng hình tam giác: " + countTri);
        System.out.println("Số lượng hình tròn: " + countCir);


    }
}
