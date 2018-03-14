import java.lang.*;
import java.util.*;
public class checks1{
	static void per(String s ,int i,int j){
		for(int k=0;k<=j;k++){
			System.out.print(i+" i and j"+j);
			per(s,i+1,j);
		}
	}
	public static void main(String [] args){
		String s= "abc";
		per(s,0,s.length()-1);
	}
}
