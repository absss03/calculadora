package org.example;

public class Main {
    public static void main(String[] args) {
        Suma prueba = new Suma(20, 30);
        int res = prueba.calcular();
        System.out.println(res);
        String textito = prueba.comoCadena();
        System.out.println(textito);

        Resta prueba2 = new Resta(50, 80);
        int res2 = prueba2.calcular();
        System.out.println(res2);
        String textito2 = prueba2.comoCadena();
        System.out.println(textito2);
    }
}