import java.util.Scanner;

public class ArraysPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Please enter the length of the array");
        int length = sc.nextInt();

        int[] array = new int[length];

        //input collection of elements
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter element at index [" + i + "]");
            int element = sc.nextInt();
            array[i] = element;
        }

        //seperators of array elements
        for (int i = 0; i < array.length; i++) {
            if (i>0) {
                System.out.print(" | ");
            }
            System.out.print(array[i]);
        }

        //to find the largest value
        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        System.out.println();
        System.out.println("The largest value is " + largest);

        //to find the smallest value
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        System.out.println("The smallest value is " + smallest);

        sc.close();
    }
}
