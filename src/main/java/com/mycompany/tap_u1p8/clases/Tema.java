
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tap_u1p8.clases;

import java.io.Serializable;

/**
 *
 * @author chuy-
 */
public class Tema implements Serializable{
    private String idTema;
    private String autor;
    private String titulo;
    private String contenido;
    private String fecha;
    private int respuestas;

    public Tema() {
    }

    public Tema(String idTema, String autor, String titulo, String contenido, String fecha, int respuestas) {
        this.idTema = idTema;
        this.autor = autor;
        this.titulo = titulo;
        this.contenido = contenido;
        this.fecha = fecha;
        this.respuestas = respuestas;
    }

    public String getIdTema() {
        return idTema;
    }

    public void setIdTema(String idTema) {
        this.idTema = idTema;
    }

    

    public int getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(int respuestas) {
        this.respuestas = respuestas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Tema{" + "idTema=" + idTema + ", autor=" + autor + ", titulo=" + titulo + ", contenido=" + contenido + ", fecha=" + fecha + ", respuestas=" + respuestas + '}';
    }

    
    
}
