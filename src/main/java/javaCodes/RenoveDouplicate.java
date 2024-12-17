package javaCodes;

import java.util.HashSet;
import java.util.Set;

public class RenoveDouplicate {

	public static void main(String[] args) {
		String[] split = {"java","c","java","python"};  //jeru
		//String str="java c java c# c python";			//bandi		
		//	String[] split=str.split(" ");				//naveen
		Set<String> set=new HashSet<String>();			//kumar
		for(int i=0;i<split.length;i++) {				//programe		
			set.add(split[i]);
		}
		for(String s:set) {
			System.out.println(s);
		}

	}

}
