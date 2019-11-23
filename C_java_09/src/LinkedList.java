 class LinkedNode {
    public int data = 0;
    public  LinkedNode next = null;

    public LinkedNode(int data) {
        this.data = data;
    }
//    public void setNext(LinkedNode n) {
//        this.next = n;
//    }
}
public class LinkedList {
    private LinkedNode head = null;
    //头插法
    public void addFirst(int elem) {
        //创建节点
        LinkedNode node = new LinkedNode(elem);
        if (this.head == null) {
            //空链表
            this.head = node;
            return;
        }
        //不是空链表，把新的放到开始位置
        node.next = head;
        this.head = node;
        return;
    }
    //尾插法
    public void addLast(int elem) {
        LinkedNode node = new LinkedNode(elem);
        //空链表
        if(this.head == null){
            this.head = node;
            return;
        }
        //非空,先找最后一个节点
        LinkedNode cur = this.head;
        while(cur.next !=null){
            cur = cur.next;
        }
        cur.next = node;
    }
    //任意位置插入
    public void addIndex(int index,int elem){
        LinkedNode node = new LinkedNode(elem);
        //1.合法判断
        int len = size();
        if(index < 0 || index >len) {
            return;
        }
        //2.头插
        if(index == 0){
            addFirst(elem);
            return;
        }
        //3.尾插
        if(index == len) {
            addLast(elem);
            return;
        }
        //4.处理中间 prev对应index-1的位置
        LinkedNode prev = getIndexPos(index -1);
        //5.具体插入
        node.next = prev.next;
        prev.next = node;
    }
    private  LinkedNode getIndexPos(int index){
        LinkedNode cur = this.head;
        for(int i = 0;i<index;i++) {
            cur = cur.next;
        }
        return cur;
    }
    public int size(){
        int size = 0;
        for(LinkedNode cur = this.head;
            cur!=null;cur = cur.next) {
            size++;
        }
        return size;
    }
    //查找
    public boolean contains(int toFind) {
        for(LinkedNode cur = this.head;
            cur != null; cur = cur.next) {
            if(cur.data == toFind) {
                return true;
            }
        }
        return false;
    }
    //删除
    public void remove(int toRemove) {
        //1.单独处理空链表
        if(head == null){
            return;
        }
        //2.是否删除头节点
        if(head.data == toRemove){
            this.head = this.head.next;
            return;
        }
        //3.删除中间
        LinkedNode prev = searchPrev(toRemove);
        LinkedNode nodeToRemove = prev.next;
        prev.next = nodeToRemove.next;
    }
    //删除指定
    public void removeAllkey(int toRemove) {
        if(head == null) {
            return;
        }
        LinkedNode prev = head;
        LinkedNode cur = head.next;
        while(cur != null) {
            if(cur.data == toRemove) {
                prev.next = cur.next;
                cur = prev.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        if(this.head.data == toRemove) {
            this.head = this.head.next;
        }
        return;
    }
    private  LinkedNode searchPrev(int toRemove){
        //找到要删除的前一个元素
        if(this.head == null){
            return null;
        }
        LinkedNode prev = this.head;
        while(prev.next != null){
            if(prev.next.data == toRemove){
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }

    public void display(){
        //打印
        System.out.print("[");
        for(LinkedNode node = this.head;
            node != null; node = node.next){
            System.out.print(node.data);
            if(node.next != null){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
    //清空链表
    public void clear() {
        this.head = null;
    }
}

