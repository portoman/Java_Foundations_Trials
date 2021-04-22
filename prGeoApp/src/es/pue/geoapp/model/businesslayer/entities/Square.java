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
public class Square {
    //<editor-fold defaultstate="collapsed" desc="Estado: Atributos/Campos">

    private double side;
    private final double SIDES=4.0;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Comportamiento: Métodos/Operaciones">
    //<editor-fold defaultstate="collapsed" desc="Getter/Setter">
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public Square(){
        
    }

    public Square(double side) {
        if(side<=0){
            throw new IllegalArgumentException(String.format("Valor %f no valido para el lado de un cuadrado", side));
        }
        
        this.setSide(side);
    }
    
    
//</editor-fold>
    public double getArea(){
        return Math.pow(this.side, 2);
    }
    public double getPerimetre(){
        return this.side*SIDES;
    }
    
    
//</editor-fold>
}
