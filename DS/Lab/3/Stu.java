 import java.util.Scanner;
 class StuDetails{
 	Scanner sc=new Scanner(System.in);
	Scanner dc=new Scanner(System.in);
	 	int enroll;
	 	String name;
	 	int sem;
	 	double cpi;
 		public void setdata(){
				System.out.println("ENTER ENROLLMENT");
				enroll=sc.nextInt();
				System.out.println("ENTER NAME");
				name=dc.nextLine();
				System.out.println("ENTER SEM");
				sem=sc.nextInt();
				System.out.println("ENTER CPI");
				cpi=sc.nextDouble();
  		}
  		public void printdata(){
  			System.out.println("enroll is "+enroll);
			System.out.println("name is "+name);
			System.out.println("sem is "+sem);
			System.out.println("cpi is "+cpi);
  		}
}
public class Stu{
	public static void main(String[] args) {
	StuDetails[] arr;
		arr =new StuDetails[5];
		for (int i=0;i<5 ;i++ ) {
			arr[i]=new StuDetails();
		}
		for (int i=0;i<5;i++) {
			System.out.println("for student "+(i+1));
			arr[i].setdata();
		}
		for (int i=0;i<5;i++) {
			System.out.println("details of  student "+(i+1));
			arr[i].printdata();
		}

}
}