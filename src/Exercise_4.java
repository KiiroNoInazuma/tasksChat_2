public class Exercise_4 {
    public static void main(String[] args) {
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int j : arr) {
            for (int i : arr) {
                if (j + i == -2)
                    System.out.println("[" + j + "] " + "[" + i + "]");
            }
        }
    }
}
