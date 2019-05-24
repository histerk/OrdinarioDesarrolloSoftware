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
public abstract class Base {
    abstract DB CrearSentencia(int tipo,String s,String a,String b,String c);
    
    public DB sentencias(int tipo,String s,String a,String b,String c){
		DB db = CrearSentencia(tipo,s,a,b,c);
                System.out.println("Para la: "+db.getNombre());
                System.out.println("Sentencia: "+db.getSentencia());
                return db;
    }
}
