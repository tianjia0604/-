package practice_03;

import java.util.Scanner;

public class ContinuousMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            int count = 0;
            int end = 0;
            int max = 0;
            for(int i = 0;i < str.length();i++) {
                if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    count++;
                    if(max < count) {
                        max = count;
                        end = i;
                    }
                }else {
                    count = 0;
                }
            }
            System.out.println(str.substring(end - max +1,end + 1));
        }
    }
}
