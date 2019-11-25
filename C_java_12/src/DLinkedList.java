class DLinkedNode {
    int val = 0;
    public DLinkedNode prev = null;
    public DLinkedNode next = null;

    public DLinkedNode(int val) {
        this.val = val;
    }
}
public class DLinkedList {
    private DLinkedNode head = null;

    public DLinkedList() {
        //创建傀儡结点
        head = new DLinkedNode(-1);
        //带环
        head.next = head;
        head.prev = head;
    }
    public void addFirst(int data) {
        DLinkedNode newNode = new DLinkedNode(data);
        DLinkedNode next = head.next;
        head.next = newNode;
        newNode.next = next;

        newNode.prev = head;
        next.prev = newNode;
    }
    public void addLast(int data) {
        DLinkedNode newNode = new DLinkedNode(data);
        DLinkedNode prev = head.prev;
        head.prev = newNode;
        newNode.next = head;
        prev.next = newNode;
        newNode.prev = prev;
    }
    public void addIndex(int index,int data) {
        int size = size();
        if(index < 0 || index > size) {
            return;
        }
        if(index == 0) {
            //头插
            addFirst(data);
            return;
        }
        if(index == size) {
            //尾插
            addLast(data);
            return;
        }
        DLinkedNode next = getPos(index);
        DLinkedNode prev = next.prev;

        DLinkedNode newNode = new DLinkedNode(data);
        prev.next = newNode;
        newNode.prev = prev;
        next.prev = newNode;
        newNode.next = next;
    }
    public DLinkedNode getPos(int index) {
        DLinkedNode cur = head.next;
        for(int i = 0;i < index;i++) {
            cur = cur.next;
        }
        return cur;
    }
    public int size() {
        int size = 0;
        for(DLinkedNode cur = head.next;
            cur != head;cur = cur.next) {
            size++;
        }
        return size;
    }
    public boolean contains(int toFind) {
        for(DLinkedNode cur = head.next;
            cur != head;cur = cur.next) {
            if(cur.val == toFind) {
                return true;
            }
        }
        return false;
    }
    public void remove(int key) {
        //先找到要删除的位置
        DLinkedNode toRemove = find(key);
        if(toRemove == null) {
            return;
        }
        DLinkedNode prev = toRemove.prev;
        DLinkedNode next = toRemove.next;
        prev.next = next;
        next.prev = prev;
    }
    public void removeAll(int key) {
        //先找到要删除的位置
        while (true) {
            DLinkedNode toRemove = find(key);
            if(toRemove == null) {
                return;
            }
            DLinkedNode prev = toRemove.prev;
            DLinkedNode next = toRemove.next;
            prev.next = next;
            next.prev = prev;
        }
    }
    public DLinkedNode find(int key) {
        for(DLinkedNode cur = head.next;
            cur != head;cur = cur.next) {
            if(cur.val == key) {
                return cur;
            }
        }
        return null;
    }
    public void display() {
        System.out.print("正向:[");
        for(DLinkedNode cur = head.next;
        cur != head;cur = cur.next) {
            System.out.print(cur.val);
            if(cur.next != head) {
                System.out.print(",");
            }
        }
        System.out.println("]");
        System.out.print("反向:[");
        for (DLinkedNode cur = head.prev;
             cur != head; cur = cur.prev) {
            System.out.print(cur.val);
            if(cur.prev != head) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
    public void clear() {
        head.next = head;
        head.prev = head;
    }
}
