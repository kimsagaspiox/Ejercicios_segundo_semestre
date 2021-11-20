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
public class Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     equipo miembros []= new equipo [3];
     Entrenador Carlos = new Entrenador (2,35, "Carlos", "Ediberto",3035); 
     Jugador Julio = new Jugador (4,23, "Julio", "Lopez",4532, "defensa");
     Masajista Juan = new Masajista (8, 23, "Juan", "Perez", 4, "Profesional");
     
     miembros [0] = Carlos;
     miembros [1] = Julio;
     miembros [2] = Juan;
        
         for (int i = 0; i < miembros.length; i++){
            System.out.print(miembros[i].getNombre() + " " + miembros[i].getApellido() + " -> ");
            miembros[i].concentracion();
        }
        System.out.println("\n Empieza el entrenamiento \n");
        System.out.print(Carlos.getNombre() + " " + Carlos.getApellido() + " -> ");
        Carlos.Dirigirentrenamiento();
        System.out.println(Julio.getNombre() + " " + Julio.getApellido() + " -> ");
        Julio.entrena();
        
            System.out.println("\n Empieza el partido \n");
            System.out.print(Carlos.getNombre() + " " + Carlos.getApellido() + " -> " );
            Carlos.Dirigirpartido();
            System.out.print(Julio.getNombre() + " " + Julio.getApellido() + " -> ");
            Julio.juegapartido();
            
        System.out.println("\n Empieza el descanso postpartido \n");
        System.out.print(Julio.getNombre() + " " + Julio.getApellido() + " -> ");
        Julio.masajejugador();
        System.out.print(Juan.getNombre() + " " + Juan.getApellido() + " -> ");
        Juan.damasaje();
    }
}
