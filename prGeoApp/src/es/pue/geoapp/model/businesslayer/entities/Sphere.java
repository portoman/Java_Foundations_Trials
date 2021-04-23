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
public class Sphere {

    //<editor-fold defaultstate="collapsed" desc="Estado: Atributos/Campos">
    private double radius;
    private static int counter = 0;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Comportamiento: Métodos/Operaciones">

    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public Sphere(double radius) {
        this.setRadius(radius);
        Sphere.counter++;
    }

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Getter/Setter">
    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException(String.format("Valor %f no valido para el radio de un esfera", radius));
        }
        this.radius = radius;
    }

    public static int getCounter() {
        return Sphere.counter;
    }
//</editor-fold>

    public double getArea() {
        return 4 * Math.PI * Math.pow(this.radius, 2);
    }

    public double getVolume() {
        return 4d / 3 * Math.PI * Math.pow(this.radius, 3);
    }
//</editor-fold>
}
