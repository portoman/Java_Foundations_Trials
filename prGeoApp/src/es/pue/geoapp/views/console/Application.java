package es.pue.geoapp.views.console;

import es.pue.geoapp.model.businesslayer.entities.Color;
import es.pue.geoapp.model.businesslayer.entities.*;

public class Application {

    public static void main(String[] args) {

        Circle circulo = new Circle(10.0);

         Color c1 = new Color();
        Color c2 = new Color();
        
        Square sq1 = new Square(2.0);
        sq1.setBackgroundColor(c1);
        sq1.setForegroundColor(c2);
        
        System.out.printf("sq1--> side: %.2f %n", sq1.getSide());
        System.out.println(sq1.getArea());
        System.out.println(sq1.getPerimetre());
        Square sq2 = new Square();

        Rectangle r1 = new Rectangle(2.5, 5, c1, c2);
        System.out.println(r1.toString());

        Rectangle r2 = new Rectangle();

        System.out.println(r2.getDescription());

        System.out.printf("Color counter is: %d \n", Color.getCounter());

        Color c3 = Color.getRandomColor();
        System.out.println("c3 = " + c3.toString());

        Color c4 = Color.fromHexString("#FFFFFF");
        System.out.printf("c4-> r: %d g: %d b: %d %n%n", c4.getRed(), c4.getGreen(), c4.getBlue());
        System.out.printf("c4-> %s %n%n", c4.toRGBString());
        System.out.printf("c4-> %s %n%n", c4.toHexString(false));
        System.out.printf("c4-> %s %n%n", c4.toHexString());

        
        
        Color c5 = Color.fromHexString("#FFCA15");
        System.out.printf("c5-> r: %d g: %d b: %d %n%n", c5.getRed(), c5.getGreen(), c5.getBlue());
        System.out.printf("c5-> %s %n%n", c5.toRGBString());
        
        System.out.println("------------------------");
        System.out.printf("Contador círculos: %d %n", Circle.getCounter());
        System.out.printf("Contador colores: %d %n", Color.getCounter());
        System.out.printf("Contador rectángulos: %d %n", Rectangle.getCounter());
        System.out.printf("Contador esferas: %d %n", Sphere.getCounter());
        System.out.printf("Contador cuadrados: %d %n", Square.getCounter());
        System.out.printf("Total de figuras: %d %n", Shape.getCounter());
    }
}
