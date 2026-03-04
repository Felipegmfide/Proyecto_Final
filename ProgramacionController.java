/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.controlador;

/**
 *
 * @author danie
 */

import paquete.modelo.Evento;
import paquete.modelo.Partido;

public class ProgramacionController {

    // Agenda un partido (lo mete a la cola FIFO)
    public void programarPartido(Evento evento, Partido partido) {
        evento.getColaProgramacion().encolar(partido);
    }

    // Inicia el siguiente partido (saca de cola)
    public Partido iniciarSiguientePartido(Evento evento) {
        return evento.getColaProgramacion().desencolar();
    }

    // Registra el resultado (lo apila LIFO)
    public void registrarResultado(Evento evento, Partido partidoJugado, String resultado) {
        partidoJugado.setResultado(resultado);
        evento.getPilaResultados().apilar(partidoJugado);
    }

    public Partido verResultadoMasReciente(Evento evento) {
        return evento.getPilaResultados().verTope();
    }
}
