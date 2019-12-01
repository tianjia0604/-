

// public class Test{
//     public static void main(String[] args) {
//         int n = 10;
//         int ret = fib(n);
//         System.out.println("ret = "+ret);
//     }
//     public static int fib(int n) {
//         if( n <= 2){
//             return 1;
//         }
//         return fib(n-1)+fib(n-2);
//     }
// }
// public class Test{
//     public static void main(String[] args) {
//         int n = 5;
//         int ret = jumpFloor(n);
//         System.out.println("ret = " + ret);
//     }
//     public static int jumpFloor(int n){
//         if(n == 0){
//             return 0;
//         }else if(n <= 2){
//             return n;
//         }else{
//             return jumpFloor(n -1)+jumpFloor(n - 2);
//         }
//     }
// }
public class Test{
    public static void main(String[] args) {
        int n = 3;
        HanoiTower(n,'A','B','C');
    }
    public static void move(char a,char b){
        System.out.println("移动"+a+" -> "+b);
    }
    public static void HanoiTower(int n,char a,char b,char c){
        if(n == 1){
            move(a,c);
        }else{
            HanoiTower(n-1,a,c,b);
            move(a,c);
            HanoiTower(n-1,b,a,c);

        }
    }
}