//�ڸ����ַ����в��������ض��Ӵ���ɾ�������û���ҵ���Ӧ�Ӵ��������κβ�����
//Ҫ��ʵ�ֺ�����
//int delete_sub_str(const char *str, const char *sub_str, char *result_str)
//�����롿 str������ı������ַ���
//sub_str����Ҫ���Ҳ�ɾ�����ض����ַ���
//������� result_str����str�ַ�����ɾ������sub_str���ַ�����Ľ��
//�����ء� ɾ�������ַ����ĸ���
//ע��
//I�� �Ӵ�ƥ��ֻ��������ƥ���������ֻ��Ҫ�����ҽ����ִ�ƥ�����������磺
//���ַ���"abababab"�У���������ƥ���Ӵ�"aba",����ƥ��2��"aba"�ִ������
//ƥ���������λ��2��ʼ��"aba"����������ƥ�䣬��ֻ��ƥ���1��"aba"�ִ���
//II�� �����ַ������ᳬ��100 Bytes���벻�ÿ��ǳ����ַ����������
//ʾ��
//���룺str = "abcde123abcd123"
//sub_str = "123"
//�����result_str = "abcdeabcd"
//���أ�2
//���룺str = "abcde123abcd123*****fdaklfa11123*123jfdlafl"
//sub_str = "1234"
//�����result_str = "abcde123abcd123"
//���أ�0
public class DeleteSub{
	public static void main(String[] args){
		String str = "abcde123abcd123";
		String str2 = "abcd112323cd123";
		String substr ="123";
		String substr2 ="ddd";
		String output = getResult(str,substr2);
		System.out.println(output);

		int count = remove(str2, substr);
		System.out.println(count);
		int count2 = remove2(str2, substr);
		System.out.println(count2);
	}
	//ֱ��ɾ��
	public static String getResult(String str,String subStr){
		return str.replace(subStr,"");
	}
	//Ҫ�����Ļ�Ҳ������split��
	//����ɾ�����Ӵ���������ȱ�ݣ�ɾ��ĳ���Ӵ������ܳ����µ��Ӵ����Ƿ��ɾ����
	public static int remove(String str,String subStr){
		int count =0;
		while(str.indexOf(subStr) != -1){
			str = str.substring(0,str.indexOf(subStr)).concat(str.substring(str.indexOf(subStr)+subStr.length(),str.length()));
			count++;
		}	
		System.out.println(str);
		return count;
	}

	public static int remove2(String str,String subStr){
		int count =0;
		int subLen = subStr.length();
		int len = str.length();
		char[] strArr = str.toCharArray();
		char[] subStrArr = subStr.toCharArray();
		//���ٳ��ַ���������
		int index =0;
		//���ٶ��ַ���������
		int j = 0;
		StringBuffer sb = new StringBuffer();
		for(int i =0; i<len;i++){
			index = i;
			while(i<len && j<subLen && strArr[i] == subStrArr[j] ){
				j++;
				i++;
			}
			if(j == subLen){
				count++;
			}else{
				sb.append(strArr[index]);	
				i = index;
			}	
			//j��ԭ
			j=0;
			System.out.println(sb.toString());
		}
		System.out.println(sb.toString());
		return count;
	}
}
