import java.util.Scanner;
class Stack1{
	int a[]=new int [4];
	int  top=-1;
	public void push(int n){
		if (top>=a.length-1){
			System.out.println("STACK IS FULL");
		}
		else{
			top++;
			a[top]=n;
		}

	}
	public int pop(){
		if (top==-1){
			System.out.println("STACK IS EMPTY");
			return 0;
		}
		else {
			return a[top--];
		}
	}
	public void display(){
		while(top!=-1){
			System.out.println(a[top]);
			top--;
		}
	}
	public void isEmpty(){ 
		if (top==-1){
			System.out.println("EMPTY");
		}
		else
		System.out.println(" NOT EMPTY");
		}
	public void  isFull(){
		if (top==a.length-1){
			System.out.println("FULL");
		}
		else
			System.out.println("NOT FULL");
	} 
	public int peek(){
		if (top==-1){
			System.out.println("STACK IS EMPTY");
			return 0;
		}
		else {
			return a[top];
		}
	}
	public void search(int n){
		if (top==-1){
			System.out.println("STACK IS EMPTY");
		}
		else {
			for (int i=0;i<a.length;i++) {
				if (a[i]==(n)){
					System.out.println("FOUND AT "+ (top-i));
					break;
				}
				else{
					System.out.println(" NOT FOUND ");
				}
			}
		}	
	}
	public void change(int value,int byWhich){
		int tm=top;
		for (int i=tm;i>=0;i--) {
			if (a[i]==value){
				System.out.println("hgfkjhf");
				a[i]=byWhich;
			}
		}
	}
}
public class Stack{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int flag=0;
		Stack1 s1=new Stack1();
		while(flag==0){
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("ENTER 1 TO ADD ELEMENT");
		System.out.println("ENTER 2 TO REMOVE THE TOP ELEMENT");
		System.out.println("ENTER 3 TO SEE THE LAST ELEMENT");
		System.out.println("ENTER 4 TO SEARCH AN ELEMENT");
		System.out.println("ENTER 5 TO SEE THE LIST");
		System.out.println("ENTER 6 TO CHANGE ELEMENT");	
		System.out.println("ENTER 7 TO EXIT");
		System.out.println("-------------------------------------------------------------------------------------------"); 
		int z=sc.nextInt();
		switch(z){
		case 1:
			System.out.println("ENTER THE NUM WHICH YOU WANT TO ADD");
			int add=sc.nextInt();
			s1.push(add);
			break;
		case 2:
			s1.pop();
			System.out.println("THE LAST ELEMENT HAS BEEN REMOVED");
			break;
		case 3:
			System.out.println(s1.peek());
			break;
		case 4:
			System.out.println("ENETR THE ELEMENT YOU WANT TO FIND");
			int find=sc.nextInt();
			s1.search(find);
			break;
		case 5:
			s1.display();
			break;
		case 6:
			System.out.println("ENETR THE ELEMENT YOU WANT TO CHANGE");
			int value =sc.nextInt();
			System.out.println("ENETR THE ELEMENT YOU WANT CHANGE BY");
			int byWhich =sc.nextInt();
			s1.change(value,byWhich);
			break;
		case 7:
			flag=1;
			break;
		}
		
	}
	}
} 