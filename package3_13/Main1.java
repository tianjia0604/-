package package3_13;

public class Main1 {
    public static boolean findNum(int[][] array,int target) {
        if(array == null) {
            return false;
        }
        int row = 0;
        int col = array[0].length - 1;
        while(row < array.length && col >= 0) {
            if(array[row][col] == target) {
                return true;
            }else if(array[row][col] > target) {
                col--;
            }else{
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(findNum(arr,7));
    }
}
