import java.util.Scanner;
public class swap{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NUMBER 1");
		int a=sc.nextInt();
		System.out.println("ENTER NUMBER 2");
		int b=sc.nextInt();
		int temp=a;
		a=b;
		b=temp;
		System.out.println(" NUMBER 1 IS "+a);
		System.out.println(" NUMBER 2 IS "+b);
		
	}
}