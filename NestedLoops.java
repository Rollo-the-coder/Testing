import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i, x;
        for (i = 1; i <= n; i++) {
            for (x = 1; x <= i; x++) {
                System.out.print("*");
            }
            System.out.println();
        }


        sc.close();
    }
}
