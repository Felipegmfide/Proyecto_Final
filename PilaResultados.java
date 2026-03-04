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

public class PilaResultados {

    private static class Nodo {
        Partido dato;
        Nodo sig;
        Nodo(Partido dato) { this.dato = dato; }
    }

    private Nodo tope;
    private int size;

    public PilaResultados() {
        this.tope = null;
        this.size = 0;
    }

    // Push: apilar resultado (lo más reciente queda arriba)
    public void apilar(Partido partidoJugado) {
        if (partidoJugado == null) throw new IllegalArgumentException("No se permite apilar null");
        if (partidoJugado.getResultado() == null) {
            throw new IllegalArgumentException("El partido aún no tiene resultado (resultado es null)");
        }

        Nodo nuevo = new Nodo(partidoJugado);
        nuevo.sig = tope;
        tope = nuevo;
        size++;
    }

    // Pop: saca el más reciente
    public Partido desapilar() {
        if (estaVacia()) throw new NoSuchElementException("Pila vacía");
        Partido dato = tope.dato;
        tope = tope.sig;
        size--;
        return dato;
    }

    // Peek: ver el más reciente sin sacarlo
    public Partido verTope() {
        if (estaVacia()) throw new NoSuchElementException("Pila vacía");
        return tope.dato;
    }

    public boolean estaVacia() {
        return size == 0;
    }

    public int tamano() {
        return size;
    }
}
