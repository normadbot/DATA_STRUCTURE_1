import java.lang.*;
import java.util.*;
public class AnagramCheck{
		public static void main(String [] args){
			String str1="abcdef";
			String s2="bdacfe";
			String s3="abbdfe";
			String s4="abbdfq";
	//	checkAnagram1(str1,s2);
		boolean t=checkAnagram2(str1,s2);
		System.out.print(t);
		}
		static boolean checkAnagram2(String str1,String s2){
			char a[]=str1.toCharArray();
			char b[]=str1.toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			return Arrays.equals(a,b);
		}
		static void  checkAnagram1(String s1,String s2){
			for(int i=0;i<s1.length();i++){
				int c1=0,c2=0;
				for(int j=0;j<s1.length();j++){
					if(s1.charAt(i)==s1.charAt(j)){
						c1++;
					}
				}
				for(int k=0;k<s2.length();k++){
					if(s1.charAt(i)==s2.charAt(k)){
						c2++;
					}
				}
				if(c1!=c2){
					System.out.print("Not Anagramm");
					return;
				}
			}
			System.out.print("Its an anagram");
		}
}