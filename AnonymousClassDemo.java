import java.lang.*;

public class AnonymousClassDemo
{
  public static void main(String[] args)
  {
    Dog dog = new Dog() {
      public void someDog ()
      {
        System.out.println("Anonymous Dog");
      }			
    }; // anonymous class body closes here
    //dog contains an object of anonymous subclass of Dog.
    dog.someDog();
  }
}
 
class Dog
{
  public void someDog()
  {
    System.out.println("Classic Dog");
  }
}