//题目描述

//对于一个元素各不相同且按升序排列的有序序列，请编写一个算法，创建一棵高度最小的二叉查找树。
//给定一个有序序列int[] vals,请返回创建的二叉查找树的高度。
import java.util.*;

public class MinimalBST {
    public int buildMinimalBST(int[] vals) {
        // write code here
        if(vals.length==0){
            return 0;
        }
        int high = 1;
        int maxLength =2;
        int length = vals.length;
        while(length>=maxLength){
            high++;
            maxLength *=2; 
        }
        return high;
        
    }
}
