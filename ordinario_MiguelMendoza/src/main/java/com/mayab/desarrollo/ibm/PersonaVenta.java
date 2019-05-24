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
public class PersonaVenta implements Ventas {
    public String nombre;
    
    public PersonaVenta(String nombre){
    this.nombre=nombre;
   }
    
    @Override
    public String getNombre() {
       return this.nombre;
    }
    
    @Override
    public void setNombre(String nombreCompleto) {
    this.nombre=nombreCompleto;
    }

}
