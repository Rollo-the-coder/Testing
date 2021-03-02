import java.util.Scanner;

public class Loops4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean valid = false;
        double input = 0;
        while (valid == false)
        {
        System.out.print("Please enter a positive value < 100: ");
        input = sc.nextDouble();
        if (0 < input && input < 100) { valid = true; }
        else { System.out.println("Invalid input."); }
        }
}
}