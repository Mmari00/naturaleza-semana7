package com.example;

public class Main {
    public static void main(String[] args) {
        Rosa r1 = new Rosa("Floribundas", "Rosa", "Mucho sol", 50, "cm", "Variado", "Sí", "Primavera");
        r1.infoRosa();
        r1.crecer();
        r1.echarAgua();
        r1.fragancia();
        
        System.out.println();

        Arbol a1 = new Arbol("Keitt", "Árbol", "Regar nutrientes", 1.60, "mts", "Mango");
        a1.infoArbol();
        a1.crecer();
        a1.echarAgua();
        a1.vejez();
    }
}