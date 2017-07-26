package bizfocus.com.datastructureandalgorithm.algorithm;

/**
 * Created by death on 2017/7/21.
 *
 *
 * 插入排序
 *
 *
 *
 * 思路说明：
 * 插入排序是把后面的数据插入到前面已经排序完毕的数据中
 * 1.从第2个数据开始往前面插入  每次递增(第一层for循环)
 * 2.确定插入数据应该插入的位置 -------
 *      首先和前面的数据进行比较
 *      如果位置感刚好不需要任何变化，开始下一个数据的插入
 *      如果现在要插入数据比前面一个数据小，则需要和上上个数据进行比较 (以此类推)
 *          使用一个第三方变量记录当前要插入数据的值  如果需要和再前面的数据进行比较，前面的数据自动向后移动一个位置
 *
 */

public class InsertSort {

    private int a[]={1,3,5,7,9,11,13,16,19,33,75 ,66,85,44,12,56};


    public void insertSort(){
        int temp =0;
        for(int i=1;i<a.length;i++){
            if(a[i]<a[i+1]){
                temp=a[i];
                while (i>0 && a[i-1]>temp){
                    a[i]=a[i-1];
                    i--;
                }
                a[i]=temp;
            }
        }
    }
}




































  /* public void insertSort(){
       int temp =0;
       for(int i=1;i<a.length;i++){
           if(a[i]<a[i-1]){
               temp=a[i];
               while(i>0&&temp<a[i-1]){
                   a[i]=a[i-1];
                   i--;
               }
               a[i]=temp;
           }
       }
    }
*/