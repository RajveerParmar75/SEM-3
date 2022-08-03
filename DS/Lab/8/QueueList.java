class Node{
	Object data;	
	Node next;
}
class Queue{
	Node front;
	Node rear;
		public void add(Object data){
			Node temp=new Node();
			temp.data=data;
			if (front==null) {
				front=temp;
			}
			else {
				Node demo=front;
					while(demo.next!=null){
						demo=demo.next;
					}
					demo.next=temp;
			}
		}
		public void show(){
			Node temp=front;
				while(temp.next!=null){
					System.out.println(temp.data);
					temp=temp.next;
				}
				System.out.println(temp.data);
		}
		public void remove(){
			Node temp=front;
			front=front.next;
			temp=null;
		}
}
public class QueueList{
	public static void main(String[] args) {
		Queue q=new Queue();
		q.add(1);
		q.add(2.50);
		q.add("rajveer");
		q.show();
	}
}