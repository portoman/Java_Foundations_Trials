/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafoundationstrial;

import java.util.ArrayList;

/**
 *
 * @author portb
 */
public class JavaFoundationsTrial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Hola");
        float x = 85f;
        long p = 58L;
        x = p;

        double dou = 7;

        double d = p;

        boolean b = false;
        if (b = true) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        ArrayList<String> cosas = new ArrayList();
        cosas.add("Silla");
        cosas.add("Mesa");
        cosas.add("Puerta");
        System.out.println(cosas.size());
        System.out.println("cosas = " + cosas);
        
        cosas.remove(1);
        System.out.println("cosas = " + cosas);
        
        cosas.remove("Puerta");
        System.out.println("cosas = " + cosas);
        
        cosas.add("Lápiz");
        cosas.add("Ratón");
        cosas.add("Portatil");
        System.out.println("cosas = " + cosas);
        
        for(String x5:cosas){
        System.out.println(x5);
    }
        

    }
}
