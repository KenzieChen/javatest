//����һ���ַ������ַ����а����ո����֡����ź���ĸ��������Сд����Ҫ����ɺ���ʹ����������ַ�������ַ�����������ַ������԰������ֺ��ַ����������пո�ͷ��š�������ͬ���ȵ��ַ������������һ����
//���磺����:hello huawei!�����Ϊ:huawei
public class LongestString{
	public static void main(String[] args){
		String input = "hello huawei! acbcdsdfes";
		String output = getResult(input);
		System.out.println(output);
	}
	public static String getResult(String input){
		char[] arr = input.toCharArray();
		int len = arr.length;
		String result = "";
		StringBuffer temp = new StringBuffer();
		for(int i=0;i<len;i++){
			if(Character.isLetterOrDigit(arr[i])){
				temp.append(arr[i]);
				//flag
			}else{
				if(temp.length()>result.length()){
					result = temp.toString();
				}
				temp.delete(0,temp.length());
			}
		}
		//������flag�ط��жϣ���������һ���ַ�
		if(temp.length()>result.length()){
			result = temp.toString();
		}
		return result;
	}
}
