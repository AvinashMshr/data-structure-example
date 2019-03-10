package data.structure.example;

import java.util.stream.Stream;

import junit.framework.TestCase;

public class BinaryTreeTest extends TestCase{
	public void testCase() {
		BinaryTree tree = new BinaryTree(); 
        tree.root = new Node(4); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(5); 
        tree.root.left.left = new Node(1); 
        tree.root.left.right = new Node(3); 
  
        if (tree.isBST()) 
            System.out.println("IS BST"); 
        else
            System.out.println("Not a BST"); 
        
        
        Stream<Integer> stream = Stream.iterate(1, i -> i+1 );
        stream.limit(5)
        .filter(i -> i %2 == 0)
        .forEach(System.out::println);
	}

}
