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
public class EmpleadoSinHorasExtras extends Empleado implements CalcularSalario {
    
    double sal;

    public EmpleadoSinHorasExtras(int horastrabajadas, double suelporhora) {
        super(horastrabajadas, suelporhora);
    }

    @Override
    public double calcularSalario() {
        int h;
        double s;
        this.setHorastrabajadas(Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas: ")));
        this.setSuelporhora(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario por hora: ")));
        h = this.getHorastrabajadas();
        s = this.getSuelporhora();
        sal = h*s;
        return sal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nSalario total: ").append(sal);
        return sb.toString();
    }
    
}
