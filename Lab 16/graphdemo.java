import java.util.*;
class graphdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> gp[] = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            gp[i] = new ArrayList<>();
        }
        System.out.println("enter source and des");
        int s = sc.nextInt();
        int d = sc.nextInt();
        while (s != -1 && d != -1) {
            addEdeg(s, d, gp);

            System.out.println("enter source and des");
            s = sc.nextInt();
            d = sc.nextInt();
        }

        System.out.println("enter node to find adj.node");
        int cur = sc.nextInt();
        System.out.println("adj of" + cur + ":---------");

        for (int i = 0; i < gp[cur].size(); i++) {
            System.out.println(gp[cur].get(i) + " ");
        }
        System.out.println();

    }

    public static void addEdeg(int s, int d, ArrayList<Integer> gp[]) {
        gp[s].add(d);
        if (d != s)
            gp[d].add(s);
    }
}