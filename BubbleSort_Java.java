import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = new int[10];

      
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        
        bubbleSort(array);

        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        scan.close();
    }

    public static void bubbleSort(int[] arry) {
        int n = arry.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arry[j] > arry[j + 1]) {
                    int temp = arry[j];
                    arry[j] = arry[j + 1];
                    arry[j + 1] = temp;
                    swapped = true;
                }
            }
           
            if (!swapped) {
                break;
            }
        }
    }
}
