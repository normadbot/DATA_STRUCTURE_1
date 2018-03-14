import java.lang.*;
import java.util.*;
import java.util.Stack;
public class BalancedExp{
		public static void main(String [] atr){
			String str1="[()]{}{[()()]()}";
			String str2="[(])";
			String str3="{{{";
			Stack st = new Stack();
			char a='[';
			char b=']';
			char c='(';
			char d=')';
			char e='{';
			char f='}';
			for(int i=0;i<str1.length();i++){
				if(str1.charAt(i)==a){
					st.push(str1.charAt(i));
				}if(str1.charAt(i)==c){
					st.push(str1.charAt(i));
				}if(str1.charAt(i)==e){
					st.push(str1.charAt(i));
				}
				
				if(str1.charAt(i)==b){
					Character t = (Character)st.pop();
					if(t=='['){
					}else{
						break;
					}
				}if(str1.charAt(i)==d){
					Character t = (Character)st.pop();
					if(t=='('){
						
					}else{
						break;
					}
				}if(str1.charAt(i)==f){
					Character t = (Character)st.pop();
					if(t=='{'){
						
					}else{
						break;
					}
				}
				
			}
			if(st.isEmpty()){
				System.out.println("Balanced");
				System.out.println(st);
			}else{
				System.out.println(st);
				System.out.println("NotBalanced");
			}
		}
}