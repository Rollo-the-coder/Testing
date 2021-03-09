public class LoopsDoWhile {
    public static void main(String args[]) {
        

        int i = 1;
        int count = 1;
        do
        {
           
            System.out.print(i + ", ");
            i = i + count;
            count++;
        } while (i < 100);

    }
}
