/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herenciapersonas;

/**
 *
 * @author Usuario
 */
public class HerenciaPersonas {

    public static void main(String[] args) {
        
    Persona per = new Persona();
    per.existe();
    per.respirar();
    
    Persona per1 = new Estudiante();
    per1.existe();
    per1.respirar();
    
    Persona per2 = new Docente();
    per2.existe();
    per2.respirar();
    
    
    Estudiante est = new Estudiante();
    est.Materiafavorita = "Español";
    est.llamarestudiante();
    est.existe();
    est.Materiallamado();
    
    Docente doc = new Docente();
    doc.Alumnofavorito = "Samuel";
    doc.llamardocente();
    doc.existe();
    doc.alumnollamado();
    
    
        
    }
}
