/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.desarrollo.sage;

import java.util.ArrayList;

/**
 *
 * @author migue
 */
public class Company implements Observable {
    public int cantidad=0;
    public int maximo;
    public String nombre;
    public String nom;
    public ArrayList<Observer> mensaje = new ArrayList();
    public ArrayList<Observer> correo = new ArrayList();
    public String[][] lista = new String[10][2];
    int a=0;
    int e=0;
    public Company(String nombre,int maximo){
        this.nombre=nombre;
        this.maximo=maximo;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    public String getNom() {
        return nom;
    }

    public void RegitroDeGastos(int cantidad,String nom) {
        this.cantidad = cantidad;
        this.nom = nom;
        if(cantidad > this.maximo){
            this.notifyObserversMsg();
            this.notifyObserversCorreo();
        }
//        System.out.println(a);
//        a=a+1;
//        System.out.println(a);
        lista[e][a]=nom;
        a=a+1;
        lista[e][a]=Integer.toString(cantidad);
        a=0;
        e=e+1;
    }
    
    public void registro(){
        for(int i =0;i<e;i++){
            for(int j=0;j<2;j++){
                System.out.print(lista[i][j]+" ");
            }
            System.out.println();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    @Override
    public void addObserverToListMsg(Observer p){
        mensaje.add(p);
    }
   
    @Override
    public void pauseObserverFromListMsg(Observer p){
        mensaje.remove(p);
    }
    
     @Override
    public void addObserverToListCorreo(Observer p){
        correo.add(p);
    }
   
    @Override
    public void pauseObserverFromListCorreo(Observer p){
        correo.remove(p);
    }
    
    @Override
    public void notifyObserversMsg(){
        for(int i=0;i<mensaje.size();i++){
            mensaje.get(i).updateMsg();
        }
    }
    
    @Override
    public void notifyObserversCorreo(){
        for(int i=0;i<correo.size();i++){
            correo.get(i).updateCorreo();
        }
    }
}
