package org.tec.datastructures;

public class Queue<T> {

    private Node<T> first;
    private int lenght;
    public void enqueue(Node<T> newNode){
        
        if(this.first==null){
            this.first=newNode;
            lenght++;
        }else{
            this.first.setNext(newNode);
            lenght++;
        }
    }
    public Node<T> dequeue(){
        Node <T> current = this.first;
        this.first= this.first.getNext();
        current.setNext(null);

        return current;
    }
    public int getLenght(){
        return this.lenght;
    }
}
