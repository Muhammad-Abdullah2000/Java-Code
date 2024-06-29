import java.util.Scanner;

class AudioDriverService {
    public static AudioDriverService audio = new AudioDriverService();
   
    public static AudioDriverService getInstance() {
        return audio;
    }

    public void Windows_Media_Player() {
        System.out.println("Playing Windows Media Player");
    }

    public void Youtube_Player() {
        System.out.println("Youtube Player is playing");
    }
}

public class Desing_Pattern_Mid {
    public static void main(String[] args) {
        System.out.println("Design Patterns Mid");
        AudioDriverService ins = AudioDriverService.getInstance();

        int a;
        System.out.println("Which Media Player do you Want to play");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        switch (a) {
            case 1:
                ins.Windows_Media_Player();
                break;

            case 2:
                ins.Youtube_Player();
                break;

            default:
                System.out.println("Invalid Value");
                break;
        }

    }

}
