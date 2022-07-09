/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author antho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        EmpleadoSinHorasExtras ehs = new EmpleadoSinHorasExtras(0, 0);
        EmpleadoConHorasDobles ehd = new EmpleadoConHorasDobles(0, 0, 0);
        EmpleadoConHorasTriples eht = new EmpleadoConHorasTriples(0, 0, 0);

        int opcion;
        boolean salir = false;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                  ----------------Menu----------------
                                                                  1. Empleado sin horas extras
                                                                  2. Empleado con horas extras dobles
                                                                  3. Empleado con horas extras triples
                                                                  4. Salir"""));
            switch (opcion) {
                case 1 -> {
                    ehs.calcularSalario();
                    JOptionPane.showMessageDialog(null, ehs.toString());
                }
                case 2 -> {
                    ehd.calcularSalario();
                    JOptionPane.showMessageDialog(null, ehd.toString());
                }
                case 3 -> {
                    eht.calcularSalario();
                    JOptionPane.showMessageDialog(null, eht.toString());
                }
                case 4 -> {
                    System.out.println("Ha salido del programa");
                    salir = true;
                }
                default ->
                    System.out.println("Opcion incorrecta");
            }
        } while (opcion != 4);

    }
}
