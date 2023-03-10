package org.example.structures.decisiontree;

public class Node {
    private Object key;
    private Node left = null, right = null;

    private int max_depth, feature, threshold, data_left, data_right, gain, value;
    public Node(int max_depth, int feature, int threshold, int data_left, int data_right, int gain, int value) {
        this.max_depth = max_depth;
        this.feature = feature;
        this.threshold = threshold;
        this.data_left = data_left;
        this.data_right = data_right;
        this.gain = gain;
        this.value = value;
    }
    public Node(Object o) {
        this.key = o;
    }
    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
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

}
