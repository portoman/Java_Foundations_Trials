package es.pue.geoapp.views.console;

import es.pue.geoapp.model.businesslayer.entities.Color;
import es.pue.geoapp.model.businesslayer.entities.*;

public class Application {

    public static void main(String[] args) {

        Circle circulo = new Circle(10.0);

        Square sq1 = new Square(2.0);
        System.out.printf("sq1--> side: %.2f %n", sq1.getSide());
        System.out.println(sq1.getArea());
        System.out.println(sq1.getPerimetre());
        Square sq2 = new Square();

        Rectangle r1 = new Rectangle(2.5,5);
        System.out.println(r1.toString());
        
        Rectangle r2 = new Rectangle();
        
        Color c1=new Color();
        Color c2=new Color();
        
        System.out.printf("Color counter is: %d \n" , Color.getCounter());
        
    }
}
