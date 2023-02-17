package collections.linkedLists;


public class Traverse {

    public  Node traverse(Node node){
        if(node == null){
            return node;
        }else{
            traverse(node.right);
            System.out.println(node.name);
            traverse(node.left);
            System.out.println(node.name);
            return null;
        }
    }
}
