import java.lang.*;
import java.util.*;
public class ArrayDel{
		public static void main(String [] args ){
				Scanner s = new Scanner(System.in);
				int a[] = {5,6,1,14,8,9,16};
				for(int x=0;x<a.length;x++){
					System.out.print(a[x]+" ");
				}
				System.out.println();
				System.out.println("Enter the Element you want to delete");
				int num= s.nextInt();
				int pos=0;
				int t=0;
				for(int i=0;i<a.length-1;i++){
					if(a[i]==num){
						pos=i;
						t++;
					}
					
				}
				if(t==0){System.exit(0);}
				for(int y=pos+1;y<a.length;y++){
					a[pos]=a[pos+1];
					pos++;
					
				}
				for(int y=0;y<a.length-1;y++){
					System.out.print(a[y]+" ");
				}
		}
}