package javaCodes;

import java.util.HashMap;
import java.util.Map;

public class StringReverse {

	public static void main(String[] args) {
		
	/*	
		String[] split= {"jeru","bandi","naveen","kumar"};
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
	*/

	
		String str="java c java python c# java c";
		String[] split=str.split(" ");
		
		Map<String,Integer> map= new HashMap<>();		
		for(String s:split) {
			if(map.containsKey(s)) {
				map.put(s,map.get(s)+1);
			}
			else {
				map.put(s,1);
			}
		}
		System.out.println(map);
		
		
		
		
		
		
		
		
		
		
		
		
		
} } 
