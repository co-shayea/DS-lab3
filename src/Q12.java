import java.util.Random;
public class Q12 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        shuffle(array);

        // Print the shuffled array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void shuffle(int[] arr) {
        Random rand = new Random();

        for (int i = arr.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1); // Generate a random index between 0 and i (inclusive)
            // Swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
