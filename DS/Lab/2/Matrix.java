import java.util.Scanner;
public class Matrix{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("THE FIRST MATRIX");
		int a[][]=new int[2][2];
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
					System.out.println("enter element at a"+"["+i+"]"+"["+j+"]");
					a[i][j]=sc.nextInt();
			}
		}
		System.out.println("THE SECOND MATRIX");
			int b[][]=new int[2][2];
				for(int i=0;i<2;i++){
					for(int j=0;j<2;j++){
						System.out.println("enter element at b"+"["+i+"]"+"["+j+"]");
						b[i][j]=sc.nextInt();
			}
		}
		System.out.println("THE ADDITION OF MATRIX IS ");
		int c[][]=new int[2][2];
			for(int i=0;i<2;i++){
				for (int j=0;j<2 ;j++ ) {
					c[i][j]=a[i][j]+b[i][j];
					System.out.print(c[i][j]+" ");
				}
			}
	}
}