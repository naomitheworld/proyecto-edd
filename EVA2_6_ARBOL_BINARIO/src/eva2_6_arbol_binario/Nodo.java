/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_6_arbol_binario;

/**
 *
 * @author moviles
 */
public class Nodo {

    private int valor;
    private Nodo derecha;
    private Nodo izquierda;

    public Nodo(int valor, Nodo derecha, Nodo izquierda) {
        this.valor = valor;
        this.derecha = null;
        this.izquierda = null;
    }

    public Nodo(int valor) {
        this.valor = valor;
    }
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }
    
}
