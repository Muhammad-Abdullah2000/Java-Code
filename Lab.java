class Employee {
        Employee(String s, int i){
            System.out.println("The name of the 1st employee is: " + s);
            System.out.println("The id of the 2nd employee is: " + i);
        }
        Employee(String S, int I, int salary){
        //    System.out.println("The name of the 1st employee is: " + s);
      //      System.out.println("The id of the 1st employee is: " + i);
            System.out.println("The name of the 2nd employee is: " + S);
            System.out.println("The id of the 2nd employee is: " + I);
          //  System.out.println("The salary of 1st employee is: " + salary);
            System.out.println("The salary of 1st employee is: " + salary);


        }
    
    }
    public class Lab{
        public static void main(String[] args) {
            Employee Abdullah = new Employee("Abdullah",52, 30000);
            Employee Ahmad = new Employee("Ahmad",53,30000);

    

        }
    }