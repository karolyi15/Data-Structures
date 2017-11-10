public class Queue<T> {
    public QueueNode first;
    public int lenght;

    public void enqueue(){
        QueueNode<T> New=new QueueNode<T>();
        if(this.first==null){
            this.first=New;
            lenght++;
        }else{
            this.first.next=New;
            lenght++;
        }
    }
    public QueueNode<T> dequeue(){
        QueueNode<T> current = this.first;
        this.first=this.first.getNext();
        current.next=null;
        return current;
    }
    public int getLenght(){
        return this.lenght;
    }
}
