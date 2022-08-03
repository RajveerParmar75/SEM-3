import java.util.Scanner;
class AB_count{
	public static void main(String[] args) {
		int countA=0,countB=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER STRING");
		String str=sc.nextLine();
		for (int i=0;i<str.length();i++) {
			if (str.charAt(i)=='a'||str.charAt(i)=='A'){
				countA++;
			}
			else if (str.charAt(i)=='b'||str.charAt(i)=='B'){
				countB++;
			}
		}
		if (countA==countB){
			if ((countA+countB)==str.length()){
				System.out.println("it is in given pattern");
			}
			else{
				System.out.println("it is not in given pattern");
			}
		}
		else{
				System.out.println("it is not in given pattern");
			}
}
		
}
