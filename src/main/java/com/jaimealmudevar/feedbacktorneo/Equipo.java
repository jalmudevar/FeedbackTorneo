/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jaimealmudevar.feedbacktorneo;

/**
 *
 * @author almud
 */
public class Equipo {
    
    /*
    Propiedades de los objetos de tipo equipo
    */
    String nombre;
    String patrocinador;
    String color1;
    String color2;
    String categoría;

    /*
    Constructor con las propiedades esenciales de los objetos de tipo equipo
    */
    public Equipo(String nombre, String color1, String categoría) {
        this.nombre = nombre;
        this.color1 = color1;
        this.categoría = categoría;
    }

    /*
    Getters y Setters
    */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }

    public String getColor1() {
        return color1;
    }

    public void setColor1(String color1) {
        this.color1 = color1;
    }

    public String getColor2() {
        return color2;
    }

    public void setColor2(String color2) {
        this.color2 = color2;
    }

    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }
    
}
