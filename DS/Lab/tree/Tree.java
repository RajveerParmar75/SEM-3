  import java.util.Stack;

import javax.xml.transform.Templates;

class Node {
	Node lpart;
	Node rpart;
	int value;

	Node(int n) {
		value = n;
	}
}

class Btree {
	Node root;

	public void inset(int value) {
		Node element = new Node(value);
		if (root == null) {
			root = element;
		} else {
			Node temp = root;
			while (temp.lpart != null || temp.rpart != null) {
				if (temp.value <= element.value && temp.rpart != null) {
					temp = temp.rpart;
				} else if (temp.value > element.value && temp.lpart != null) {
					temp = temp.lpart;
				} else {
					break;
				}
			}
			if (temp.value <= element.value) {
				temp.rpart = element;
			} else {
				temp.lpart = element;
			}
		}
	}

	public void inord() {
		Stack<Node> s1 = new Stack<>();
		Node temp = root;
	System.out.print("=>");
		while (temp != null || !s1.empty()) {
			while (temp != null) {
				s1.push(temp);
				temp = temp.lpart;
			}
			temp = s1.pop();
			System.out.print(temp.value + " ");
			temp = temp.rpart;
		}
	}

	public void preord() {
		if (root == null) {
			System.out.println("TREE IS EMPTY");
		} else {
			Stack<Node> s2 = new Stack<>();
			s2.push(root);
			System.out.print("=>");
			while (!s2.isEmpty()) {
				Node demo = s2.pop();
				System.out.print("=>"+demo.value+" ");
				if (demo.rpart != null) {
					s2.push(demo.rpart);
				}
				if (demo.lpart != null) {
					s2.push(demo.lpart);
				}
			}

		}
	}


public void postord(){
	Stack<Node> s1=new Stack<>();
	Stack<Node> s2=new Stack<>();
	s1.push(root);
	System.out.print("=>");
		while(!s1.empty()){
			Node temp= s1.pop();
			s2.push(temp);
			if(temp.lpart!=null){
				s1.push(temp.lpart);
			}
			if(temp.rpart!=null){
				s1.push(temp.rpart);
			}
		}
		while (!s2.empty()){
			Node demo=s2.pop();
			System.out.print(demo.value+"  ");
		}
	}
public void delete(int data){
	Node parent=null;
	Node temp=root;
		while(temp!=null && temp.value!=data){
			parent=temp;
			if (data>=temp.value){
				temp=temp.rpart;          
			}
			else{
				temp=temp.lpart;
			}
		} 
		if(temp.rpart==null&&temp.lpart==null){
			if(parent.value<=temp.value){
				parent.rpart=null;
			}
			else{
				parent.lpart=null;
			}
		}
		else if(temp.lpart!=null&&temp.rpart!=null){
			Node demo=findSucc(temp);
			temp.value=demo.value;
		}
		// else{
		// 	if(temp.rpart!=null&&temp.lpart==null){
		// 		if ()
		// 	}
		// }
		
}
		public Node findSucc(Node tmp){
			boolean rightChild=true;
			Node parent=tmp;
			tmp=tmp.rpart;
			if (tmp.lpart!=null){
				rightChild=false;
			}
			while(tmp.lpart!=null){
				parent=tmp;
				tmp=tmp.lpart;
			}
			if(rightChild){
				parent.rpart=tmp.rpart;
			}
				
			else{
				if(tmp.rpart!=null)
					parent.lpart=tmp.rpart;
			}
				
			return tmp; 
		}
}
public class Tree {
	public static void main(String[] args) {
		Btree b = new Btree();
		b.inset(5);
		b.inset(10);
		b.inset(11);
		b.inset(1);
		b.inset(2);
		b.inord();
		b.delete(5);
		b.inord();	

		// b.preord();
		// b.postord();
	}

}