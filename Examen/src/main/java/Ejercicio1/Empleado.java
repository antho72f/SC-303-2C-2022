/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author antho
 */
public abstract class Empleado {
    protected int horastrabajadas;
    protected double suelporhora;

    public Empleado(int horastrabajadas, double suelporhora) {
        this.horastrabajadas = horastrabajadas;
        this.suelporhora = suelporhora;
    }

    public int getHorastrabajadas() {
        return horastrabajadas;
    }

    public void setHorastrabajadas(int horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }

    public double getSuelporhora() {
        return suelporhora;
    }

    public void setSuelporhora(double suelporhora) {
        this.suelporhora = suelporhora;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado");
        sb.append("\nHoras trabajadas: ").append(horastrabajadas);
        sb.append("\nSueldo por hora: ").append(suelporhora);
        return sb.toString();
    }
    
}
