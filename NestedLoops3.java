import java.util.Scanner;

public class NestedLoops3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, x;

        for(i = 1; i <= n; i++) {
            for(x = 1; x <= i; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(i = n; i >= 1; i--) {
            for(x = i; x >= 1; x--) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }    
}
