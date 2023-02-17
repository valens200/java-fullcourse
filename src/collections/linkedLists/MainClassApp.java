package collections.linkedLists;

import java.util.TreeSet;

public class MainClassApp {
    public static void main(String[] args) {
        Traverse traverse = new Traverse();
        TreeSet<Node> nodes = new TreeSet<Node>();
        Node node1 = new Node("valens");
        Node node2 = new Node("valens");
        Node node3 = new Node("valens");
        Node node4 = new Node("valens");
        Node node5 = new Node("valens");
        node1.left = node2;
        node1.right = node3;
        node3.right = node4;
        node3.left = node5;
        traverse.traverse(node1);


    }
}
