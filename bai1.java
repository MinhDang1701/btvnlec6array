
import java.util.Scanner;
import java.util.Arrays;

public class bai1 {


    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap n: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Nhap ptu:");
        for (int i = 0; i < n; i++) {
            System.out.print("Ph tử " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        System.out.println("Kq: " + Arrays.toString(array));
    }
}

    

