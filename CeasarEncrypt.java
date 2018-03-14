import java.lang.*;
import java.util.*;
public class CeasarEncrypt{
		public static final String ALPHABET="abcdefghijklmnopqrstuvwxyz";
		static String encrypt(String plaintext,int shift){
		plaintext=plaintext.toLowerCase();
		String Cypher="";
		for(int i=0;i<plaintext.length();i++){
			int plainchar =  ALPHABET.indexOf(plaintext.charAt(i));
			int substitute  = (shift  +  plainchar)%26;
			char replaceval =  ALPHABET.charAt(substitute);
			Cypher+= replaceval;
		}
		return Cypher;
	}
	static String decrypt(String text,int shift){
		text=text.toLowerCase();
		String decyphur="";
		for(int i=0;i<text.length();i++){
			int textpos=ALPHABET.indexOf(text.charAt(i));
			int keyval=(textpos-shift)%26;
			if(keyval<0){
				keyval=ALPHABET.length()+keyval;
			}
			char replaceval=ALPHABET.charAt(keyval);
			decyphur+=replaceval;
		}		
		return decyphur;
		
	}
	
		public static void main(String [] args ) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the string for Encryption");
			String str=s.nextLine();
			System.out.println(encrypt(str,3));
		    System.out.print(decrypt(encrypt(str,3),3)); 
			s.close();
		}

}