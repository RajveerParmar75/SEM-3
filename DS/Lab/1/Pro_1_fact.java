import java.util.Scanner;
public class Pro_1_fact{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NUMBER");
		int a=sc.nextInt();	
		int temp=1;
		for (int i=a;i>0;i--) {
			temp*=i;
		}
		System.out.println(" factioral of "+a+" is "+temp);
	}
}