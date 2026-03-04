/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.modelo;

/**
 *
 * @author danie
 */

import java.util.NoSuchElementException;

public class ColaPartidos {

    // Nodo interno (dinámico) - NO usa librerías externas
    private static class Nodo {
        Partido dato;
        Nodo sig;
        Nodo(Partido dato) { this.dato = dato; }
    }

    private Nodo frente; // head
    private Nodo fin;    // tail
    private int size;

    public ColaPartidos() {
        this.frente = null;
        this.fin = null;
        this.size = 0;
    }

    // Encolar (offer/enqueue): entra al final
    public void encolar(Partido partido) {
        if (partido == null) throw new IllegalArgumentException("No se permite encolar null");
        Nodo nuevo = new Nodo(partido);

        if (estaVacia()) {
            frente = fin = nuevo;
        } else {
            fin.sig = nuevo;
            fin = nuevo;
        }
        size++;
    }

    // Desencolar (poll/dequeue): sale del frente
    public Partido desencolar() {
        if (estaVacia()) throw new NoSuchElementException("Cola vacía");
        Partido dato = frente.dato;
        frente = frente.sig;
        size--;

        if (frente == null) fin = null; // quedó vacía
        return dato;
    }

    // Ver primero sin sacar
    public Partido verFrente() {
        if (estaVacia()) throw new NoSuchElementException("Cola vacía");
        return frente.dato;
    }

    public boolean estaVacia() {
        return size == 0;
    }

    public int tamano() {
        return size;
    }
}
