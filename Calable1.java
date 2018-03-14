import java.lang.*;
import java.util.*;
import java.util.concurrent.*;
 class Calable implements Callable {
	public Object call() throws Exception {
		Random gen = new Random();
		Integer  rnum= gen.nextInt(5);
		Thread.sleep(rnum*1000);
		return rnum;
	}
}
public  class Calable1  {
	public static void main(String [] args ) throws Exception{
				FutureTask [] rn = new FutureTask[5];
				for(int i=0;i<5;i++){
					Callable cl = new Calable();
					rn[i]=new FutureTask(cl);
					Thread t = new Thread(rn[i]);
					t.start();
				}
				for(int i=0;i<5;i++){
					System.out.println(rn[i].get());
				}
	}
}
