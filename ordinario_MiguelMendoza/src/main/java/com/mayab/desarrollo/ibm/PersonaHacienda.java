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
public class PersonaHacienda implements Hacienda{
    public String nombre;
    public String apellido;
    
    public PersonaHacienda(String nombre,String apellido){
        this.nombre = nombre;
        this.apellido=apellido;
    }
    
    @Override
    public String getNombre(){
        return this.nombre;
    }
     @Override
    public String getApellido(){
        return this.apellido;
    }
    
     public void setNombre(String nombre){
        this.nombre=nombre;
    }
     @Override
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    
}
