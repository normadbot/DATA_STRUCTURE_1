import  java.lang.*;
import java.util.*;
import java.math.*;
public class BigNumberAdd1{
			public static String reverseIt(String source) {
				int i, len = source.length();
				StringBuilder dest = new StringBuilder(len);
					for (i = (len - 1); i >= 0; i--){
						dest.append(source.charAt(i));
					}
					return dest.toString();
			}
			public static void main(String [] args){
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter The Number you Want ADD: ");				
				String s1=sc.next();
				System.out.println("Number you Want ADD With: ");
				String s2=sc.next();
				String s="";																								////999999
				int sum;																							//			 11111		
				int c=0;
				char ch='\0';	
		l:	for(int i=s1.length()-1,j=s2.length()-1;i>=0 || j>=0;i--,j--){
						sum=0;
						if(ch=='y'){
							int g=c+Character.getNumericValue(s1.charAt(i));
							c=0;
							if(g>9){
							c=g/10;
							sum=g%10;
							s+=Integer.toString(sum);
							continue l;
							}
							s+=Integer.toString(g);
							continue l;
						}
						if(ch =='n'){
							int g1=c+Character.getNumericValue(s2.charAt(j));
							c=0;
							if(g1>9){
								c=g1/10;
								sum=g1%10;
								s+=Integer.toString(sum);
								continue l;
							}
							s+=Integer.toString(g1);
							continue l;
						}
						sum=Character.getNumericValue(s1.charAt(i))+Character.getNumericValue(s2.charAt(j))+c;
						c=0;
						if(sum>9){
							c=sum/10;
							sum=sum%10;
						}
							s+=Integer.toString(sum);
							if((j)==0 &&(i)!=0) {ch='y';}
					        if((i)==0 && (j)!=0) {ch='n';}
				}
				if(c==0){
				System.out.println(reverseIt(s));				
				}
				else System.out.println(reverseIt(s+c));				
			}
}