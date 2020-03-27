package package3_13;

public class Main7 {
    //递归版本
    public static int Fibonacci1(int n) {
        if(n <= 0) {
            return 0;
        }
        if(n <= 2) {
            return 1;
        }else {
            return Fibonacci1(n - 1) + Fibonacci1(n - 2);
        }
    }
    public static int Fibonacci2(int n) {
        if(n <= 0)
            return 0;
        if(n ==1||n == 2)
            return 1;
        int a = 1;
        int b = 1;
        int sum = 0;
        for(int i = 3;i <= n;i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci1(6));
        System.out.println(Fibonacci2(6));
    }
}
