/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.desarrollo.sage;

/**
 *
 * @author migue
 */
public class SageController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Company sage = new Company("sage",1500);
        Persona miguel = new Persona("Miguel",sage);
        Persona dani = new Persona("Daniel",sage);
        sage.addObserverToListMsg(miguel);
        sage.addObserverToListCorreo(miguel);
        sage.addObserverToListCorreo(dani);
        sage.RegitroDeGastos(1000,"juan");
        System.out.println("no pasa");
        sage.RegitroDeGastos(2000,"pedro");
        sage.pauseObserverFromListCorreo(miguel);
        sage.RegitroDeGastos(5000,"luis");
        sage.RegitroDeGastos(100,"carlos");
        
        sage.registro();//imprime el registro de los gastos 
    }
    
}
