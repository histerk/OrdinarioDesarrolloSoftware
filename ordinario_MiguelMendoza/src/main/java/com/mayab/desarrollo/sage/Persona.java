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
public class Persona implements Observer{
    public String nombre;
    public Company company;
    
    public Persona(String nombre, Company company){
        this.nombre=nombre;
        this.company=company;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
    
    public void alertarMsg(){
        System.out.println("Mensaje de alerta para "+this.getNombre());
        System.out.println("Registro de exeso de gasto por "+company.getNom());
        System.out.println("Gasto: "+company.getCantidad());
        System.out.println("---------------------------");
    }
    
    public void alertarCorreo(){
        System.out.println("Correo de alerta para "+this.getNombre());
        System.out.println("Registro de exeso de gasto por "+company.getNom());
        System.out.println("Gasto: "+company.getCantidad());
        System.out.println("---------------------------");
    }
    
    @Override
    public void updateMsg() {
        this.alertarMsg();
    }
    
    @Override
    public void updateCorreo() {
        this.alertarCorreo();
    }
    
}
