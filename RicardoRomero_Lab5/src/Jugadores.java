/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class Jugadores {
    private String nombre;
    private double precio;
    private String posicion;
    private String disponibilidad;
    private int habilidad;
    private int tecnica;
    private int resistencia_fisica;

    public Jugadores() {
    }

    public Jugadores(String nombre, double precio, String posicion, String disponibilidad, int habilidad, int tecnica, int resistencia_fisica) {
        this.nombre = nombre;
        this.precio = precio;
        this.posicion = posicion;
        this.disponibilidad = disponibilidad;
        this.habilidad = habilidad;
        this.tecnica = tecnica;
        this.resistencia_fisica = resistencia_fisica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(int habilidad) {
        this.habilidad = habilidad;
    }

    public int getTecnica() {
        return tecnica;
    }

    public void setTecnica(int tecnica) {
        this.tecnica = tecnica;
    }

    public int getResistencia_fisica() {
        return resistencia_fisica;
    }

    public void setResistencia_fisica(int resistencia_fisica) {
        this.resistencia_fisica = resistencia_fisica;
    }

    @Override
    public String toString() {
        return nombre + "(" + posicion + ")";
    }
}
