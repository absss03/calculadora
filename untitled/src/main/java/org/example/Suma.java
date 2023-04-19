package org.example;

public class Suma extends OperacionBinaria{

    public Suma(int der, int izq) {
        super(der, izq, '+');
    }

    public int calcular(){
        return derecho + izquierdo;
    }
}
