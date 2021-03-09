import java.util.Scanner;

public class Loops7CountNumberDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int digits = 0, copy;
        System.out.println("Please enter a number");
        int number = sc.nextInt();
        copy = number;

        while (copy>0) {
            digits++;
            copy = copy / 10;
        }

        System.out.println("The number of digits = " + digits);



        sc.close();
    }
}
