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
public class AlphaColor extends Color{
    
    //<editor-fold defaultstate="collapsed" desc="Estado: Atributos/Campos">
    private double alpha;
    public static final double MAX_ALPHA=1.0;
    public static final double MIN_ALPHA=0.0;
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Comportamiento: Métodos/Operaciones">
    
    //<editor-fold defaultstate="collapsed" desc="Getter/Setter">
     public double getAlpha() {
        return alpha;
    }

    public void setAlpha(double alpha) {
        if(alpha<MIN_ALPHA ||alpha >MAX_ALPHA){
            throw new IllegalArgumentException(String.format("Valor %.2f no válido como transparencia.", alpha));
        }
        this.alpha = alpha;
    }
    
    
//</editor-fold>
    
//</editor-fold>

   
}
