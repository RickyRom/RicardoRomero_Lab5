
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class Equipos {
    private String nombre;
    private double presupuesto;
    private int numero_copas;
    private String estadio;
    ArrayList<Jugadores> j = new ArrayList();

    public Equipos() {
    }

    public Equipos(String nombre, double presupuesto, int numero_copas, String estadio) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.numero_copas = numero_copas;
        this.estadio = estadio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getNumero_copas() {
        return numero_copas;
    }

    public void setNumero_copas(int numero_copas) {
        this.numero_copas = numero_copas;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public ArrayList<Jugadores> getJ() {
        return j;
    }

    public void setJ(ArrayList<Jugadores> j) {
        this.j = j;
    }

    @Override
    public String toString() {
        return "Nombre:" + nombre + "," + "Presupuesto" + presupuesto + "," + "Numero de Copas:" + numero_copas + "," + "Estadio:" + estadio;
    }
}
