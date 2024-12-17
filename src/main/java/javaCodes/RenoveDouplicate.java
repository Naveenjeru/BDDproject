package javaCodes;

import java.util.HashSet;
import java.util.Set;

public class RenoveDouplicate {

	public static void main(String[] args) {
		String[] split = {"java","c","java","python"};
	//String str="java c java c# c python";
//	String[] split=str.split(" ");
	Set<String> set=new HashSet<String>();
	for(int i=0;i<split.length;i++) {
		set.add(split[i]);
	}
for(String s:set) {
	System.out.println(s);
}
	
	}

}
