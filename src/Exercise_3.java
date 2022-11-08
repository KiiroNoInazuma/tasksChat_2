import java.util.Arrays;

public class Exercise_3 {
    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};
        int buffer;
        for (int x = 0; x < arr.length / 2; x++) {
            buffer = arr[x];
            arr[x] = arr[arr.length - (x + 1)];
            arr[arr.length - (x + 1)] = buffer;
        }

        System.out.println(Arrays.toString(arr));
    }

}


