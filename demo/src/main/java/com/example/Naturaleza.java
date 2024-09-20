package com.example;

public class Naturaleza {
    protected String nombre;
    private String tipo;
    private String necesidad;
    private double tamaño;
    private  String longi;

    public Naturaleza (String nombre, String tipo, String necesidad, double tamaño, String longi){
        this.nombre = nombre;
        this.tipo = tipo;
        this.necesidad = necesidad;
        this.tamaño = tamaño;
        this.longi = longi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNecesidad() {
        return necesidad;
    }

    public void setNecesidad(String necesidad) {
        this.necesidad = necesidad;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public String getLongi() {
        return longi;
    }

    public void setLongi(String longi) {
        this.longi = longi;
    }

    public void crecer() {
        System.out.println(nombre + ", están creciendo satisfactoriamente.");
    }

    public void echarAgua() {
        System.out.println(nombre + ", necesita un poco de agua.");
    }

    public void registro(){
        System.out.println("Nombre de la planta: " + nombre);
        System.out.println("Tipo de la planta: " + tipo);
        System.out.println("Necesidad(es): " + necesidad);
        System.out.println("Tamaño máximo aprox: " + tamaño);
        System.out.println("Longitud de ese tamaño: " + longi);
    }

    

}
