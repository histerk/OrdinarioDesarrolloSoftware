/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.desarrollo.persistencia;

/**
 *
 * @author migue
 */
public abstract class DB {
    public String nombre;
    public String sentencia;
    
    public String getNombre(){
        return nombre;
    }
    
    public String getSentencia(){
        return sentencia;
    }
    
}
