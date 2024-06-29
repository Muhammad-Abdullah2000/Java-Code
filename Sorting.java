import java.util.Scanner;
public class Sorting {
    public static void main(String[] args) {
 //Initialize array     
 int [] a = new int [] {5, 4, 3, 2, 1};     
 int temp = 0;    
     
 System.out.println("Elements in array: ");    

  int x = 0;
  while(x < 5){
      System.out.println(a[x] + " ");
      x++;
  } 
 for (int i = 0; i < a.length; i++) {     
     for (int j = i+1; j < a.length; j++) {     
        if(a[i] > a[j]) {    
            temp = a[i];    
            a[i] = a[j];    
            a[j] = temp;    
        }     
     }     
 }    
 System.out.println("Elements after being sorted in asending order: ");    
 for (int i = 0; i < a.length; i++) {     
     System.out.print(a[i] + " ");    
 }    
}    
}    

    

       
