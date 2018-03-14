import java.lang.*;
import java.util.*;
public class Automorphic{
		public static void main(String [] ra) throws Exception{
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int x=n*n;
			String s1=Integer.toString(x);
			String s2=Integer.toString(n);
			int l2=s2.length();
			String s3=s1.substring(l2);
			if(s3.equals(s2)){
			System.out.println("yes Automorphic");
			}else{
				System.out.println("Not Automorphic");
			}
			//System.out.println(s3);
			
			
		}
}