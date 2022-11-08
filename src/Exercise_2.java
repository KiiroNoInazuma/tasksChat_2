import java.util.Arrays;

public class Exercise_2 {
    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};
        int[] add = new int[arr.length];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            add[4 - i] = arr[i];
        }
        arr = add;
        System.out.println(Arrays.toString(arr));
    }
}