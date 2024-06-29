public class MyCars {
    String car1 = "Mcleran ,";
    String car2 = " Mercedes Benz ,";
    String car3 = " Koinegsegg ,";
    String car4 = " Lamborghini ";
    String MyCars = car1 + car2 + car3 + car4;
    
    static void Brake(){
        System.out.println("Destination Reaching");
    }

    void brake(){
        System.out.println("Destination reaches");
    }
    public static void main(String[] args) {
        MyCars obj = new MyCars();
        System.out.println(obj.MyCars);

        Brake();
        obj.Brake();
        


        
    }
    
}
