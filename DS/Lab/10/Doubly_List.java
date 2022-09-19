class Node{
	Node next;
	Node prev;
	Object value;
}
class Dlist{
	Node head;
	public void insert(Object value){
		Node node = new Node();
		node.value=value;
		if (head==null) {
		 	head=node;
		 } 
		else {
			Node save=head;
		 	while(save.next!=null){
		 		save=save.next;
		 	}
		 	save.next=node;
		 	node.prev=save;
		 } 
	}
	public void display(){
		Node save=head;
		while (save!=null) {
			System.out.println(save.value);
			save=save.next;
		}
	}
	public void insertAtHead(Object value){
		Node node = new Node();
		node.value=value;
		head.prev=node;
		node.next=head;
		head=node;
	}
}
public class Doubly_List{
	 public static void main(String[] args) {
	 Dlist d=new Dlist();
	 d.insert(1);
	 d.insert(2);
	 d.insertAtHead(0);
	 d.display();
	 }
 }