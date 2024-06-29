
class Base1{
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int x){
        System.out.println("I am a overloaded constructor with x " + x);
    }
   
        }
        class Derived1 extends Base1{
            Derived1(){
              System.out.println("I am a derived class construtor");
           }
        Derived1(int x, int y){
          //  super(x);
            System.out.println("I am a overloaded constructor with y " + y);
    }
}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am child of Derived class");
    }
    ChildOfDerived(int x , int y, int z){
        System.out.println("I am a overloaded constructor of Derived class with z " + z);
    }
}

public class Constructors_In_Inheritence {
    public static void main(String[] args) {
      ///  Base1 b = new Base1(); 
        Base1 b1 = new Base1(69);
        Derived1 d = new Derived1(56, 34);
        ChildOfDerived cd = new ChildOfDerived(90, 56, 45);
      
    }

    
}