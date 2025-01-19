  import java.util.Scanner;
public class bai2 {
  


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap n: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("nhap ptu :");
        for (int i = 0; i < n; i++) {
            System.out.print("Ph tu " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        int min = array[0];

        for (int num : array) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("max: " + max);
        System.out.println("min : " + min);
    }
}


