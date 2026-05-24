import java.util.*;
public class EvalToken 
{
    public static int evalToken(String tokens[])
    {
        Stack<Integer>stack=new Stack<>();
        for(String token:tokens)
        {
            if(token.equals("+")||token.equals("-")||token.equals("*")||token.equals("/"))
            {
                int a=stack.pop();
                
                int b=stack.pop();
                int result=0;
                switch(token)
                {
                    case "+":
                         result=b+a;
                        break;
                        
                    case "-":
                        result=b-a;
                        break;
                    
                    case "*":
                         result=b*a;
                        break;
                    
                    case "/":
                         result=b/a;
                        break;
                }
                stack.push(result);
            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
        
    }
    public static void main (String args[])
    {
        String tokens[]={"2","1","+","3","*"};
        int result =evalToken(tokens);
        System.out.print(result);
    }
}