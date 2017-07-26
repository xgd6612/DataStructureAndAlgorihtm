package bizfocus.com.datastructureandalgorithm.stack_and_queue.stack;

/**
 * Created by death on 2017/7/25.
 */

public class SeparatorMatching {

    private String code=" public void bubblesort(){\n" +
            "        int temp =0;\n" +
            "        for(int i=0;i<a.length-1;i++){\n" +
            "            for(int y=0;y<a.length-i-1;y++){\n" +
            "                if(a[i]>a[i+1]){\n" +
            "                    temp =a[i];\n" +
            "                    a[i]=a[i+1];\n" +
            "                    a[i+1]=temp;\n" +
            "                }\n" +
            "            }\n" +
            "        }\n" +
            "    }";



    public boolean separatorMatching(){

        ArrayStack<String> stack1 = new ArrayStack<>();
        ArrayStack<String> stack2 = new ArrayStack<>();
        for(int i = 0;i<code.length();i++){
            String x = code.charAt(i)+"";
            if(x.equals("{")){
                stack1.push(x);
            }else if(x.equals("}")){
                if(stack1.pop()==null){
                    return false;
                }
            }else if(x.equals("[")){
                stack2.push(x);
            }else if(x.equals("]")){
                if(stack2.pop()==null){
                    return false;
                }
            }
        }

        return  stack1.getIndex()==0&&stack2.getIndex()==0;
    }


}
