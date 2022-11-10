public class Exercise_4 {
    public static void main(String[] args) {
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[j] + arr[i] == -2)
                    System.out.println("[" + arr[j] + "] " + "[" + arr[i] + "]");
            }
        }
    }
}
