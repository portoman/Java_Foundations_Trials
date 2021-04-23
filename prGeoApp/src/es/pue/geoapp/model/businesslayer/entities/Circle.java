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
public class Circle {

    //<editor-fold defaultstate="collapsed" desc="Estado: Atributos/Campos">
    private double radius;
    private static int counter = 0;
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Comportamiento: Métodos/Operaciones">
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public Circle(double radius) {
        this.setRadius(radius);
        Circle.counter++;
    }

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Getter/Setter">
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException(String.format("Valor %f no valido para el radio de un circulo", radius));
        }
        this.radius = radius;
    }
//</editor-fold>

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public static int getCounter() {
        return counter;
    }
}

//</editor-fold>

