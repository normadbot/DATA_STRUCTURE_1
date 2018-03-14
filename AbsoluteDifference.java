import java.lang.*;
import java.util.*;
public class AbsoluteDifference {
		public static void main(String [] args ){
				int a[]={1,8,9,15,16};
				int b=0;
				for(int i=a.length-1;i>=0;i--){
					int j=0;
					do{
						if((a[i]-a[j])>0){
							b+=(a[i]-a[j]);
						}
						j++;
					}while(j<a.length-1);
					j++;
				}
				System.out.println("The value is :"+b);
		
		
		}
}

