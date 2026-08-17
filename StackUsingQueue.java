import java.util.*;
import java.io.*;
public class StackUsingQueue 
{
    public static class MyStack{
        Queue<Integer>q1;
        Queue<Integer>q2;
        
        public MyStack()
        {
            q1=new LinkedList<>();
            q2=new LinkedList<>();
        }
        public void push(int x)
        {
            q2.add(x);
            
            while(!q1.isEmpty())
            {
                q2.add(q1.remove());
            }
            Queue<Integer>temp=q1;
            q1=q2;
            q2=temp;
        }
        public int pop()
        {
            return q1.remove();
        }
        public int top()
        {
            return q1.peek();
        }
        public boolean empty()
        {
            return q1.isEmpty();
        }
    }
     public static void main (String[] args) {
        MyStack obj=new MyStack();
        obj.push(4);
        obj.push(2);
        obj.push(9);
        
        int removedElement=obj.pop();
        int topElement=obj.top();
        boolean isempty=obj.empty();
        
        System.out.print(removedElement);
        System.out.print(topElement);
        System.out.print(isempty);
    }
}