/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.modelo;

/**
 *
 * @author danie
 */

import java.time.LocalDate;

public class Evento {
    private String nombre;
    private String fecha;      // String simple
    private String ubicacion;
    private String deporte;
    private String categoria;
    private String estado;

    private final ColaPartidos colaProgramacion;
    private final PilaResultados pilaResultados;

    // Constructor limpio - ColaPartidos y PilaResultados se crean internamente
    public Evento(String nombre, String fecha, String ubicacion, String deporte, String categoria, String estado) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.deporte = deporte;
        this.categoria = categoria;
        this.estado = estado;
        this.colaProgramacion = new ColaPartidos();
        this.pilaResultados = new PilaResultados();
    }

    //getters & setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    

    

    // Accesos controlados a estructuras
    public ColaPartidos getColaProgramacion() { return colaProgramacion; }
    public PilaResultados getPilaResultados() { return pilaResultados; }
}
