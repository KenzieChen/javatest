//�ҳ��ַ����г��ִ���������ĸ�ͳ��ֵĴ���
import java.util.List;
import java.util.ArrayList;
public class TheMost{
	//��һ�ַ���
	public void search(String str){
		char[] charArr = str.toCharArray();
		int len = charArr.length;
		//����λ��0��127��A-Z��65-90��a-b��97-122
		int[] intArr = new int[128];
		for(int i=0;i<len;i++){
			intArr[charArr[i]]++;
		}
		int count=0;
		int index=0;
		for(int i=0;i<128;i++){
			if(count<intArr[i]){
				count = intArr[i];
				index = i;
			}
		}
		System.out.println("count:"+count);
		System.out.println("index:"+(char)index);


	}
	//�ڶ��ַ���
	public void search2(String str){
		int len = str.length();
		List<Character> list = new ArrayList<Character>();
		for(int i=0;i<len;i++){
			list.add(str.charAt(i));
		}
		int[] counts = new int[len];
		for(int i=0;i<len;i++){
			counts[i] = 1;
		}
		for(int i=0;i<list.size();i++){
			char current = list.get(i);
			for(int j=i+1;j<list.size();){
				if(current == list.get(j)){
					list.remove(j);
					counts[i]++;	
				}else{
					j++;
				}
			}
		}
		int listSize = list.size();
		int count=0;
		char maxChar ='0';
		for(int i=0; i<listSize;i++){
			if(count < counts[i]){
				count=counts[i];
				maxChar = list.get(i);
			}
		}
		System.out.println("count:"+count+"\nmaxChar:"+maxChar);

	}
	public static void main(String[] args){
		TheMost most = new TheMost();
		most.search("aaaaa123sdf");
		most.search2("aaaaa123sdf");
	}
}
