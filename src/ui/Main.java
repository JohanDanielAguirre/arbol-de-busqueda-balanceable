package ui;
import model.*;
import java.util.*;
public class Main {
	public static  Scanner scanner = new Scanner(System.in);
	public Main() {
    }
	private static BST tree;
    public static void main(String[] args) {
	   Main m = new Main();
       tree = new BST(null);
	    System.out.println("ingrese los datos ordenados con un espacio entre ellos");
	   String names = scanner.nextLine();
	   String[] array = names.split(" ");
	   ArrayList<String> alist = new ArrayList<>();
	   Collections.addAll(alist, array);
	   m.make(alist);

    }

	private void make(ArrayList<String> alist) {
		int fate=0;
		tree.setRoot(tree.maketree(alist,0,alist.size()-1));
        System.out.println("elija una opcion  \n"
							+"1. mostrar la cadena invertida \n" +
							"2. ver profundidad del arbol \n"+
                            "3. salir");
        fate = scanner.nextInt();
        switch (fate){
            case 1:
              System.out.println(tree.inorder());
            break;
			case 2:
				System.out.println(tree.depth(tree.getRoot()));
			break;
            case 3: 
			return;
        }
		make(alist);
	}
}