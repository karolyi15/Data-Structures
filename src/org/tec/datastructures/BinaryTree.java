package org.tec.datastructures;
public class BinaryTree<T> {

    public BinaryNode<T> root;

    public BinaryTree(T key){
        this.root= new BinaryNode<>(key);
    }
    public void add(T key){
        BinaryNode <T> New=new BinaryNode<>(key);
        if (this.root==null){
            this.root=new BinaryNode<>(key);
        }else {

        }

    }
    public void del(){

    }
}
