import javax.swing.plaf.synth.SynthTreeUI;

class MultTable {

    public static void main(String[] args) {

        // create an empty 2-d array
        int[][] table = new int[12][9];

        // loop from 1 to 10
        for (int i = 1; i <= 12; i++) {
            // loop from 1 to 10
            for (int j = 1; j <= 9; j++) {
                // assign the product of i and j to the array element
                table[i - 1][j - 1] = i * j;
            }
        }
        // using nested for loop to display the result

        // iterates down the table ie top to bottom(from 1 to 12)
        System.out.println();
        for (int i = 0; i < 12; i++) {
            // iterates from right to left(from 1 to 9)

            for (int j = 0; j < 9; j++) {
                // this prints the value in the 2D array or table
                System.out.print((j + 1) + "*" + (i + 1) + "=" + table[i][j] + "     ");

            }
            // this prints to new line after each iteration of i (the outer for loop)
            System.out.println();
        }
    }
}
