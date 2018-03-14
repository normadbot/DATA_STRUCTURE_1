import java.lang.*;
import java.util.*;

public class Compare1{
	public static void main(String [] args ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array");
		String [] stra ={"Saby","Sonal","Pahul","Rekhit"};
		String  temp;
		for(int i=0;i<4;i++){
			for(int j=i+1;j<4;j++){
				if(stra[i].compareTo(stra[j])>0){
					temp=stra[i];
					stra[i]=stra[j];
					stra[j]=temp;
				}
			}
			
		}
		for(int k=0;k<4;k++){
			System.out.println(stra[k]);
		}
	
	}

}