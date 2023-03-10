package org.example;
import org.example.*;

import org.example.algorithms.GroesssterGemeinsamerTeiler;
import org.example.algorithms.PascalsTriangle;
import org.example.algorithms.TuermeVonHanoi;
import org.example.structures.binarytree.BinaryTree;
import org.example.structures.binarytree.Node;

public class Main {
    public static void main(String[] args) {
        System.out.println("Türme von Hanoi: ");
        TuermeVonHanoi.towersOfHanoi(3, "Quelle", "Senke", "Arbeitsplatz");

        System.out.println("-------------------------");
        int n = 5; // Pascalsche Dreieck

        System.out.printf("Pascalsche Dreieck für %d Zeilen: %n" , n);
        System.out.println(PascalsTriangle.pascalsTriangle(n));

        System.out.println("-------------------------");

        System.out.printf("Zeilenindex %d des Pascalschen Dreiecks: %n" , n); // startet ab 0
        System.out.println(PascalsTriangle.pascalsTriangleRowSelect(n));

        System.out.println("-------------------------");

        System.out.printf("Größte gemeinsamer Teiler: %n", n);
        System.out.println(GroesssterGemeinsamerTeiler.ggT(5, 10));
        System.out.println("-------------------------");
        System.out.println("BinaryTree: ");
        BinaryTree<Integer> tree = new BinaryTree<>();
        Node tempNode = new Node<>(1);
        tree.insert(2);
        tree.insert(1);
        tree.insert(5);
        tree.insert(3);
        tree.traverse(BinaryTree.INORDER);
    }
}