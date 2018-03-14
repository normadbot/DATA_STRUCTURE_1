import java.lang.*;
import java.util.*;
public class BleakNumber{
		static int bleakNumber(int n){
			String s= Integer.toBinaryString(n);
			int c=0;
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)=='1'){
				c++;
				}
			}
			return c;
		}
		public static void main(String [] args){
			int a=4;
			int b=3;
			int x=0;
			for(int i=1;i<4;i++){
				if((i+bleakNumber(i))==a){
					System.out.println("true");
					x=1;
					break;
				}
			}
			if(x!=1)System.out.println("false");
		}
}