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
    private LocalDate fecha;
    private String ubicacion;

    // Mi Parte: estructuras dentro del evento
    private final ColaPartidos colaProgramacion;
    private final PilaResultados pilaResultados;

    public Evento(String nombre, LocalDate fecha, String ubicacion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.colaProgramacion = new ColaPartidos();
        this.pilaResultados = new PilaResultados();
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    // Accesos controlados a estructuras
    public ColaPartidos getColaProgramacion() { return colaProgramacion; }
    public PilaResultados getPilaResultados() { return pilaResultados; }
}