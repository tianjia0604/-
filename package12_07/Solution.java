package package12_07;

public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence == null || sequence.length == 0) {
            return false;
        }
        return helpVerify(sequence,0,sequence.length - 1);
    }
    public boolean helpVerify(int[] sequence,int start,int root) {
        if(start >= root) {
            return true;
        }
        int key = sequence[root];
        int i;
        for(i = start;i < root;i++) {
            if(sequence[i] > key) {
                break;
            }
        }
        for(int j = i;j < root;j++) {
            if(sequence[j] < key) {
                return false;
            }
        }
        return helpVerify(sequence,start,i-1) && helpVerify(sequence,i,root-1);
    }
}
