package com.evilcry.algorithms.datastructures;

/**
 *
 * 红黑树
 *
 * @author Jin
 * @since 2020/6/25
 */
public class RedBlackTree {
    private final int R = 0;
    private final int B = 1;

    // 红黑树根节点
    private Node root = null;

    class Node {
        int data;
        int color = R;
        Node left;
        Node right;
        Node parent;

        public Node(int data) {
            this.data = data;
        }
    }

    public void insert(Node root, int data) { // root节点一定不为空

        if (root.data < data) { //插入右边
            if (root.right == null) {
                root.right = new Node(data);
            } else {
                insert(root.right, data);
            }
        } else {
            if (root.left == null) {
                root.left = new Node(data);
            } else {
                insert(root.left, data);
            }
        }
    }

    public void leftRotate(Node node) {

        if (node.parent == null) {
            Node E = root;
            Node S = E.right;

            E.right = S.left;
            S.left.parent = E;

            E.parent = S;

            S.parent = null;
            // S.left = E;
        }
    }
}
