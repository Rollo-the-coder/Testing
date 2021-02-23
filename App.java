import java.util.Scanner;

class App {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number");
        int oddcheck = sc.nextInt() % 2;

        //if method

        if (oddcheck == 0) {
            System.out.println("Even Number says if");
        } else {
            System.out.println("Odd Number says if");
        }



        //switch method

        switch (oddcheck) {
            case 1:
            System.out.println("Switch says odd");
            break;
            default:
            System.out.println("Switch says even");
        }

        //ternary method

        String result = oddcheck == 0 ? "Ternary says even" : "Ternary says odd";
        System.out.println(result);

        sc.close();
    }
}