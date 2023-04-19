package org.example;

public class Resta extends OperacionBinaria{

    public Resta(int der, int izq) {
        super(der, izq, '-');
    }

    public int calcular(){
        return derecho - izquierdo;
    }
}
