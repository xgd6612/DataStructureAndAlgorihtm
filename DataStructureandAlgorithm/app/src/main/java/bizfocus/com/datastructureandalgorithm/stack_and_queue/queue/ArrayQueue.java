package bizfocus.com.datastructureandalgorithm.stack_and_queue.queue;


/**
 * Created by death on 2017/7/25.
 *
 * 队列的两个基本操作 insert 和remove
 * 队列的insert 是插入队尾   remove 是删除队头
 *
 * 可以理解为排队买东西，头上的买完离开队列  最后面的 新进入进行排队
 */

public class ArrayQueue<E> {

    private int start=0;
    private int end=0;
    private int index=0;
    private Object[] array;
    private int length=100;


    public ArrayQueue() {
        array = new Object[length];
    }


    public boolean isEmipty(){
        return index <0? true:false;
    }



    public void insert(E e){

    }


    public void remove(){

    }


    public void peek(int position){

    }


}
