package package1_14;
class Solution {
    //一、转换成小写字母
    public String toLowerCase1(String str) {
        char[] list = str.toCharArray();
        for(int i = 0; i < list.length;i++) {
            if(list[i] >= 'A' && list[i] <= 'Z') {
                list[i] += 'a' - 'A';
            }
        }
        return new String(list);
    }
    // str.length是求数组的长度，length相当于数组的属性
    // str.length( )是string类对象str调用的成员函数

    public String toLowerCase2(String str) {
        String result = "";
        for(int i = 0;i < str.length();i++) {
            char c = str.charAt(i);
            if(c >= 65 && c <= 90) {
                c += 32;
            }
            result += c;
        }
        return result;
    }

    //二、旋转数组
    //1.暴力解法
    //时间复杂度：O(n∗k) 每个元素都被移动 1 步（O(n)* k次（O(k)） 。
    //空间复杂度：O(1) 没有额外空间被使用。
    public void rotate1(int[] nums, int k) {
        int temp, previous;
        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
    }
    //2.使用额外的数组
    //时间复杂度： O(n) 将数字放到新的数组中需要一遍遍历，另一边来把新数组的元素拷贝回原数组。
    //空间复杂度： O(n) 另一个数组需要原数组长度的空间。
    public void rotate2(int[] nums, int k) {
        int[] a = new int[nums.length];
        for(int i = 0;i < nums.length;i++) {
            a[(i + k) % nums.length]= nums[i];
        }
        for(int i = 0;i < nums.length;i++) {
            nums[i] = a[i];
        }
    }
    //3.使用翻转
    //时间复杂度：O(n) n个元素被反转了总共 3 次。
    //空间复杂度：O(1) 没有使用额外的空间。
    public void rotate3(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums,0,n - 1);
        reverse(nums,0,k - 1);
        reverse(nums,k,n - 1);
    }
    private void reverse(int[] nums,int left,int right) {
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }


}