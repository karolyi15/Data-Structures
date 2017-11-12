package org.tec.datastructures;
public class BinaryNode<T> {

    private int valor;

    private BinaryNode padre;
    private BinaryNode hojaIzquierda;
    private BinaryNode hojaDerecha;

    /* Constructor */
    public BinaryNode(int valor) {
        this.valor = valor;
    }

    /* Setters y Getters */
    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public BinaryNode getPadre() {
        return padre;
    }

    public void setPadre(BinaryNode padre) {
        this.padre = padre;
    }

    public BinaryNode getHojaIzquierda() {
        return hojaIzquierda;
    }

    public void setHojaIzquierda(BinaryNode hojaIzquierda) {
        this.hojaIzquierda = hojaIzquierda;
    }

    public BinaryNode getHojaDerecha() {
        return hojaDerecha;
    }

    public void setHojaDerecha(BinaryNode hojaDerecha) {
        this.hojaDerecha = hojaDerecha;
    }
}
