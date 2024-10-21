package com.example;

public class Arbol  extends Naturaleza{
    private String fruto;

    public Arbol(String nombre, String tipo, String necesidad, double tamaño, String longi, String fruto) {
        super(nombre, tipo, necesidad, tamaño, longi);
        this.fruto = fruto;
    }

    public void infoArbol(){
        registro();
        System.out.println("Que fruto da el árbol: " + fruto);
    }
    
    public void vejez(){
        System.out.println("El árbol " + nombre + " es algo antiguo.");
    }
}

