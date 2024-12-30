package javaCodes;

import java.util.*;

public class Accurency {

	public static void main(String[] args) {
	/*	
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
	*/
		
		
		
		String str="java c java python c# java c";
		String[] split=str.split(" ");
		
		Map<String,Integer> map= new HashMap<>();
		for(int i=0;i<split.length;i++) {
			String key=split[i];
			int value=map.getOrDefault(key, 0)+1;
			map.put(key, value);
		}
		for(String key:map.keySet()) {
			System.out.print(key+" "+map.get(key));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
