import java.util.*;
class StackD{
	Scanner sc= new Scanner(System.in);
	Object a[] = new Object[4];
	int top=-1;

	public void push()
	{
		if (top>=a.length-1){
			System.out.println("STACK OVERFLOW");
		}
		else
		{
			System.out.print("Enter value");
			int x = sc.nextInt();
			top++;
			a[top]=x;
			System.out.print("Sucsess fully add");
		}
	}
	/*public int pop()
	{
		if (top==-1) 
		{
			System.out.println("STACK UNDERFLOW");
			return 0;
		}
		else
		{
			return a[top--];
		}
	}
	public int peep()
	{
		if (top==-1) 
		{
			System.out.println("STACK UNDERFLOW");
			return 0;
		}
		else
		{
			System.out.print("Enter the Number of element");
			int i = sc.nextInt();
			return a[top-i+1];
		}
	}
	public int change()
	{
		if (top==-1) 
		{
			System.out.println("STACK UNDERFLOW");
			return 0;
		}
		else
		{
			System.out.print("Enter the Number of element");
			int i = sc.nextInt();
			System.out.print("Enter value");
			int x = sc.nextInt();
			a[top-i+1]=x;
		}
	}*/
}
public class StackDemo{
	public static void main(String[] args) {
		StackD d1 = new StackD();
		d1.push();

	}
}