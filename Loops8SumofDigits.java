import java.util.Scanner;
public class Loops8SumofDigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n, sum = 0, copy, digit;

        System.out.println("Eneter a number: ");

        n = sc.nextInt();
        copy = n;
        while(copy>0) {
            digit = copy % 10;
            sum = sum + digit;
            copy = copy / 10;
        }
        System.out.println(sum);


        sc.close();
    }
}
