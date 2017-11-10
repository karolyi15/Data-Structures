public class BinaryTree<T> {
    public BinaryNode<T> root;
    public BinaryTree(T key){
        this.root=new BinaryNode<T>(key);
    }

}
