package Threads;

public class Tree {
    Node root;
    Boolean done;
    StringBuilder logString;
    Tree(Node root){
        this.root = root;
        this.done = false;
        this.logString = new StringBuilder();
    }

}
