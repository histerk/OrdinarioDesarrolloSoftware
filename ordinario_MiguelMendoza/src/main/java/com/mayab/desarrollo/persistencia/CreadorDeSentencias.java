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
public class CreadorDeSentencias extends Base{
    @Override
    public DB CrearSentencia (int tipo,String s,String a,String b, String c){
         if(tipo==1){
             return new Base1(s,a, b, c);
         }else if (tipo==2){
             return new Base2(s,a, b, c);
         }else if (tipo==3){
             return new Base3(s,a,b,c);
         }else{
             System.out.println("Error: invalid type of DB");
		return null;
         }
    }
}
