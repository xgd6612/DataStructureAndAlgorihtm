package bizfocus.com.datastructureandalgorithm.algorithm;

/**
 * Created by death on 2017/7/20.
 *
 *
 *
 * 冒泡排序
 * 冒泡排序是通过相邻两组数据进行比较   较大的向下沉，较小的向上冒
 *
 * 冒泡排序就是相邻两个进行不断的比较，然后位置进行交换
 *
 * 在使用冒泡排序的时候只需要注意
 */

public class BubbleSort {

    private int a[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};

    public void bubblesort(){
        int temp =0;
        for(int i=0;i<a.length-1;i++){
            for(int y=0;y<a.length-i-1;y++){
                if(a[i]>a[i+1]){
                    temp =a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
        }
    }

}





