/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciapersonas;

/**
 *
 * @author Usuario
 */
public class Persona {
   protected int age;
   protected int height;
   protected int weight;
   protected String name;
   protected String lastname;
   protected int id;
   protected String Haircolour;

    public Persona() {
        this.age = 0;
        this.height = 0;
        this.weight = 0;
        this.name = "prueba";
        this.lastname = "pruebaapellido";
        this.id = 0;
        this.Haircolour = "pruebacolordepelo";
    }
   
   
   
   
   public void existe(){
     System.out.println("La persona de nombre " + name + " existe" );  
           }
   
   public void respirar(){
     System.out.println("La persona de peso " + weight + " respira" );  
           }
   
   
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHaircolour() {
        return Haircolour;
    }

    public void setHaircolour(String Haircolour) {
        this.Haircolour = Haircolour;
    }
   
   
   
   
}
