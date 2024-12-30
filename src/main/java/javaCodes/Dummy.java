package javaCodes;

import java.util.HashMap;
import java.util.Map;

public class Dummy {

	public static void main(String[] args) {
		String[] split= {"jeru","bandi","naveen","kumar","idnaburej"};
	//	String str="naveen is on interview complete";
	//	String[] split=str.split(" ");
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
