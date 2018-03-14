import java.io.*;
import java.lang.*;


public class Allread {
					
				public Allread()  throws IOException{
					File file = new File("E:\\Java Programs\\car");
					String [] f  = new String[100];
					f=file.list();
					
					for(String fn : f){
						System.out.println("Found these "+fn);
					}
				
			
			
			}
			
			public static void main(String [] args ) throws IOException {
			
			Allread a = new Allread();
										
			
			}
}


		