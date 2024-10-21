package com.example;

public class Rosa extends Naturaleza{
    private String color;
    private String espinas;
    private String temporada;

    public Rosa(String nombre, String tipo, String necesidad, double tamaño, String longi , String color, String espinas, String temporada) {
        super(nombre, tipo, necesidad, tamaño, longi);
        this.color = color;
        this.espinas = espinas;
        this.temporada = temporada;
    }

    public void infoRosa(){
        registro();
        System.out.println("Color de la Rosa: " + color);
        System.out.println("Tiene o no espinas: " + espinas);
        System.out.println("Temporada de floración: " + temporada);
    }

    public void fragancia(){
        System.out.println("Las rosas " + nombre + " tienen fragancia.");
    }

    

    
}
