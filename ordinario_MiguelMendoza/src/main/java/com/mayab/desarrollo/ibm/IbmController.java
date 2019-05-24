/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.desarrollo.ibm;

/**
 *
 * @author migue
 */
public class IbmController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       PersonaVenta venta = new PersonaVenta("miguel mendoza");
       Hacienda adp = new Adapter(venta);
       System.out.println("adaptada: ");
       System.out.println(adp.getNombre());
       System.out.println(adp.getApellido());
    }
    
}
