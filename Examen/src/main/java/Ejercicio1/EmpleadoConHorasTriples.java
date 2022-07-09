/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author antho
 */
public class EmpleadoConHorasTriples extends Empleado implements CalcularSalario{
    private int horasExtras;
    double sal;

    public EmpleadoConHorasTriples(int horasExtras, int horastrabajadas, double suelporhora) {
        super(horastrabajadas, suelporhora);
        this.horasExtras = horasExtras;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        this.setHorastrabajadas(Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas: ")));
        this.setSuelporhora(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario por hora: ")));
        this.setHorasExtras(Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas extras: ")));
        int h = this.getHorastrabajadas();
        double s = this.getSuelporhora();
        int ex = this.getHorasExtras();
        sal = (h*s)+(ex*s)*3;
        return sal;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nHoras Extras: ").append(horasExtras);
        sb.append("\nSalario total: ").append(sal);
        return sb.toString();
    }
}
