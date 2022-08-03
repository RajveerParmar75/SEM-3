import java.util.Scanner;
public class ArrayRep{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int  n=sc.nextInt();
		int a[]=new int [n];
		for (int i=0;i<n ;i++ ) {
			System.out.println("enter element at :"+"a"+"["+i+"]");
			a[i]=sc.nextInt();
		}
		System.out.println("THE OLD ARRAY IS ");
		for (int i=0;i<n ;i++ ) {
			System.out.println("a"+"["+i+"]"+"="+a[i]);
		}
		System.out.println("enter the index which you want to replace ");
		int rep=sc.nextInt();
		System.out.println("enter the index which you want to replace by ");
		int demo=sc.nextInt();
		for (int i=0;i<n ;i++ ) {
			if (a[i]==a[rep]){
				a[rep]=a[demo];
			}
		}
		System.out.println("THE NEW ARRAY IS  ");
		for (int i=0;i<n ;i++ ) {
			System.out.println("a"+"["+i+"]"+"="+a[i]);
		}
	}
}