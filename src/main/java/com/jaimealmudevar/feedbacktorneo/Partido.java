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
public class Partido {
    
    /*
    Propiedades de los partidos
    */
    String local;
    String visitante;
    String arbitro;
    String resultado;
    String fecha;
    String campo;
    String incidencias;

    /*
    Constructor con los datos que debe tener un partido al ser creado
    */
    public Partido(String local, String visitante, String fecha, String campo) {
        this.local = local;
        this.visitante = visitante;
        this.fecha = fecha;
        this.campo = campo;
    }

    /*
    Getters y setters
    */
    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getVisitante() {
        return visitante;
    }

    public void setVisitante(String visitante) {
        this.visitante = visitante;
    }

    public String getArbitro() {
        return arbitro;
    }

    public void setArbitro(String arbitro) {
        this.arbitro = arbitro;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getIncidencias() {
        return incidencias;
    }

    public void setIncidencias(String incidencias) {
        this.incidencias = incidencias;
    }
    
    
}
