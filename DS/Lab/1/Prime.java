import java.util.Scanner;
public class Prime{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER NUM");
		int a=sc.nextInt();
		int flag=0;
		for (int i=1;i<=a;i++) {
			if (a%i==0){
				flag++;
			}
		}
		if (flag==2){
			System.out.println("Number is prime");
		}
		else{
			System.out.println("Number is not prime");
		}
	}
}