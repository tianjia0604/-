public class Test {
    public static void main(String[] args) {
        testdisplay();
        testadd();
        testcontains();
        testsearch();
        testgetPos();
        testsetPos();
        testremove();
    }
    public static void testdisplay(){
        System.out.println("测试打印：");
        SeqList seqList = new SeqList();
        seqList.display();
    }
    public static void testadd() {
        System.out.println("测试 add 方法：");
        SeqList seqList = new SeqList();
        seqList.add(0,1);
        seqList.add(1,2);
        seqList.add(2,3);
        seqList.add(3,4);
        seqList.add(2,5);
        seqList.display();
    }
    public static void testcontains() {
        System.out.println("测试 contains 方法：");
        SeqList seqList = new SeqList();
        seqList.add(0,1);
        seqList.add(1,2);
        seqList.add(2,3);
        seqList.add(3,4);
        seqList.add(2,5);
        boolean result = seqList.contains(5);
        System.out.println("result预期是 true;实际是 " +result);
    }
    public static void testsearch() {
        System.out.println("测试 search 方法：");
        SeqList seqList = new SeqList();
        seqList.add(0,1);
        seqList.add(1,2);
        seqList.add(2,3);
        seqList.add(3,4);
        seqList.add(2,5);
        int result = seqList.search(5);
        System.out.println("result预期是 2;实际是 " + result);
    }
    public static void testgetPos() {
        System.out.println("测试 getPos 方法：");
        SeqList seqList = new SeqList();
        seqList.add(0,1);
        seqList.add(1,2);
        seqList.add(2,3);
        seqList.add(3,4);
        int result = seqList.getPos(3);
        System.out.println("result预期是 4;实际是 "+result);
    }
    public static void testsetPos() {
        System.out.println("测试 setPos 方法：");
        SeqList seqList = new SeqList();
        seqList.add(0,1);
        seqList.add(1,2);
        seqList.add(2,3);
        seqList.add(3,4);
        seqList.setPos(2,5);
        System.out.println("预期值：[1,2,5,4]");
        System.out.print("实际值：");
        seqList.display();
    }
    public static  void testremove() {
        System.out.println("测试 remove 方法：");
        SeqList seqList = new SeqList();
        seqList.add(0,1);
        seqList.add(1,2);
        seqList.add(2,3);
        seqList.add(3,4);
        seqList.remove(2);
        System.out.println("预期值：[1,3,4]");
        System.out.print("实际值：");
        seqList.display();
    }
}



