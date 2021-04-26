/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.pue.geoapp.model.businesslayer.entities;

/**
 *
 * @author portb
 */
public class Square extends Shape{

    //<editor-fold defaultstate="collapsed" desc="Estado: Atributos/Campos">
    private double side;
    private final double SIDES = 4.0;
    private static int counter = 0;
   
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Comportamiento: Métodos/Operaciones">
    //<editor-fold defaultstate="collapsed" desc="Getter/Setter">

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public static int getCounter() {
        return Square.counter;
    }

     @Override
    public double getArea() {
        return Math.pow(this.side, 2);
    }

    public double getPerimetre() {
        return this.side * SIDES;
    }

     @Override
     public String getDescription(){
         return String.format("Soy un cuadrado de lado %.2f (color de fondo: %s y color de línea: %s)", 
                 this.getSide(), this.getBackgroundColor(), this.getForegroundColor());
     }


//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    

    public Square(double side, Color backgroundColor, Color foregroundColor) {
        super(backgroundColor, foregroundColor);
        if (side < 0) {
            throw new IllegalArgumentException(String.format("Valor %f no valido para el lado de un cuadrado", side));
        }

        this.setSide(side);
        counter++;
    }

    public Square(double side) {
        this(side, new Color(Color.MAX_VALUE, Color.MAX_VALUE, Color.MAX_VALUE), new Color(Color.MIN_VALUE, Color.MIN_VALUE, Color.MIN_VALUE));
    }
    //Constructor chaining
    public Square() {
        this(Shape.DEFAULT_SIZE);
    }
    
//</editor-fold>
//</editor-fold>
}
