public class ArmstrongNumber {

    public static void main(String[] args) {
        int num = 1;
        while (num <= 1000) {
            int sum = 0;
            int temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit,3);
                temp /= 10;
            }
            if (sum == num) {
                System.out.println(num);
            }
            num++;
        }
    }
}
