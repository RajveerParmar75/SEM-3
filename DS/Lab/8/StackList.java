class Node{
	Object data;
	Node next;
}
class Stack{
	Node top;
		public void push(Object data){
			Node temp=new Node();
			temp.data=data;
			temp.next=top;
			top=temp;
		}
		public void show(){
			Node temp=top;
			while(temp!=null){
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
		public void pop(){
			if(top==null){
				System.out.println("empty");
			}
			else{
			top=(top).next;
			}
		}
		public Object peek(){
			if(top==null){
			System.out.println("empty");
			return 0;
			}
			else{
			Object demo=(top).data;
			return demo;
			}
		}
}
public class StackList{
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(1);
		s.push("hello");
		s.show();
	}
}