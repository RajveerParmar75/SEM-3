import java.util.Scanner;
class Demo1{
	Scanner sc=new Scanner(System.in);
	Scanner dc=new Scanner(System.in);
		int empid;
		String name;
		String post;
		double sal;
		public void setdata(){
				System.out.println("ENTER ID");
				empid=sc.nextInt();
				System.out.println("ENTER NAME");
				name=dc.nextLine();
				System.out.println("ENTER POST");
				post=dc.nextLine();
				System.out.println("ENTER SALLARY");
				sal=sc.nextInt();
		}
		public void printdata(){
			System.out.println("id is "+empid);
			System.out.println("name is "+name);
			System.out.println("post is "+post);
			System.out.println("sallary is "+sal);
		}
}
public class Emp{
	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		d1.setdata();
		d1.printdata();
	}
}