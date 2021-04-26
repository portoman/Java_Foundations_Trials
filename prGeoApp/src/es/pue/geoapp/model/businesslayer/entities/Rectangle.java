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
public class Rectangle extends Shape {

    //<editor-fold defaultstate="collapsed" desc="Estado: Atributos/Campos">
    private double base;
    private double height;
    private static int counter = 0;
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Comportamiento: Métodos/Operaciones">
    //<editor-fold defaultstate="collapsed" desc="Getter/Setter">
    public double getBase() {
        return base;
    }

    public void setBase(double base) {

        if (base < 0) {
            throw new IllegalArgumentException(String.format("Valor %f no valido para la base de un rectángulo", base));
        }
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            throw new IllegalArgumentException(String.format("Valor %f no valido para la altura de un rectángulo", height));
        }

        this.height = height;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructores">
   

    public Rectangle(double base, double height, Color backgroundColor, Color foregroundColor) {
        super(backgroundColor, foregroundColor);
        this.setBase(base);
        this.setHeight(height);
        Rectangle.counter++;
    }

    public Rectangle(double base, double height) {
        this(base, height, new Color(Color.MAX_VALUE, Color.MAX_VALUE, Color.MAX_VALUE), new Color(Color.MIN_VALUE, Color.MIN_VALUE, Color.MIN_VALUE));
    }
    
     public Rectangle() {
        this(Shape.DEFAULT_SIZE, Shape.DEFAULT_SIZE);
    }

//</editor-fold>
    @Override
    public double getArea() {
        return this.base * this.height;
    }

    public double getPerimeter() {
        return (2 * this.base) + (2 * this.height);
    }

    public static int getCounter() {
        return Rectangle.counter;
    }
     @Override
    public String getDescription() {
      return String.format("Soy un rectángulo de base %.2f y altura %.2f(color de fondo: %s y color de línea: %s)", 
                 this.getBase(), this.getHeight(), this.getBackgroundColor(), this.getForegroundColor());
     }

//</editor-fold>
    @Override
    public String toString() {
        return "Rectangle{" + "base=" + base + ", height=" + height + '}';
    }

   

}
