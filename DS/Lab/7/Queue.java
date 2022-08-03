class Que{
	int a[]=new int[5];
	int front=0;
	int temp=-1;
	public void add(int n){
		if (temp>=a.length-1){
			System.out.println("QUEUE IS FULL");
		}
		else{
		temp++;
		a[temp]=n;
		}
	}
	public int kick(){
		if(front>temp){
			System.out.println("QUEUE IS EMPTY");
			return 0;
		}
		else{
			return a[front++];
		}
	}
	public void dispaly(){
		for (int i=front;i<=temp;i++ ) {
			System.out.print(" "+a[i]);
		}
	}
}
public class Queue{
	public static void main(String[] args) {
		Que q=new Que();
		q.add(5);
		q.add(15);
		q.add(25);
		q.add(55);
		q.add(56);
		q.kick();
		q.add(51);
		// q.kick();
		// q.kick();
		// q.kick();
		// q.add(1);
		// q.add(2);
		// q.add(3);
		// q.kick();
		q.dispaly();
	}
}