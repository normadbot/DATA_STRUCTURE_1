import java.lang.*;
import java.util.*;
public class A112{
	static boolean check(int a[],int n){
			for(int j=1;j<n-1;j++){
				
				int i=j-1,k=j+1;
				while(i>=0 && k<=n-1){
					if((a[i]+a[k])==2*a[j]){
						return true;
					}
					if((a[i]+a[k])<(2*a[j])){
						k++;
					}else{
						i--;
					}
				}
			}
			return false;
		}
		public static void main(String [] args){
			int a[] ={1,7,10,15,27,29};
			boolean b=check(a,a.length);	
			System.out.print(b);
		}
}