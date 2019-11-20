import java.util.Arrays;
public class SeqList {
    private int[] data = new int[10];
    private int size = 0;
    //打印顺序表
    public void display() {
        //System.out.println(Arrays.toString(data));
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i]);
            if(i != size - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
    //在pos位置新增元素
    public void add(int pos,int elem) {
        if (pos < 0 || pos > size) {
            return;
        }
        if(this.size >= this.data.length) {
            realloc();//扩容
        }
        if(pos == size) {
            this.data[pos] = elem;
            size++;
            return;
        }
        for(int i = this.size;i > pos;i--) {
            this.data[i] = this.data[i-1];
        }
        this.data[pos] = elem;
        this.size++;
    }
    private void realloc() {
        int[] newData = new int[this.data.length * 2];
        for (int i = 0; i < this.data.length; i++) {
            newData[i] = this.data[i];
        }
        this.data = newData;
    }
    //判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.size; i++) {
            if (this.data[i] == toFind) {
                return true;
            }
        }
        return false;
    }
    //return this.search(toFind) != -1;
    //查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i < this.size; i++) {
            if(this.data[i] == toFind) {
                return i;
            }
        }
        return -1;
    }
    //获取pos位置的元素
    public int getPos(int pos) {
        return this.data[pos];
    }
    //给pos位置的元素设为elem
    public void setPos(int pos,int elem) {
        this.data[pos] = elem;
    }
    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        int pos = search(toRemove);
        if(pos == -1) {
            return;
        }
        if(pos == this.size - 1) {
            this.size--;
            return;
        }
        for (int i = pos; i < size - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.size--;
    }
    //获取顺序表的长度
    public int size () {
        return this.size;
    }
    //清空顺序表
    public void clear() {
        this.size = 0;
        this.data = new int[10];
    }
}
