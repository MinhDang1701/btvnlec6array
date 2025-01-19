 import java.util.Scanner;
public class bai4 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Nhap ptu:");
        for (int i = 0; i < n; i++) {
            System.out.print("Ph tu " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int[] temp = new int[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            boolean xoalap = false;
            for (int j = 0; j < k; j++) {
                if (array[i] == temp[j]) {
                    xoalap = true;
                    break;
                }
            }
            if (!xoalap) {
                temp[k++] = array[i];
            }
        }

        System.out.print("KQ : ");
        for (int i = 0; i < k; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}


