package bizfocus.com.datastructureandalgorithm.stack_and_queue.stack;


/**
 * Created by death on 2017/7/25.
 *
 * 栈应用实例1：String 倒序
 */

public class StringOrder {

    private String  str = "student";

    public void invertedOrder(){
        ArrayStack<String> stack = new ArrayStack<>();
        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i)+"");
        }
        String name ="";
        for(int y=stack.getIndex();y>0;y--){
            name+=stack.pop();
        }
        System.out.print(name);
    }



}
