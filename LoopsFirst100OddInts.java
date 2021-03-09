public class LoopsFirst100OddInts {
    public static void main(String args[]) {
        int i;
        int sum = 0;
        for (i = 1; i < 101; i++) {
            
            if (i % 2 == 1) {
                sum = sum + i;
            }
            
        }
        System.out.println(sum);

        int x;
        int product = 1;
        for (x = 1; x < 101; x++) {
            if (x % 2 == 1) {
                product = product * x;
            }
        }
        System.out.println(product);


        int product2 = 1;
        int oddNumber = 1;
        int count = 1;
        for (count = 1; count < 101; count++) {

            product2 = product2 * oddNumber;

            oddNumber = oddNumber + 2;
        }
        System.out.println(product2);
    }
}
