package org.example.structures.binarytree;

public class BinaryTree<T> {
    private Node head, nullNode;

    public static final int INORDER = 1;
    public static final int PREORDER = 2;
    public static final int POSTORDER = 3;
    public static final int LEVELORDER = 4;

    public BinaryTree() {
        this.head = new Node(null);
        this.nullNode = new Node(null);
        this.head.setRight(nullNode);
        this.nullNode.setLeft(null);
        this.nullNode.setRight(null);
    }

    private void printInorder(Node n) {
        if (n != nullNode) {
            printInorder(n.getLeft());
            System.out.println(n.toString());
            printInorder(n.getRight());
        }
    }
    private void printPreorder(Node n) {
        if (n != nullNode) {
            System.out.println(n.toString());
            printPreorder(n.getLeft());
            printPreorder(n.getRight());
        }
    }
    private void printPostorder(Node n) {
        if (n != nullNode) {
            printPostorder(n.getLeft());
            printPostorder(n.getRight());
            System.out.println(n.toString());
        }
    }
    public void traverse(int strategy) {
        switch (strategy) {
            case INORDER:
                printInorder(head.getRight());
                break;
            case PREORDER:
                printPreorder(head.getRight());
                break;
            case POSTORDER:
                printPostorder(head.getRight());
                break;
            default:
        }
    }

    public Node search(Node root, int value) {
        if (root == null) {
            return null;
        } else if (Integer.parseInt(root.getKey().toString()) == value) {
            return root;
        } else if (Integer.parseInt(root.getKey().toString()) < value) {
            return search(root.getLeft(), value);
        } else {
            return search(root.getRight(), value);
        }
    }
    public Node minElement(Node root) {
        if (root.getLeft() != null) {
            minElement(root.getLeft());
        }
        return root;
    }
    public Node maxElement(Node root) {
        if (root.getRight() != null) {
            maxElement(root.getRight());
        }
        return root;
    }

    public boolean insert(Comparable c) {
        Node parent = head, child = head.getRight();
        while (child != nullNode) {
            parent = child;
            int cmp = child.compareKeyTo(c);
            if (cmp == 0) {
                return false;
            } else {
                child = (cmp > 0 ? child.getLeft() : child.getRight());
            }
        }
        Node node = new Node(c);
        if (parent.compareKeyTo(c) > 0) {
            parent.setLeft(node);
        } else {
            parent.setRight(node);
        }
        node.setLeft(nullNode);
        node.setRight(nullNode);
        return true;
    }


}
