//在给定字符串中查找所有特定子串并删除，如果没有找到相应子串，则不作任何操作。
//要求实现函数：
//int delete_sub_str(const char *str, const char *sub_str, char *result_str)
//【输入】 str：输入的被操作字符串
//sub_str：需要查找并删除的特定子字符串
//【输出】 result_str：在str字符串中删除所有sub_str子字符串后的结果
//【返回】 删除的子字符串的个数
//注：
//I、 子串匹配只考虑最左匹配情况，即只需要从左到右进行字串匹配的情况。比如：
//在字符串"abababab"中，采用最左匹配子串"aba",可以匹配2个"aba"字串。如果
//匹配出从左到右位置2开始的"aba"，则不是最左匹配，且只能匹配出1个"aba"字串。
//II、 输入字符串不会超过100 Bytes，请不用考虑超长字符串的情况。
//示例
//输入：str = "abcde123abcd123"
//sub_str = "123"
//输出：result_str = "abcdeabcd"
//返回：2
//输入：str = "abcde123abcd123*****fdaklfa11123*123jfdlafl"
//sub_str = "1234"
//输出：result_str = "abcde123abcd123"
//返回：0
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
	//直接删除
	public static String getResult(String str,String subStr){
		return str.replace(subStr,"");
	}
	//要计数的话也可以用split？
	//返回删除的子串个数，有缺陷，删掉某个子串，可能出现新的子串，是否该删除？
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
		//跟踪长字符串的索引
		int index =0;
		//跟踪短字符串的索引
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
			//j复原
			j=0;
			System.out.println(sb.toString());
		}
		System.out.println(sb.toString());
		return count;
	}
}
