import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the length of the array");
        int length = sc.nextInt();

        String[] genshinCharacters = new String[length];

        
        for (int i = 0; i < length; i++) {
            System.out.println("Please enter the name of character " + genshinCharacters[i]);
            String name = sc.nextLine();
            genshinCharacters[i] = name;
        }

        System.out.println(genshinCharacters);




        sc.close();
    }

    // public String characterNames(String name) {
    //     int copy length2 = length;
    //     for (int i = 0; i < length; i++) {

    //     }
    // }

}