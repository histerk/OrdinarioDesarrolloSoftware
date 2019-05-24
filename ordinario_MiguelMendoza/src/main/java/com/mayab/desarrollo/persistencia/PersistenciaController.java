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
import java.util.Arrays;
import java.util.ArrayList;
public class PersistenciaController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] base1 = new String[10][1];
        int i=0;
        String[][] base2 = new String[10][1];
        int m=0;
        String[][] base3 = new String[10][1];
        int p=0;
        String a;
         Base nueva = new CreadorDeSentencias();
         DB sen = nueva.sentencias(1, "insert into usuarios (nombre,apellido,edad)","miguel", "mendoza", "22");
         a=sen.nombre;
        
        if(a.equals("Base 1")){
            base1[i][0]=sen.sentencia;
            i=i+1;
        }else if(a.equals("Base 2")){
            base2[m][0]=sen.sentencia;
            m=m+1;
        }else{
            base3[p][0]=sen.sentencia;
            p=p+1;
        }
         sen= nueva.sentencias(2,"insert into usuarios (nombre,apellido,edad)" ,"miguel", "mendoza", "22");
          a=sen.nombre;
        
        if(a.equals("Base 1")){
            base1[i][0]=sen.sentencia;
            i=i+1;
        }else if(a.equals("Base 2")){
            base2[m][0]=sen.sentencia;
            m=m+1;
        }else{
            base3[p][0]=sen.sentencia;
            p=p+1;
        }
         sen = nueva.sentencias(3, "insert into usuarios (nombre,apellido,edad)" ,"miguel", "mendoza", "22");
          a=sen.nombre;
        
        if(a.equals("Base 1")){
            base1[i][0]=sen.sentencia;
            i=i+1;
        }else if(a.equals("Base 2")){
            base2[m][0]=sen.sentencia;
            m=m+1;
        }else{
            base3[p][0]=sen.sentencia;
            p=p+1;
        }
         
          System.out.println("-------------------");
          System.out.println("Sentencia en cada base de datos");
         for(int j=0;j<i;j++){
             System.out.println(base1[j][0]);
             System.out.println(base2[j][0]);
             System.out.println(base3[j][0]);
         }
         
    }
    
    
    
}
