class Node {
    Node left;
    Node right;
    int data;
}

class BST {
    public void inorder(Node node) {
        if(node == null) {
            return;
        }

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public boolean ifNodePresent(Node node, int val) {
        if(node == null) {
            return false;
        }

        boolean isPresent = false;

        while(node != null) {
            if(val < node.data) {
                node = node.left;
            } else if(val > node.data) {
                node = node.right;
            } else {
                isPresent = true;
                break;
            }
        }

        return isPresent;
    }
    public Node insert(Node node, int val) {
        if(node == null) {
            return createNewNode(val);
        }

        if(val < node.data) {
            node.left = insert(node.left, val);
        } else if((val > node.data)) {
            node.right = insert(node.right, val);
        }

        return node;
    }

    public Node createNewNode(int k) {
        Node a = new Node();
        a.data = k;
        a.left = null;
        a.right = null;
        return a;
    }
}
public class BSTMain {
    public static void main(String[] args) {
        BST a = new BST();
        Node root = null;

        root = a.insert(root, 56);
        root = a.insert(root, 30);
        root = a.insert(root, 70);
        root = a.insert(root, 22);
        root = a.insert(root, 40);
        root = a.insert(root, 11);
        root = a.insert(root, 16);
        root = a.insert(root, 3);
        root = a.insert(root, 60);
        root = a.insert(root, 95);
        root = a.insert(root, 65);
        root = a.insert(root, 67);
        root = a.insert(root, 63);

        a.inorder(root);

        System.out.println(a.ifNodePresent(root, 6));
        System.out.println(a.ifNodePresent(root, 16));
    }
}
