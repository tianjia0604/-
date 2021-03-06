package practice_05;

import java.util.Scanner;

//链接：https://www.nowcoder.com/questionTerminal/9aaea0b82623466a8b29a9f1a00b5d35
//来源：牛客网
//有一个神奇的口袋，总的容积是40，用这个口袋可以变出一些物品，这些物品的总体积必须是40。
// John现在有n个想要得到的物品，每个物品的体积分别是a1，a2……an。
// John可以从这些物品中选择一些，如果选出的物体的总体积是40，
// 那么利用这个神奇的口袋，John就可以得到这些物品。
// 现在的问题是，John有多少种不同的选择物品的方式？
//
import java.util.*;
public class Main {
    static int[] weight;
    static int N;
    static int count = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            N = input.nextInt();
            weight = new int[N + 1];
        }
        for (int i = 1; i <= N; i++) {
            weight[i] = input.nextInt();
        }
        count(40, N);
        System.out.println(count);
    }

    public static void count(int s, int n) {
        //如果正好装满
        if (s == 0) {
            ++count;
            return;
        }
        if(s<0||(s>0&&n<1))
            return ;
        count(s - weight[n], n - 1);
        count(s, n - 1);
    }
}