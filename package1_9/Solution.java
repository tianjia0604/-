package package1_9;
//给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
// 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。


//既然不能用乘法，分析题目，我们可以将乘积拆为两项。
// 即: C[i] = A[0] * A[1] *...*A[i-1]
//     D[i] = A[i + 1] *...* A[n-1]
//     B[i] = C[i] * D[i]
// 我们先来计算C[i]，使用数学归纳法：
// C[0] = 1C[1] = A[0]
// C[2] = A[0] * A[1]
// C[3] = A[0] * A[1] * A[2]
// 我们可以得出规律：C[i] = C[i-1] * A[i -1](i >=1)
// 我们继续用数学归纳法计算D[i]: D[n - 1] = 1
// D[n - 2] = A[n -1]D[n - 3] = A[n - 1] * A[n - 2]
// 我们可以得出规律：D[i] = D[i + 1]* A[i + 1](i <= n-2)
import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
        if (A == null || A.length <= 0) {
            return null;
        }
        int[] C = new int[A.length];
        C[0] = 1;
        for (int i = 1; i < C.length; i++) {
            C[i] = C[i - 1] * A[i - 1];
        }
        int[] D = new int[A.length];
        D[D.length - 1] = 1;
        for (int i = D.length - 2; i >= 0; i--) {
            D[i] = D[i + 1] * A[i + 1];
        }
        int[] result = new int[A.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = C[i] * D[i];
        }
        return result;
    }
}