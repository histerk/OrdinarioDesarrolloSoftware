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
public class Adapter implements Hacienda{
    Ventas nuevo;
    
    public Adapter(Ventas nuevo){
    this.nuevo=nuevo;
    }
    
     @Override
    public String getNombre() {
    String[] separado = nuevo.getNombre().split("\\s+");
    return separado[0];
    }
    
    @Override
    public void setNombre(String nombre) {
    nuevo.setNombre(nombre);
    }


    @Override
    public String getApellido() {
    String[] separado = nuevo.getNombre().split("\\s+");
    return separado[1];
    }
    
    @Override
    public void setApellido(String apellido) {
    String name = nuevo.getNombre();
    name = name + " " + apellido;
    nuevo.setNombre(name);
    }
    
}
