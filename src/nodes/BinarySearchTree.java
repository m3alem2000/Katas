package nodes;

public class BinarySearchTree {

	public static boolean contains(Node root, int value) {
		if(root.value == value)
			return true;

		else if(value < root.value){
			if(root.left == null)
				return false;
			return contains(root.left, value);
		}
		else if(value > root.value){
			if(root.right == null)
				return false;
			return contains(root.right, value);
		}

		return false;

	}

	public static void main(String[] args) {
		Node n1 = new Node(1, null, null);
		Node n3 = new Node(3, null, null);
		Node n2 = new Node(2, n1, n3);

		System.out.println(contains(n2, 3));
	}
}


