public class RelativePath {
	public static void main(String[] args) {
		String pathA = "/qihoo/app/test.c";
		String pathB = "/qihoo/app/new.c";
		//String pathA = "/qihoo/app/1/2/test.c";
		//String pathB = "/qihoo/app/a/b/c/d/new.c";
		String relativePath = relative(pathA,pathB,"");
		System.out.println(relativePath);
	}
	public static String relative(String pathA,String pathB,String temp){
		if(pathA.startsWith(pathB)){
			return pathA.replaceFirst(pathB+"/",temp.substring(0,temp.length()-3));
		}else{
			return relative(pathA,pathB.substring(0,pathB.lastIndexOf("/")),temp+"../");
		}
	}
}
