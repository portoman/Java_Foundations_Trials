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
public abstract class Shape {

    

    //<editor-fold defaultstate="collapsed" desc="Estado: Atributos/Campos">
    private Color backgroundColor;
    private Color foregroundColor;
    private static int counter=0;
    public static final double DEFAULT_SIZE=1.0;
    public static final double MINIMUM_SIZE=0.0;
    
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Comportamiento: Métodos/Operaciones">
    //<editor-fold defaultstate="collapsed" desc="Getter/Setter">
    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        if (backgroundColor == null) {
            throw new NullPointerException("Es obligatorio indicar el color de fondo");
        }

        this.backgroundColor = backgroundColor;
    }

    public Color getForegroundColor() {
        return foregroundColor;
    }

    public void setForegroundColor(Color foregroundColor) {
        if (foregroundColor == null) {
            throw new NullPointerException("Es obligatorio indicar el color de línea");
        }
        this.foregroundColor = foregroundColor;
    }
    
    public static int getCounter() {
        return counter;
    }

    
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructores">
    
    public Shape(Color backgroundColor, Color foregroundColor){
        counter++;
        this.setBackgroundColor(backgroundColor);
        this.setForegroundColor(foregroundColor);
    }
//</editor-fold>
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Métodos de instancia u objeto">
    
    public abstract double getArea();
    
    public abstract String getDescription();
//</editor-fold>
}
