import java.util.Scanner;
class FactR{  
 static int factorial(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }    
 public static void main(String args[]){  
  Scanner sc= new Scanner(System.in);
  int fact=1;
  System.out.println("enter number");
  int number=sc.nextInt();    
  fact = factorial(number);   
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  