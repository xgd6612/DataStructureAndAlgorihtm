package bizfocus.com.datastructureandalgorithm.datastructure;

/**
 * Created by death on 2017/7/19.
 */

public class MainJava {

    private int et = 100;
    private int[] num = new int[et];



    //二分查找  前提是  数组必须是有序的
    //下面的方法是查找的方法
    public int find(int cur) {
        int start = 0;
        int end = et-1;

        while (true) {
            int half = (start + end) / 2;

            if (num[half] == cur) {
                return half;
            } else if (start > end) {
                return -1;
            } else {
                if (num[half] > cur) {
                    start = half + 1;
                } else {
                    end = half - 1;
                }
            }
        }
    }




    //坑爹的二分查找法 插入     数组总数 不大的情况下  不如线性写起来方便
    public void insert(int cur){
        int[] now = new int[et+1];
        int start =0;
        int end = et-1;

        if(num[start]>cur){
            System.arraycopy(num,0,now,1,et);
            now[0]=cur;
        }else  if(num[end]<cur){
            System.arraycopy(num,0,now,0,et);
            now[et] = cur;
        }else{
            while(true){
                int half = (start + end) / 2;
                if (num[half] == cur ||(num[half]<cur &&num[half+1]>cur)) {
                    System.arraycopy(num,0,now,0,half);
                    now[half] = cur;
                    System.arraycopy(num,0,now,0,et-half);
                }
            }
        }

        et +=1;
        num = now;
        now=null;
    }




}
