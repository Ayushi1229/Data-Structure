import java.util.Scanner;
public class Grammar {
    int TOP=-1;
    int n;
    char[] arr;
    Grammar(int n) {
        this.n = n;
        arr = new char[n];
    }
    public void push(char x){
        if(TOP>=(n-1)){
            System.out.println("Stack OverFlow");
        }
        else{
            TOP++;
            arr[TOP]=x;
        }
    }
    public void pop(){
        if(TOP<0){
            System.out.println("Stack UnderFlow");
        }else{
            TOP--;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        Grammar s = new Grammar(n);
        int i=0,count=0;
        while(str.charAt(i)!='b' && i<n){
            s.push(str.charAt(i));
            i++;
        }
        boolean flag = true;
        for(int j=i;j<n;j++){
            if(str.charAt(j)=='b'){
                count++;
                s.pop();
            }
            else{
                flag=false;
                System.out.println("Invalid String");
                break;
            }
        }
        if(flag==true && i==count){
            System.out.println("Valid String");
        }
        else{
            System.out.println("Invalid String");
        }
    }
}