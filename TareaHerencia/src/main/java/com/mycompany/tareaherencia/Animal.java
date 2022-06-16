/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareaherencia;

/**
 *
 * @author antho
 */
public class Animal extends SerVivo implements InterfaceAnimal{
    protected String especie;
    protected String tipoSangre;

    public Animal(String nombre, String tipoReino, String entorno, String especie, String tipoSangre) {
        super(nombre, tipoReino, entorno);
        this.especie = especie;
        this.tipoSangre = tipoSangre;
    }
    
    @Override
    public String sonido(String sonido){
        return "El sonido de este animal es: "+sonido;
    }
    
    @Override
    public String comida(String comida){
        return "Le gusta comer: "+comida;
    }
    
    @Override
    public String alimentarse(String a){
        return "Este animal se alimenta mediante: "+a;
    }
    
    @Override
    public String reproducirse(String r){
        return "Este animal se reproduce por: "+r;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nEspecie: ").append(especie);
        sb.append("\nSangre: ").append(tipoSangre);
        return sb.toString();
    }
    
}
