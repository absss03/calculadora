package org.example;

public abstract class OperacionBinaria extends Operacion{
    public int izquierdo;
    public int derecho;
    public char signo;

    public OperacionBinaria(int der, int izq, char signo){
        this.derecho=der;
        this.izquierdo=izq;
        this.signo= signo;
    }

    public abstract int calcular();

    public String comoCadena(){
        return "(" +this.derecho+ this.signo +this.izquierdo+ ")";
    }
}
