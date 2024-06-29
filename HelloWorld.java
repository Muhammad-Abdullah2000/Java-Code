
import java.util.Scanner;
public class HelloWorld {

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
       int password;
       System.out.println("Enter your password");
       password = input.nextInt();
       if(password == 123){

        System.out.println("Hello World");


        }
        else{
            System.out.println("Invalid password");
        }
    }
}