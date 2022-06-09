package com.mycompany.tareaherencia;

/**
 * @author antho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /**
         * Nota: Base mi jerarquía en biología, específicamente en seres vivos y
         * sus reinos, en este caso solo agarre tres reinos; el Animal, Fungí y
         * Vegetal.
         */
        Humano human = new Humano("Alex", "Animal", "Terrestre", "Heterótrofo", "Por fecundación", "Homo Sapiens", "Caliente", "Masculino", 20, "Latino", "1.71cm");
        System.out.println(human.toString());
        human.saludar();
        human.detalles();

    }

}
