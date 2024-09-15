import java.util.Scanner;

public class BalanceParenthesis {
    int TOP=-1;
    int n;
    char[] arr;

    BalanceParenthesis(int n){
        this.n = n;
        arr = new char[n];
    }
    public void push(char x){
        if(TOP>=(n-1)){
            System.out.println("Stack Overflow");
        }
        else{
            TOP+=1;
            arr[TOP]=x;
        }
    }
    public void pop(){
        if(TOP<=-1){
            System.out.println("Stack UnderFlow");
        }
        else{
            TOP-=1;
        }
    }
    public char TOP(){
        if(TOP<=0){
            System.out.println("Underflow");
        }
            return arr[TOP];
        
    }
    public boolean empty(){
        return(TOP<=-1);
    }
    public boolean isValid(String str){
        int n = str.length();
        for(int c=0;c<n;c++){
            if(str.charAt(c)=='('|| str.charAt(c)=='{'|| str.charAt(c)=='['){
                this.push(str.charAt(c));
            }
            else{
                if(this.empty()||(str.charAt(c)==')'&&this.TOP()!='(')||(str.charAt(c)==']'&&this.TOP()=='[')||(str.charAt(c)=='}'&&this.TOP()!='{')){
                    return false;
                }
                this.pop();
            }
        }
        return this.empty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        sc.nextLine();
        while (t>0) {
            String str = sc.nextLine();
            BalanceParenthesis st = new BalanceParenthesis(str.length());
            boolean result = st.isValid(str);
            if(result){
                System.out.println("Valid");
            }else{
                System.out.println("Invalid");
            }
        }
    }
}
