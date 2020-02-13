package package2_12;

import java.util.Scanner;
//字符串找最长数字串
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            int a = 0;
            int b = 0;
            int count = 0;
            for(int i = 0;i < str.length();i++) {
                if(str.charAt(i) >= '0'&& str.charAt(i) <= '9') {
                    count++;
                    if(a < count) {
                        a = count;
                        b = i;
                    }
                }else {
                    count = 0;
                }
            }
            System.out.println(str.substring(b - a +1,b + 1));
        }
    }
}
