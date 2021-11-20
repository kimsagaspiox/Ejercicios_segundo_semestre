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
public class equipo {
    private String Nombre;
    private String Apellido;
    private int id;
    private int edad;
    
    public equipo (String Nombre, String Apellido, int id, int edad){
        this.Apellido= Apellido;
        this.edad=edad;
        this.Nombre=Nombre;
        this.id=id;
    }

    public equipo() {
    }
    
public void concentracion (){
    System.out.println("se concentra");
}
public void viajando (){
    System.out.println("viaja");
}
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
