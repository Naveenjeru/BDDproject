package javaCodes;


import java.util.*;

public class AbcClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
String str="N!a$v#2e1e*n";
StringBuilder sb=new StringBuilder();

for(int i=0;i<str.length();i++) {
	char c=str.charAt(i);
	if(Character.isLetter(c)) {
		sb.append(c);
	}
}

		System.out.println(sb.toString());
	}

}
