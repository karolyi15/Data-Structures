public class Queue<T> {
    public Node first;
    public int lenght;
    public void enqueue(){
        Node<T> New=new Node<T>();
        if(this.first==null){
            this.first=New;
            lenght++;
        }else{
            this.first.next=New;
            lenght++;
        }
    }
    public Node<T> dequeue(){
        Node <T> current = this.first;
        this.first=this.first.getNext();
        current.next=null;
        return current;
    }
    public int getLenght(){
        return this.lenght;
    }
}
