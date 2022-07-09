/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author antho
 */
public class Ave extends Animal implements DefinirAnimal {

    protected String colorPlumaje;
    protected double alturaMaximaVuelo;

    public Ave(String especie, String nombre, double peso, int jaula, String colorPlumaje, double alturaMaximaVuelo) {
        super(especie, nombre, peso, jaula);
        this.colorPlumaje = colorPlumaje;
        this.alturaMaximaVuelo = alturaMaximaVuelo;
    }

    public String getColorPlumaje() {
        return colorPlumaje;
    }

    public void setColorPlumaje(String colorPlumaje) {
        this.colorPlumaje = colorPlumaje;
    }

    public double getAlturaMaximaVuelo() {
        return alturaMaximaVuelo;
    }

    public void setAlturaMaximaVuelo(double alturaMaximaVuelo) {
        this.alturaMaximaVuelo = alturaMaximaVuelo;
    }

    @Override
    public String definirClaseDeAnimalEres() {
        this.setEspecie(JOptionPane.showInputDialog("Ingrese la especie: "));
        this.setNombre(JOptionPane.showInputDialog("Ingrese el nombre: "));
        this.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso: ")));
        this.setJaula(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de jaula: ")));
        this.setColorPlumaje(JOptionPane.showInputDialog("Ingrese el color del plumaje: "));
        this.setAlturaMaximaVuelo(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura maxima de vuelo: ")));
        return toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nAve");
        sb.append(super.toString());
        sb.append("\nColor de plumaje: ").append(colorPlumaje);
        sb.append("\nAltura maxima de vuelo: ").append(alturaMaximaVuelo);
        return sb.toString();
    }

}
