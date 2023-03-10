package model;
import java.util.ArrayList;
public class BST {
    private Node root;

    public BST(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }
    public void setRoot(Node root) {
        this.root = root;
    }
	public Node maketree(ArrayList<String> alist, int counter, int lengtth){
		if (counter > lengtth) {
			return null;
		}
		int mid = (counter + lengtth) / 2;
		Node root = new Node(alist.get(mid));
		root.setLeft(maketree(alist, counter, mid - 1));
		root.setRight(maketree(alist, mid + 1, lengtth));
		return root;
	}
    public int depth(Node root) {
        if (root == null) {
            return 0;
        } else {
            int leftDepth = depth(root.getLeft());
            int rightDepth = depth(root.getRight());
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }
    public String inorder() {
        String message="";
        message=inorder(root);
        return message;
    }
    private String inorder(Node node) {
        String message = "";
        if (node != null) {
            message += inorder(node.getRight());
            message += (node.getValue() + " ");
            message += inorder(node.getLeft());
        }
        return message;
    }
}