/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author antho
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Ave> nA = new ArrayList();

        int opcion;
        boolean salir = false;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                  ----------------Menu----------------
                                                                  1. Agregar Ave
                                                                  2. Buscar Ave
                                                                  3. Mostrar Aves
                                                                  4. Salir"""));
            switch (opcion) {
                case 1 -> {
                    Ave a = new Ave("", "", 0, 0, "", 0);
                    a.definirClaseDeAnimalEres();
                    nA.add(a);
                    JOptionPane.showMessageDialog(null, a.toString());
                }
                case 2 -> {
                    String buscar = JOptionPane.showInputDialog("Ingrese el nombre del ave: ");
                    for (int i = 0; i < nA.size(); i++) {
                        if (nA.get(i).getNombre().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Encontrado " + i + nA.get(i).toString());
                        } else {
                            JOptionPane.showMessageDialog(null, "No existe");
                        }
                    }
                }
                case 3 -> {
                    for (int i = 0; i < nA.size(); i++) {
                        JOptionPane.showMessageDialog(null, "Posicion " + i + nA.get(i).toString());
                    }

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
