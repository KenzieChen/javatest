public class MyTree{
	public Node root;

	public void insert(int data){
		Node newNode = new Node();
		newNode.data = data;
		if(root == null){
			root = newNode;
		}else{
			Node current = root;
			Node parent;
			while(true){
				parent = current;
				if(current.data>newNode.data){
					current = parent.left;
					if(current ==null){
						parent.left = newNode;
						return;
					}
				}else{
					current = parent.right;
					if(current == null){
						parent.right = newNode;
						return
					}
				}
			}
		}

	}
	public Node find(int data){
		Node current = root;
		if(current == null) return null;
		while(current.data != data){
			if(current.data < data){
				current = current.left;	
			}else{
				current = current.right;	
			}
			if(current == null){
				return null;
			}
		}
		return current;
	}
	public void delete(){}
}
class Node{
	public int data;
	public Node left;
       	public Node right;	
}
