import java.util.Arrays;
import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] matrix = new int[3][3];
        for (int x = 0; x < matrix.length; x++) {
            matrix[x][x] = num;
            matrix[2 - x][x] = num;
        }
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        main(args);
    }
}
