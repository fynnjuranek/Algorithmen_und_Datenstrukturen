package org.example.structures.binarytree;

public class Node<T> {
    private Node left = null, right = null;
    private T key;

    public Node(T key) {
        this.key = key;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public T getKey() {
        return key;
    }

    public String toString() {
        return key.toString();
    }

    public int compareKeyTo(Comparable c) {
        return (key == null ? -1 : ((Comparable) key).compareTo(c));
    }
}
