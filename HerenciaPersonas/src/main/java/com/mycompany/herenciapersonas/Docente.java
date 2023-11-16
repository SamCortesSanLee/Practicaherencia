/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciapersonas;

/**
 *
 * @author Usuario
 */
public class Docente extends Persona{
    protected String Alumnofavorito;
    
   Docente(){
   this.age = 1;
   this.height = 10;
   this.weight = 100;
   this.name = "pruebadocente";
   this.lastname = "pruebalastnameprofe";
   this.id = 123;
   this.Haircolour = "pelopruebadocente";
    }
   
   public void llamardocente(){
        System.out.println("El docente llamado " + name + ", de apellido " + lastname + ", tiene una id de " + id + ", pelo de color " + Haircolour + ", peso de " + weight + " kg, altura de " + height + " y edad de " + age + " años.");
    }
   
   
   public void alumnollamado(){
     System.out.println("El docente tiene a " + Alumnofavorito + " de alumno favorito" );  
           }
   
   
   
    public String getAlumnofavorito() {
        return Alumnofavorito;
    }

    public void setAlumnofavorito(String Alumnofavorito) {
        this.Alumnofavorito = Alumnofavorito;
    }
   
   
}
