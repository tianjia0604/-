package package1_2;

public class Solution {
    //Insert one char from stringstream
    int[] count = new int[256]; // 字符出现的次数
    int[] index = new int[256]; // 字符出现的次数
    int number = 0;
    public void Insert(char ch)
    {
        count[ch]++;
        index[ch] = number++;
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        int minIndex = number;
        char ch = '#';
        for (int i = 0; i < 256; i++) {
            if (count[i] == 1 && index[i] < minIndex) {
                ch = (char) i;
                minIndex = index[i];
            }
        }
        return ch;
    }
}