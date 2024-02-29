/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

/**
 *
 * @author alexa
 */
public class Nodo {
    public String dato;
    public Nodo NodoIzaquierda;
    public Nodo NodoDerecha;

    public Nodo(String dato) {
        this.dato = dato;
        this.NodoIzaquierda = null;
        this.NodoDerecha = null;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo getNodoIzaquierda() {
        return NodoIzaquierda;
    }

    public void setNodoIzaquierda(Nodo NodoIzaquierda) {
        this.NodoIzaquierda = NodoIzaquierda;
    }

    public Nodo getNodoDerecha() {
        return NodoDerecha;
    }

    public void setNodoDerecha(Nodo NodoDerecha) {
        this.NodoDerecha = NodoDerecha;
    }
    
    
}
