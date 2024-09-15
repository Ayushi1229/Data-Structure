import java.util.Scanner;
class Node{
    int info;
    Node link;
    public Node(int data){
        this.link = null;
        this.info = data;
    }
    public Node(int data, Node next){
        this.info = data;
        this.link = next;
    }
    public void display(){
        System.out.println("Data is:"+ this.info);
    }
}
public class Lab10_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Node node = new Node(1);
        System.out.println("Enter your data");
        node.info = sc.nextInt();
        node.display();
        sc.close();
    }
}
