import java.util.Scanner;

public class number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number");
        int oddeven = sc.nextInt() % 2;

        if (oddeven == 0) {
            System.out.println("if says even");
        } else {
            System.out.println("if says odd");
        }

        switch (oddeven) {
            case 0: System.out.println("switch says even");
            break;
            case 1: System.out.println("switch says odd");
            break;
        }

        String result = oddeven == 0 ? "ternary says even" : "ternary says odd";
        System.out.println(result);

        sc.close();
    }
}
