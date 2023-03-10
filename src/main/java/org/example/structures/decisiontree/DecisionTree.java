package org.example.structures.decisiontree;

public class DecisionTree {
    private int min_samples_split, max_depth;
    private Node head, nullNode;




    public DecisionTree(int min_samples_split, int max_depth, Object key, Node left, Node right) {
        this.min_samples_split = min_samples_split;
        this.max_depth = max_depth;
        this.head = new Node(key);
        head.setLeft(left);
        head.setRight(right);
    }


    public Double entropy(Double[] s) {
        Double[] percentages = new Double[s.length];
        for (int i = 0; i < s.length; i++) {
            percentages[i] = s[i] / s.length;
        }
        double entropy = 0.0;
        for (double pct : percentages) {
            entropy += pct * Math.log(pct) / Math.log(2);
        }
        return entropy;
    }

    public Double informationGain(Double[] parent, Double[] left_child, Double[] right_child) {
        int num_left = left_child.length / parent.length;
        int num_right = right_child.length / parent.length;
        return entropy(parent) - (num_left * entropy(left_child) + num_right * entropy(right_child));
    }
}
