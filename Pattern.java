
public class Pattern {
    public static void main(String[] args) {
        // The number of rows in the pattern
        int n = 5;
        // Loop for the upper half of the pattern
        for (int i = n; i >= 1; i--) {
            // Print spaces before the numbers
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            // Print the numbers in descending order
            for (int k = i; k <= n; k++) {
                System.out.print(k + " ");
            }
            // Print the numbers in ascending order
            for (int l = n - 1; l >= i; l--) {
                System.out.print(l + " ");
            }
            // Move to the next line
            System.out.println();
        }
        // Loop for the lower half of the pattern
        for (int i = 2; i <= n; i++) {
            // Print spaces before the numbers
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            // Print the numbers in descending order
            for (int k = i; k <= n; k++) {
                System.out.print(k + " ");
            }
            // Print the numbers in ascending order
            for (int l = n - 1; l >= i; l--) {
                System.out.print(l + " ");
            }
            // Move to the next line
            System.out.println();
        }
    }
}


