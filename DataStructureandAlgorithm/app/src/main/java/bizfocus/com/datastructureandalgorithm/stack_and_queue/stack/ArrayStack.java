package bizfocus.com.datastructureandalgorithm.stack_and_queue.stack;

/**
 * Created by death on 2017/7/24.
 *
 * 使用数组实现一个栈
 * 栈每次只能访问最后一个数据项，并且具有 new  push  pop  peek等功能
 *
 * 这里是通过数组定义的栈，并没实现扩容
 */

public class ArrayStack<E>{

    private E[] array ;
    private int index=0;
    private final int length =100;


    //new
    public ArrayStack() {
        array = (E[]) new Object[length];
    }

    //push
    public E push(E obj){
        if(index<length){
            array[index]=obj;
            index++;
            return obj;
        }
       return  null;
    }

    //pop
    public E pop(){
        if(index>=0){
            E obj = array[index];
            array[index]=null;
            index--;
            return obj;
        }
        return  null;
    }


    //peek
    public E peek(int position){
        return position>index?null:array[position];
    }


    public int getIndex(){
        return  index;
    }

    public E getObj(){
        return array[index];
    }

}
