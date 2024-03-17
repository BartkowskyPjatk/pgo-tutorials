import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner Skan = new Scanner(System.in);
        System.out.println("Write your number");
        int podanyNumer = Skan.nextInt();
        if (podanyNumer<0){
            System.out.println("The number is negative");
        } else if (podanyNumer==0) {
            System.out.println("The value equals 0");
        } else {
            System.out.println("The number is positive");
        }

    }
}