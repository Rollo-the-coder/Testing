public class Loops9DoWhile {
    public static void main(String args[]) {

        
        int a = 1;
        int b = 0;
        int c = 0;
        do
        {
            System.out.print(c + ",");
            c = a+b;
            a = b;
            b = c;
            
            
        } while (c < 1000);
    }
}
