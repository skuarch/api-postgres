package app.structure.services;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BinaryTreeTest {

    @Test
    public void testTree() {


        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(50);
        binaryTree.insert(25);
        binaryTree.insert(15);
        binaryTree.insert(30);
        binaryTree.insert(75);
        binaryTree.insert(85);

        // binaryTree.inOrderTraverse(binaryTree.node);
        binaryTree.preOrderTraverse(binaryTree.node);
        // binaryTree.postOrderTraverse(binaryTree.node);

    }


    public class Node {
        public int data;
        public Node left;
        public Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public class BinaryTree {

        Node node;

        public BinaryTree() {
            node = null;
        }

        public void insert(int data) {
            node = insertRec(node, data);
        }

        private Node insertRec(Node node, int data) {
            if (node == null) {
                node = new Node(data);
                return node;
            }

            if (data < node.data) {
                node.left = insertRec(node.left, data);
            } else if (data > node.data) {
                node.right = insertRec(node.right, data);
            }

            return node;

        }

        public void inOrderTraverse(Node node) {

            if (node != null) {
                inOrderTraverse(node.left);
                System.out.println(node.data);
                inOrderTraverse(node.right);
            }

        }

        public void postOrderTraverse(Node node) {
            if (node != null) {
                postOrderTraverse(node.left);
                postOrderTraverse(node.right);
                System.out.println(node.data);
            }
        }

        public void preOrderTraverse(Node node) {
            if (node != null) {
                System.out.println(node.data);
                preOrderTraverse(node.left);
                preOrderTraverse(node.right);
            }
        }

    }

}
