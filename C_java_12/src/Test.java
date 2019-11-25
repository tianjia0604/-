public class Test {
    public static void main(String[] args) {
        testAddFirst();
        testAddLast();
        testAddIndex();
        testContains();
        testRemove();
        testClear();
    }
    public static void testAddFirst() {
        System.out.println("测试双向头插");
        DLinkedList dLinkedList = new DLinkedList();
        dLinkedList.addFirst(1);
        dLinkedList.addFirst(2);
        dLinkedList.addFirst(3);
        dLinkedList.addFirst(4);
        dLinkedList.display();
    }
    public static void testAddLast() {
        System.out.println("测试双向尾插");
        DLinkedList dLinkedList = new DLinkedList();
        dLinkedList.addLast(1);
        dLinkedList.addLast(2);
        dLinkedList.addLast(3);
        dLinkedList.addLast(4);
        dLinkedList.display();
    }
    public static void testAddIndex() {
        System.out.println("测试双向指定位置插入");
        DLinkedList dLinkedList = new DLinkedList();
        dLinkedList.addLast(1);
        dLinkedList.addLast(2);
        dLinkedList.addLast(3);
        dLinkedList.addLast(4);
        dLinkedList.addIndex(2,100);
        dLinkedList.display();
    }
    public static void testContains() {
        System.out.println("测试双向是否包含指定元素");
        DLinkedList dLinkedList = new DLinkedList();
        dLinkedList.addLast(1);
        dLinkedList.addLast(2);
        dLinkedList.addLast(3);
        dLinkedList.addLast(4);
        boolean ret = dLinkedList.contains(3);
        System.out.println("ret = " + ret);
    }
    public  static void testRemove() {
        System.out.println("测试双向删除");
        DLinkedList dLinkedList = new DLinkedList();
        dLinkedList.addLast(1);
        dLinkedList.addLast(2);
        dLinkedList.addLast(3);
        dLinkedList.addLast(4);
        dLinkedList.remove(2);
        dLinkedList.display();
    }
    public static void testClear() {
        System.out.println("测试双向清空");
        DLinkedList dLinkedList = new DLinkedList();
        dLinkedList.addLast(1);
        dLinkedList.addLast(2);
        dLinkedList.addLast(3);
        dLinkedList.addLast(4);
        dLinkedList.clear();
        dLinkedList.display();
    }
}
