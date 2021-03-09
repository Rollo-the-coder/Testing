import java.util.Scanner;

public class Loops5doWhile {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        int tally = 1;
        //System.out.print("1,");
        do
        {
           
            
            System.out.print(tally + ",");
            tally += i;
            i++;
        } while (tally < 100);

        sc.close();
    }
}
