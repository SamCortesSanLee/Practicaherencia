/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciapersonas;

/**
 *
 * @author Usuario
 */
public class Estudiante  extends Persona{
    protected String Materiafavorita;
    
    Estudiante(){
   this.age = 12;
   this.height = 122;
   this.weight = 1222;
   this.name = "nombrepruebaalumno";
   this.lastname = "apellidopruebalumno";
   this.id = 12222;
   this.Haircolour = "pelopruebaalumno";
    }
    
    public void llamarestudiante(){
        System.out.println("El estudiante llamado " + name + ", de apellido " + lastname + ", tiene una id de " + id + ", pelo de color " + Haircolour + ", peso de " + weight + " kg, altura de " + height + " y edad de " + age + " años.");
    }
    
    public void Materiallamado(){
     System.out.println("El estudiante tiene " + Materiafavorita + " de materia favorita" );  
           }
    
    public String getMateriafavorita() {
        return Materiafavorita;
    }

    public void setMateriafavorita(String Materiafavorita) {
        this.Materiafavorita = Materiafavorita;
    }
    
    
}
