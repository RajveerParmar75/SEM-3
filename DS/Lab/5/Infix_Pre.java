import java.util.Stack;
public class Infix_Pre{
	// static String infixToPostfix(String exp){
		 static int Prec(char ch)
        {
            switch (ch)
            {
            case '+':
            case '-':
                return 1;
           
            case '*':
            case '/':
                return 2;
           
            case '^':
                return 3;
            }
            return -1;
           }
        static String infixToPrefix(String exp)
        {
            String rev="";
            for (int i=exp.length()-1;i>=0 ;i-- ) {
                rev+=exp.charAt(i);
            }

            String result = new String("");
            String resultnew = new String("");     
            Stack<Character> stack = new Stack<>();
              
            for (int i = 0; i<rev.length(); ++i)
            {
                char c = rev.charAt(i);
                if (Character.isLetterOrDigit(c))
                    result += c;
                   
                else if (c == ')')
                    stack.push(c);
                else if (c == '(')
                {
                    while (!stack.isEmpty() && stack.peek() != ')'){
                        result += stack.pop();
                        
                    }
                      
                        stack.pop();
                }
                else
                {
                    while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())){
                        
                        result += stack.pop();
                 }
                    stack.push(c);
                }
           
            }
            while (!stack.isEmpty()){
                if(stack.peek() == ')')
                    return "Invalid Expression";
                result += stack.pop();
             }
        for (int i=result.length()-1;i>=0 ;i-- ) {
				resultnew+=result.charAt(i);
		}
            return resultnew;
	} 
	public static void main(String[] args) {
		String s="(a+b^c^d)*(e+f/d)";
        System.out.println(infixToPrefix(s));
	}
}