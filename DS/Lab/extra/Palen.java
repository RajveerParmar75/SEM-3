import java.util.Stack;
public class Palen{
	public static void main(String[] args) {
		Stack<Character> st= new Stack<>();
		String str="1112";

		String demo="";
		for (int i=0;i<str.length() ;i++ ) {
			st.push(str.charAt(i));
		}
		while (!st.isEmpty()) {
			demo+=st.pop();
		}
		if (str.equals(demo)) {
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}
}