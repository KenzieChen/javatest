//ͨ����������һ��Сд��ĸ(a~z)��ɵ��ַ��������дһ���ַ���ѹ�����򣬽��ַ�����������ϯ���ظ���ĸ����ѹ���������ѹ������ַ��������͵�3�����ƣ�
//ѹ������
//    1����ѹ�������ظ����ֵ��ַ��������ַ���"abcbc"�����������ظ��ַ���ѹ������ַ�������"abcbc"��
//    2��ѹ���ֶεĸ�ʽΪ"�ַ��ظ��Ĵ���+�ַ�"�����磺�ַ���"xxxyyyyyyz"ѹ����ͳ�Ϊ"3x6yz"��
//Ҫ��ʵ�ֺ����� 
//     void stringZip(const char *pInputStr, long lInputLen, char *pOutputStr);
//    ����pInputStr��  �����ַ���lInputLen��  �����ַ�������
//    ��� pOutputStr�� ����ַ������ռ��Ѿ����ٺã��������ַ����ȳ���
//ע�⣺ֻ��Ҫ��ɸú��������㷨���м䲻��Ҫ���κ�IO���������
//ʾ�� 
//    ���룺��cccddecc��   �������3c2de2c��
//    ���룺��adef��     �������adef��
//    ���룺��pppppppp�� �������8p��
import java.util.List;
import java.util.ArrayList;
public class Zip{
	public static void main(String[] args){
		String input = "pppppppp";
		StringBuffer output=new StringBuffer("");
		getResult(input,8,output);
		System.out.println(output.toString());
	}
	public static void getResult(String inputStr,long inputLen, StringBuffer outputStr){
		if(inputLen == 0){
			return;	
		}
		if(inputStr == null || inputStr == ""){
			return;
		}
		int len = inputStr.length();
		List<Character> inputStrArr = new ArrayList<Character>();
		int[] counts = new int[len];
		for(int i=0;i<len;i++){
			counts[i] =1;
		}
	       for(int i=0;i<len;i++){
		       inputStrArr.add(inputStr.charAt(i));
	       }
       		for(int i=0;i<inputStrArr.size();i++){
			char current = inputStrArr.get(i);
			for(int j=i+1;j<inputStrArr.size();j++){
				if(current == inputStrArr.get(j)){
					counts[i]++;
					inputStrArr.remove(j);
					j--;
				}else{
					break;
				}	
			}
		}
		int size = inputStrArr.size();
		for(int i=0;i<size;i++){
			if(counts[i]>1){
				outputStr.append(counts[i]);
			}
			outputStr.append(inputStrArr.get(i));
		}
	}
}
