import java.lang.*;
import java.util.*;
public class Binary22{
		static void init(int a[]){
			for(int i=0;i<a.length;i++){
				a[i]=0;
			}
		}
		public static void main(String [] args){
			int [] b= new int[4];
			for(int i=0;i<16;i++){
				init(b);
				int temp=i;
				int t=0;
				for(int j=0;j<4;j++){
					if(temp%2==1){
						b[t++]=1;
					}else{
						b[t++]=0;
					}
					temp=temp/2;
				}
				System.out.println(Arrays.toString(b));
				
			}
		}
}