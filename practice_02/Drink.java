package practice_02;

import java.util.Scanner;

public class Drink {
    public static int drink(int n) {
        if(n <= 2) {
            return 0;
        }
        int count = 0;
        while(n > 2) {
            count = count + n / 3;
            n = n / 3 + n % 3;
        }
        if(n == 2) {
            count = count + 1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(drink(n));
        }
    }
}
