//��Ŀ����

//����һ��Ԫ�ظ�����ͬ�Ұ��������е��������У����дһ���㷨������һ�ø߶���С�Ķ����������
//����һ����������int[] vals,�뷵�ش����Ķ���������ĸ߶ȡ�
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
