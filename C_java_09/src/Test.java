public class Test {
    public static void main(String[] args) {
        testAddFirst();
        testaddLast();
        testAddIndex();
        testContains();
        testRemove();
        testremoveAllkey();
        testClear();
    }
    public static void testAddFirst(){
        System.out.println("测试头插:");
        LinkedList list = new LinkedList();
        list.addFirst( 1);
        list.addFirst( 2);
        list.addFirst( 3);
        list.addFirst( 4);
        System.out.println("预期结果[4,3,2,1]");
        System.out.print("实际是:");
        list.display();
    }
    public static void testaddLast(){
        System.out.println("测试尾插:");
        LinkedList list = new LinkedList();
        list.addLast( 1);
        list.addLast( 2);
        list.addLast( 3);
        list.addLast( 4);
        System.out.println("预期结果[1,2,3,4]");
        System.out.print("实际是:");
        list.display();

    }
    public static void testAddIndex(){
        System.out.println("测试任意:");
        LinkedList list = new LinkedList();
        list.addLast( 1);
        list.addLast( 2);
        list.addLast( 3);
        list.addLast( 4);
        list.addIndex(2,5);
        System.out.println("预期结果[1,2,5,3,4]");
        System.out.print("实际是:");
        list.display();
    }
    public static void testContains() {
        System.out.println("测试查找:");
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        boolean result = list.contains(3);
        System.out.println("预期结果true,实际是:"+result);
    }
    public static  void testRemove(){
        System.out.println("测试删除:");
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.remove(3);
        System.out.println("预期结果[1,2,4]");
        System.out.print("实际是:");
        list.display();
    }
    public static  void testremoveAllkey(){
        System.out.println("测试指定删除:");
        LinkedList list = new LinkedList();
        list.addLast(2);
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(2);
        list.addLast(4);
        list.removeAllkey(2);
        System.out.println("预期结果[1,3,4]");
        System.out.print("实际是:");
        list.display();
    }
    public static void testClear() {
        System.out.println("测试清空");
        LinkedList list = new LinkedList();
        list.addLast(2);
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(2);
        list.addLast(4);
        list.clear();
        list.display();
    }
}
