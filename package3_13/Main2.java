
package package3_13;

public class Main2 {
    public static String replaceSpace(StringBuffer str) {
//        int spaceNum = 0;
//        for(int i = 0;i < str.length();i++) {
//            if(str.charAt(i) == ' '){
//                spaceNum++;
//            }
//        }
//        //记录字符串变化前后长度
//        int oldLength = str.length();
//        int newLength = str.length() + 2 * spaceNum;
//        //重新设置str长度
//        str.setLength(newLength);
//        //定义两个指针
//        int oldIndex = oldLength - 1;
//        int newIndex = newLength - 1;
//        while(oldIndex >= 0 && oldLength < newLength) {
//            if(str.charAt(oldIndex) == ' ') {
//                str.setCharAt(newIndex--,'0');
//                str.setCharAt(newIndex--,'2');
//                str.setCharAt(newIndex--,'%');
//            }else {
//                str.setCharAt(newIndex--,str.charAt(oldIndex));
//            }
//            oldIndex--;
//        }
//        return str.toString();
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i < str.length();i++) {
            if(str.charAt(i) == ' '){
                sb.append("%20");
            }else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("we are happy!");
        System.out.println(replaceSpace(str));
    }
}
