class Node{
	int data;
	Node next;
	Node(int a){
		data =a;
		next=null;
	}
}
class Llist{
	Node head;
	public void add(int data){
	Node nnode=new Node(data);
		if(head==null){
			head=nnode;
		}
		else {
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=nnode;
		}
	}
	public void insertAt(int index,int data){
		if(index!=0){
		Node nnode=new Node(data);
		Node temp=head;
		for (int i=0;i<index-1;i++) {
			temp=temp.next;
			}
			nnode.next=temp.next;
			temp.next=nnode;
		}
		else{
			Node nnode =new Node(data);
 			nnode.next=head;
 			head=nnode;
		} 
	}
	public void dispaly(){
		Node n=head;
		if (head==null){
			System.out.print("list is empty");
		}
			while(n!=null){
				System.out.println(n.data);
				n=n.next;
			}
	}
	public void deleteAt(int index){
		Node temp=head;
		Node remove=null;
		for(int i=0;i<index-1;i++){
			temp=temp.next;
		}
		remove=temp.next;
 		temp.next=remove.next;
 		remove=null;
	}
	public int size(){
		int count=0;
		Node temp=head;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;		
	}
	public void insertMid(int data){
		int count=size();
		count/=2;
		Node temp=head;
		Node nnode=new Node(data);
		for(int i=0;i<count;i++){
			temp=temp.next;
		}
		nnode.next=temp.next;
		temp.next=nnode;
	}
}
public class DemoList{
	public static void main(String[] args) {
		Llist l=new Llist();
		l.add(5);
		l.add(91);
		l.add(90);
		l.add(10);
		l.insertAt(2,00);
		l.deleteAt(2);
		l.dispaly();
		// l.insertMid(45);
		System.out.println(l.size());
	}
}