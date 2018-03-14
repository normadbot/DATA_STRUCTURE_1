import java.lang.*;
import java.util.*;
public class CommonWordsinTwoStrings{
		public static void main(String [] args){
			String s1="Hello my name is Sabby";
			String s2= "name of my brother is sabby";
			String a[]=s1.split(" ");
			String b[]=s2.split(" ");
			
			for(String i:a){
				for(String j:b){
					if(i.equals(j)){
						System.out.println(j);
					}
				}
			}
		}
}
