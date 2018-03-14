import java.lang.*;
import java.io.*;
import java.util.*;
class Account implements Serializable {
	String name ="Sarabejeet Singh ";
	transient String pass= "saby";
	transient int pin = 1234;
	
	private void writeObject(ObjectOutputStream ostream)throws Exception{
		ostream.defaultWriteObject();
		String epass="pussythegreat"+pass;
		int epin = 547+pin;
		ostream.writeObject(epass);
		ostream.writeInt(epin);
	}
	private void readObject(ObjectInputStream istream)throws Exception{
		istream.defaultReadObject();
		String epass=(String)istream.readObject();
		pass=epass.substring(13);
		int epin = istream.readInt();
		pin=epin-547; 
	}

}
public class AccountImplementer {
	public static void main(String [] arsg ) throws Exception {
		Account c = new Account();
		
		FileOutputStream fos = new FileOutputStream("Account_File_Custom_Serialized");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(c);
		
		FileInputStream fis  = new FileInputStream("Account_File_Custom_Serialized");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account d = (Account)ois.readObject();
		
		System.out.println(d.name+"..."+d.pin+".."+d.pass);
	}
	
}