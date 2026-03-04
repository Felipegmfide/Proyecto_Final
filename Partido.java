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

public class Partido {
    private String equipoLocal;
    private String equipoVisitante;
    private LocalDate fecha;
    private String resultado; // null si no se ha jugado

    public Partido(String equipoLocal, String equipoVisitante, LocalDate fecha) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.fecha = fecha;
        this.resultado = null;
    }

    public String getEquipoLocal() { return equipoLocal; }
    public void setEquipoLocal(String equipoLocal) { this.equipoLocal = equipoLocal; }

    public String getEquipoVisitante() { return equipoVisitante; }
    public void setEquipoVisitante(String equipoVisitante) { this.equipoVisitante = equipoVisitante; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public String getResultado() { return resultado; }
    public void setResultado(String resultado) { this.resultado = resultado; }

    @Override
    public String toString() {
        String res = (resultado == null) ? "Pendiente" : resultado;
        return equipoLocal + " vs " + equipoVisitante + " (" + fecha + ") => " + res;
    }
}