package package3_13;

public class Main8 {
    public static int NumberOf1(int n) {
        int count = 0;
        while(n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(NumberOf1(9));
    }
}
