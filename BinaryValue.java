import java.lang.*;
import java.util.*;
public class BinaryValue{
		public static void main(String [] args){
			
			for(int i=1;i<=2;i++){
				int num=i<<1;
			//	System.out.print(" "+num);
				while(num!=0){
					int bit=num%2;
					System.out.print(bit+" ");
					System.out.println();
					num	=num/2;
					bit=0;
				}
			}
			
		}
}