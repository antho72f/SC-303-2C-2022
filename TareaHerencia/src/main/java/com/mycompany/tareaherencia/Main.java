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
         * Nota: Mi jerarquía se baso en biología, específicamente en seres vivos y
         * sus reinos, en este caso solo agarre tres reinos; el Animal, Fungí y
         * Vegetal.
         */
        
        Perro perro = new Perro("Max", "Animal", "Terrestre", "Canino", "Caliente", "Pastor Aleman", "100%");
        System.out.println(perro.toString());
        System.out.println(perro.alimentarse("Alimento creado por el humano."));
        System.out.println(perro.reproducirse("Fecundacion entre un macho y una hembra."));
        System.out.println(perro.sonido("Guao."));
        System.out.println(perro.comida("Carne de res."));
        
//        Humano human = new Humano("Alex", "Animal", "Terrestre", "Heterótrofo", "Por fecundación", "Homo Sapiens", "Caliente", "Masculino", 20, "Latino", "1.71cm");
//        System.out.println(human.toString());
//        human.saludar();
//        human.detalles();

    }

}
