import java.util.Scanner;
//using tab to autocomplete lots of stuff here, running program with ctrl f5, ctrl q to cycle to terminal
public class Number5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oddeven = sc.nextInt() % 2;

        if (oddeven == 0) {
            System.out.println("if even");
        } else {
            System.out.println("if odd");
        }

        switch (oddeven) {
            case 0:
                System.out.println("switch even");
                break;
        
            default: 
                System.out.println("switch odd");
                break;
        }

        System.out.println(oddeven == 0 ? "ternary even" : "ternary odd");

        sc.close();
    }
}
