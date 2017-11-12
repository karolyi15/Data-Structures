package org.tec.datastructures;
public class BinaryTree<T> {

    private BinaryNode raiz;

    /* Contructores */
    public BinaryTree( int valor ) {
        this.raiz = new BinaryNode( valor );
    }

    public BinaryTree( BinaryNode raiz ) {
        this.raiz = raiz;
    }

    /* Setters y Getters */
    public BinaryNode getRaiz() {
        return raiz;
    }

    public void setRaiz(BinaryNode raiz) {
        this.raiz = raiz;
    }

    private void addNodo(BinaryNode nodo, BinaryNode raiz ) {

        if ( raiz == null ) {

            this.setRaiz(nodo);
        }
        else {

            if ( nodo.getValor() <= raiz.getValor() ) {

                if (raiz.getHojaIzquierda() == null) {
                    raiz.setHojaIzquierda(nodo);
                }
                else {
                    addNodo( nodo , raiz.getHojaIzquierda() );
                }
            }
            else {

                if (raiz.getHojaDerecha() == null) {
                    raiz.setHojaDerecha(nodo);
                }
                else {
                    addNodo( nodo, raiz.getHojaDerecha() );
                }
            }
        }
    }

}
