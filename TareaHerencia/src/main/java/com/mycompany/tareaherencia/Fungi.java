/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareaherencia;

/**
 *
 * @author antho
 */
public class Fungi extends SerVivo {
    protected String forma;
    protected String funcion;

    public Fungi(String nombre, String tipoReino, String entorno, String alimentacion, String reproduccion, String forma, String funcion) {
        super(nombre, tipoReino, entorno);
        this.forma = forma;
        this.funcion = funcion;
    }
    
    @Override
    public String alimentarse(String a){
        return a;
    }
    
    @Override
    public String reproducirse(String r){
        return r;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nForma=").append(forma);
        sb.append("\nFuncion=").append(funcion);
        return sb.toString();
    }
    
}
