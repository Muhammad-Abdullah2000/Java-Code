
import java.util.Scanner;
public class FA20_BSE_052 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
                                                                                      // NAME:         Muhammad Abdullah
                                                                                      // Reg#:         FA20-BSE-052
        int marks[] = new int[5];                                                     // Assingment#:       1
        int a = 0;                                                                    // Submitted to:  Sir Nasir Mehdi

        System.out.println("Enter the marks of five students out of 100: ");
        while (a < 5) {

            marks[a] = input.nextInt();
            a++;
        }
        System.out.println("Marks of students out of 100 are: ");

        int i = 0;
        while (i < 5) {
            System.out.println(marks[i]);
            i++;
        }


        int p = 0;
        int Maxnum = marks[0];
        while (p < 5) {
            if (marks[p] > Maxnum) {

                Maxnum = marks[p];

            }
            p++;
        }
        System.out.println("Maximum number is: " + Maxnum);


        int q = 0;
        int Mininum = marks[0];
        while (q < 5) {
            if (marks[q] < Mininum) {

                Mininum = marks[q];
            }
            q++;
        }
        System.out.println("Minimum number is: " + Mininum);

        int average;
        average = (marks[0] + marks[1] + marks[2] + marks[3] + marks[4]) / 5;
        System.out.println("The average is: " + average);


        int b = 0;
        while (b < marks.length) {
            float percentage;
            percentage = (marks[b] * 100) / 100f;
            System.out.println("The percentage of students are ----> " + percentage);
            b++;


        }
    }
}