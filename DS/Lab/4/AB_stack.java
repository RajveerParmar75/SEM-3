import java.util.Stack;
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
	public void push(char n){
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
	public boolean isEmpty(){ 
		if (top==-1){
			//System.out.println("EMPTY");
			return true;
		}
		else
		//System.out.println(" NOT EMPTY");
		return false;
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
}
public class AB_stack{
	public static void main(String[] args) {
		Stack1 st=new Stack1();
		int count=0;
		String str="aaabbbab";
		for (int i=0;i<str.length() ;i++ ) {
			if (str.charAt(i)==('a')){
				st.push(str.charAt(i));
			}
			else if (str.charAt(i)==('b')) {
				count++;
			}
		}
		for (int i=0;i<=count ;i++ ) {
			st.pop();
		}
		if(st.isEmpty()){
			System.out.println("pattern");
		}

		else{
			System.out.println("not pattern");
		}
	}
}