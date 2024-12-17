package javaCodes;

public class StringReverse {

	public static void main(String[] args) {
		
		String str="naveen is on interview complete";
		String[] split=str.split(" ");
		String line="";
		for(String s:split) {
			String word="";
		
		for(int i=s.length()-1;i>=0;i-- ) {
			word=word+s.charAt(i);
		}
		line=line + word+" ";
	}
	System.out.println(line);	
	}

}  
