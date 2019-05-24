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
public class Base3 extends DB{
     public Base3(String s,String a,String b, String c){
         this.nombre = "Base 3";
         this.sentencia=s.toLowerCase()+" VALUES (" + "'" + a +"','" + b + "','" + c + "')";
    }
}
