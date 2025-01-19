    import java.util.Scanner;
public class bai5 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap  n: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Nhap ptu:");
        for (int i = 0; i < n; i++) {
            System.out.print("Ph tu" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Sắp xếp thủ công
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("Kq: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

