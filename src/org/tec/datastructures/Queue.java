package org.tec.datastructures;

public class Queue<T> {
    public Node first;
    public Node last;
    public int lenght;

    public void enqueue(T data){
        Node<T> New=new Node<T>(data);
        if(this.first==null){
            this.first=this.last=New;
        }else{
            this.last.setNext(New);
            this.last=New;
        }
        lenght++;
    }
    public Node<T> dequeue(){
        Node<T> current = this.first;
        this.first=this.first.getNext();
        current.next=null;
        lenght--;
        return current;
    }
    public int getLenght(){
        return this.lenght;
    }

    public void display() {
        Node current = this.first;
        for(int i=0;i<lenght;i++){
            System.out.print(current.getData()+" ");
            current=current.getNext();
        }
    }
    public static void main(String[] args){
        Queue queue=new Queue();
        queue.enqueue("first");
        queue.enqueue("second");
        queue.enqueue("third");
        queue.enqueue("cuatro");
        queue.dequeue();

        queue.display();
    }
}
