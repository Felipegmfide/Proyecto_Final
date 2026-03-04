/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cr.acme.Sistemaeventos;

/**
 *
 * @author danie
 */
import java.time.LocalDate;
import paquete.controlador.ProgramacionController;
import paquete.modelo.Evento;
import paquete.modelo.Partido;

public class SistemaEventosDeportivos {
    public static void main(String[] args) {
        Evento evento = new Evento("Torneo InterU", LocalDate.of(2026, 3, 10), "San José");
        ProgramacionController ctrl = new ProgramacionController();

        // Programación (COLA)
        ctrl.programarPartido(evento, new Partido("Equipo A", "Equipo B", LocalDate.of(2026, 3, 10)));
        ctrl.programarPartido(evento, new Partido("Equipo C", "Equipo D", LocalDate.of(2026, 3, 10)));

        System.out.println("Frente de la cola (debe ser A vs B): " + evento.getColaProgramacion().verFrente());
        System.out.println("Tamaño cola: " + evento.getColaProgramacion().tamano());

        // Se juega el siguiente (sale de cola)
        Partido jugado1 = ctrl.iniciarSiguientePartido(evento);
        ctrl.registrarResultado(evento, jugado1, "2-1");

        // Se juega el siguiente (sale de cola)
        Partido jugado2 = ctrl.iniciarSiguientePartido(evento);
        ctrl.registrarResultado(evento, jugado2, "0-0");

        // Resultados (PILA) - el más reciente primero
        System.out.println("Resultado más reciente (debe ser C vs D): " + ctrl.verResultadoMasReciente(evento));
        System.out.println("Tamaño pila: " + evento.getPilaResultados().tamano());
    }
}
