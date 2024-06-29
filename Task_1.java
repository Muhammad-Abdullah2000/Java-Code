
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int rollNum[] = new int[5];
     
        for(int i = 0; i < 5; i++){
            System.out.println("Enter your roll number: " + (i+1));
            rollNum[i] = input.nextInt();
        }
   

        int marks[] = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.println("Enter marks " + (i+1));
            marks[i] = input.nextInt();
        }
        float gpa[] = new float[5];
        for(int i = 0; i < 5; i++){
            System.out.println("Enter gpa: " + (i+1));
            gpa[i] = input.nextFloat();
        }

        for(int j = 0; j < 5; j++){
            System.out.println("marks of students are " + (j+1) + " are " + marks[j]);

        }
        int highest;
      highest = marks[0];
      int y = 0;

         while(y < marks.length){
             if(marks[y] > highest){
                 highest = marks[y];
             }
             y++;

         }
         System.out.println("highset is " + highest);
              
        
         float highestgpa;
      highestgpa = gpa[0];
      int x = 0;

         while(x < gpa.length){
             if(gpa[x] > highestgpa){
                 highestgpa = gpa[x];
             }
             x++;

         }
         System.out.println("highset gpa is " + highestgpa);
        
        
        
        }

        
        
    }
    

