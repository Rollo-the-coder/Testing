import java.util.Scanner;

public class Number4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int oddeven = sc.nextInt() % 2;

        if (oddeven == 0) {
            System.out.println("if even");
        } else {
            System.out.println("if odd");
        }

        switch (oddeven) {
            case 0: System.out.println("switch even");
            break;
            default: System.out.println("switch odd");
        }

        String result = oddeven == 0 ? "Ternary even" : "Ternary odd";
        System.out.println(result);

        
        
        sc.close();
    }
}
