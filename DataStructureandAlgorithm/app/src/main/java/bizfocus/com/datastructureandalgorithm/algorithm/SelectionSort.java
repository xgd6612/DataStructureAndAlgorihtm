package bizfocus.com.datastructureandalgorithm.algorithm;

/**
 * Created by death on 2017/7/20.
 *
 * 选择排序
 * 选择排序是对冒泡排序的改进  它减少了交换的次序 他仍然进行了比较 但是并没有进行交换  直到最后一轮结束之后才完成比较
 */

public class SelectionSort {
    private int a[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};

    public void selectionSort(){
        int temp =-1;
        int position=0;
        for(int i=0;i<a.length-1;i++){
            for(int y=0;y<a.length-i-1;y++){
                if(temp<a[y]){
                    temp=a[y];
                    position=y;
                }
            }
            a[position] =a[a.length-1-i];
            a[a.length-1-i]=temp;
        }
    }


}






































/*

    public void selectionSort(){
        int position =-1;
        int temp =a[0];

        for(int i = 0;i<a.length-1;i++){
            for(int y=0;y<a.length-1;y++){
                if(temp<a[y]){
                    temp =a[y];
                    position=y;
                }
            }
            a[position]=a[0];
            a[0]=temp;
        }
    }*/
