import java.util.Scanner;

public class Matrix32 {
    public static void main(String[] args) {
        int sum=0;
        int  product[][] =new int[2][2];
        int  first[][] =new int[2][3]; 
        int second [][]=new int [3][2];
Scanner sc=new Scanner(System.in);


for(int i=0;i<2;i++)

{

for(int j=0;j<3;j++)
 System.out.println("enter element at"+i+" "+j);
  first [i][j]=sc.nextInt();

}

for(int i=0;i<3;i++)

{

for(int j=0;j<2;j++)

System.out.println("enter element at"+i+" "+j);
 second [i][j]=sc.nextInt();

}

for(int i=0;i<2;i++)

{

for(int j=0;j<2;j++)

{

for(int k=0;k<3;k++)

{

System.out.println( sum=sum+ first[i][k] * second[k][j]);

}

product [i][j]=sum;

}
}
    }
}
