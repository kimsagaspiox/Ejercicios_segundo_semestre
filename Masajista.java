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
public class Masajista extends equipo {
    private int añosexperiencia;
    private String titulacion;
    
    public Masajista (int id, int edad, String Nombre, String Apellido, int añosexperiencia, String titulacion){
        super (Nombre, Apellido, id, edad);
        this.añosexperiencia=añosexperiencia;
        this.titulacion=titulacion;
    }
public void damasaje (){
    System.out.println("masajea");
}
    
    public int getAñosexperiencia() {
        return añosexperiencia;
    }

    public void setAñosexperiencia(int añosexperiencia) {
        this.añosexperiencia = añosexperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
    
}
