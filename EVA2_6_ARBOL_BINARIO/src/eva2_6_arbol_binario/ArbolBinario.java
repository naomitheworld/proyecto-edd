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
public class ArbolBinario {

    private Nodo root;

    public ArbolBinario(Nodo root) {
        this.root = null;
    }

    ArbolBinario() {

    }

    // metodo publico para el usuario
    public void add(int valor) {
        if (root == null) {
            root = new Nodo(valor);
        } else {
            add_recursive(valor, root);
        }
    }

    //metodo recursivo agregar
    // ncesita el valor y el nodo igual
    private void add_recursive(int valor, Nodo c_node) {
        // decidir si va izq o der
        /*
         verificar si el lado es null
         si es null, ahi va el valor
         si no
         repetir recursion
         */
        Nodo nvo = new Nodo(valor);
        if (valor < c_node.getValor()) {
            if (c_node.getIzquierda() == null) {
                c_node.setIzquierda(nvo);
            } else {
                add_recursive(valor, c_node.getIzquierda());
            }
        } else if (valor > c_node.getValor()) {
            if (c_node.getDerecha() == null) {
                c_node.setDerecha(nvo);
            } else {
                add_recursive(valor, c_node.getDerecha());
            }
        } else {
            System.err.println("elemento repetido");
        }
    }

    // impresion de valores in order
    // izq valor der
    // metodo publico
    public void inOrder() {
        inOrderRec(root);
        System.out.println("");
    }

    private void inOrderRec(Nodo nodo) {
        if (nodo == null) {

        } else {
            inOrderRec(nodo.getIzquierda());
            System.out.print(nodo.getValor() + " - ");
            inOrderRec(nodo.getDerecha());
        }
    }

    public void preOrder() {
        preOrderRec(root);
        System.out.println("");
    }

    private void preOrderRec(Nodo nodo) {
        if (nodo == null) {
            
        }else{
            System.out.print(nodo.getValor() + " - ");
            preOrderRec(nodo.getIzquierda());
            preOrderRec(nodo.getDerecha());
        }
    }

    public void postOrder() {
        postOrderRec(root);
        System.out.println("");
    }

    private void postOrderRec(Nodo nodo) {
        if (nodo == null) {
            
        } else{
            postOrderRec(nodo.getIzquierda());
            postOrderRec(nodo.getDerecha());
            System.out.print(nodo.getValor() + " - ");
        }
    }
}
