import java.lang.*;
import java.util.*;
public class ArrayNumberAdd{
			public static void main(String [] arfgs ){
				
				int a[]={9,9,9,9,9};
				int b[]={1,1,1,1}; 
				int res[]= new int[a.length+1];
				int sum,c=0,x=0;
				char ch='\0';
			l:	for(int i=a.length-1,j=b.length-1;i>=0 || j>=0 ;i--,j--){
							sum=0;
							if(ch=='y'){
								int g=c+a[i];
								if(g>9){
									c=g/10;
									sum=g%10;
									res[x++]=sum;
									continue l;
								}
								res[x++]=g;
								continue l;
							}
							
							sum=a[i]+b[j]+c;
							c=0;
							if(sum>9){
							    c=sum/10; 
								sum=sum%10;								
							}
							res[x++]=sum;
					
					if((j)==0 &&(i)!=0) {ch='y';}
					if((i)==0 && (j)!=0) {ch='n';}
					
				}
				if(c==1){
					res[x]=c;
					for(int i=res.length-1;i>=0;i--){
						System.out.print(" "+res[i] );
					}
				}else{
					for(int i=res.length-1;i>=0;i--){
						System.out.print(" "+res[i] );
					}
				}
				
				
				
			}
}