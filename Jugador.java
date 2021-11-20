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
public class Jugador extends equipo {
    private int numero;
    private String demarcacion;
    
    public Jugador (int id, int edad, String Nombre, String Apellido, int numero, String demarcacion){
        super (Nombre, Apellido, id, edad);
        this.demarcacion=demarcacion;
        this.numero=numero;
    }

    public void juegapartido() {
        System.out.println("juega el partido");
    }
    public void entrena (){
        System.out.println("entrena para el partido");
    }
    public void masajejugador (){
            System.out.println("recibe masaje");
        }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
}
