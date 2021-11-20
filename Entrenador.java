/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.herencia;

/**
 *
 * @author Zonia Roldan
 */
public class Entrenador extends equipo {
    
    private int idfederacion;
    public Entrenador (int id, int edad, String Nombre, String Apellido, int idfederacion){
        super (Nombre, Apellido, id, edad);
    }

    public void Dirigirpartido (){
        System.out.println("Dirige el partido");
    }
    public void Dirigirentrenamiento (){
        System.out.println("Dirige el entrenamiento");
    }
    
    public int getIdfederacion() {
        return idfederacion;
    }

    public void setIdfederacion(int idfederacion) {
        this.idfederacion = idfederacion;
    }
    
}
