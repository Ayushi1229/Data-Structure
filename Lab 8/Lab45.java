import java.util.Scanner;
import java.util.Stack;

class Lab45 {
    public static int SPF(char c)
    {
        if(c=='+' || c=='-')
        {
            return 2;
        }
        else if(c=='*' || c=='/')
        {
            return 4;
        }
        else if(c=='^')
        {
            return 5;
        }
        else if(c>='a' && c<='z')
        {
            return 8;
        }
        else
        {
            return 0;
        }
    }
    public static int IPF(char c)
    {
        if(c=='+' || c=='-')
        {
            return 1;
        }
        else if(c=='*' || c=='/')
        {
            return 3;
        }
        else if(c=='^')
        {
            return 6;
        }
        else if(c>='a' && c<='z')
        {
            return 7;
        }
        else if(c=='(')
        {
            return 9;
        }
        else
        {
            return 0;
        }
    }
    public static int rank(char c)
    {
        if(c=='+' || c=='-' ||c=='*' ||c=='/' ||c=='^')
        {
            return -1;
        }
        else{
            return 1;
        }
    }
    public static void infixtoPostfix(String infix)
    {
        Stack <Character> s=new Stack<>();

        s.push('(');
        infix+=')';
        String polish="";
        int rank=0;
        for(int i=0;i<infix.length();i++)
        {
            char next=infix.charAt(i);
            while(SPF(s.peek())>IPF(next))
            {
                char temp=s.pop();
                polish=polish+temp;
                rank=rank+rank(temp);
                if(rank<1)
                {
                    System.out.println("invalid");
                }
                
            }
            if(SPF(s.peek())!=IPF(next))
                {
                    s.push(next);
                }
                else{
                    s.pop();
                }
            
        }
        if(!s.isEmpty() || rank!=1)
            {
                System.out.println("invalid");
            }
            else{
            System.out.println("valid");
            System.out.println(polish.toString());
            }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String infix = sc.nextLine();  
        infixtoPostfix(infix);
        }
    }