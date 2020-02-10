package package2_10;

public class BinarySearchTree<K extends Comparable<K>, V> {
    public static class Node<K extends Comparable<K>, V> {
        K key;
        V value;
        Node<K, V> left;
        Node<K, V> right;
        @Override
        public String toString() {
            return String.format("{%s, %s}", key, value);
        }
    }
    private Node<K, V> root = null;
    public V get(K key) {
        Node<K, V> parent = null;
        Node<K, V> cur = root;
        while (cur != null) {
            parent = cur;
            int r = key.compareTo(cur.key);
            if (r == 0) {
                return cur.value;
            } else if (r < 0) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        return null;
    }
    public V put(K key, V value) {
        if (root == null) {
            root = new Node<>();
            root.key = key;
            root.value = value;
            display(root);
            return null;
        }
        Node<K, V> parent = null;
        Node<K, V> cur = root;
        while (cur != null) {
            parent = cur;
            int r = key.compareTo(cur.key);
            if (r == 0) {
                V oldValue = cur.value;
                cur.value = value;
                display(root);
                return oldValue;
            } else if (r < 0) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        Node<K, V> node = new Node<>();
        node.key = key;
        node.value = value;
        int r = key.compareTo(parent.key);
        if (r < 0) {
            parent.left = node;
        } else {
            parent.right = node;
        }
        display(root);
        return null;
    }
    public V remove(K key) {
        Node<K, V> parent = null;
        Node<K, V> cur = root;
        while (cur != null) {
            int r = key.compareTo(cur.key);
            if (r == 0) {
                V oldValue = cur.value;
                deleteNode(parent, cur);
                display(root);
                return oldValue;
            } else if (r < 0) {
                parent = cur;
                cur = cur.left;
            } else {
                parent = cur;
                cur = cur.right;
            }
        }
        display(root);
        return null;
    }
    private void deleteNode(Node<K,V> parent, Node<K,V> cur) {
        if (cur.left == null) {
            if (cur == root) {
                root = cur.right;
            } else if (cur == parent.left) {
                parent.left = cur.right;
            } else {
                parent.right = cur.right;
            }
        } else if (cur.right == null) {
            if (cur == root) {
                root = cur.left;
            } else if (cur == parent.left) {
                parent.left = cur.left;
            } else {
                parent.right = cur.left;
            }
        } else {
// 去 cur 的右子树中寻找最小的 key 所在的结点 scapegoat
// 即 scapegoat.left == null 的结点
            Node<K,V> goatParent = cur;
            Node<K,V> scapegoat = cur.right;
            while (scapegoat.left != null) {
                goatParent = scapegoat;
                scapegoat = cur.left;
            }
            cur.key = scapegoat.key;
            cur.value = scapegoat.value;
            if (scapegoat == goatParent.left) {
                goatParent.left = scapegoat.right;
            } else {
                goatParent.right = scapegoat.right;
            }
        }
    }
    private static <K extends Comparable<K>,V> void display(Node<K,V> node) {
        System.out.print("前序: ");
        preOrder(node);
        System.out.println();
        System.out.print("中序: ");
        inOrder(node);
        System.out.println();
    }
    private static <K extends Comparable<K>,V> void preOrder(Node<K,V> node) {
        if (node == null) {
            return;
        }
        System.out.print(node + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    private static <K extends Comparable<K>,V> void inOrder(Node<K,V> node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node + " ");
        inOrder(node.right);
    }
    public static void main(String[] args) {
        BinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        int[] keys = {5, 3, 7, 4, 2, 6, 1, 9, 8};
        for (int key : keys) {
            tree.put(key, String.valueOf(key));
        }
        System.out.println("==================================");
        tree.put(3, "修改过的 3");
        System.out.println("==================================");
        tree.remove(9);
        tree.remove(1);
        tree.remove(3);
    }
}