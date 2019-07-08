
public class Main {
    public static void main(String[] args) {
        double matrix[][] = new double[5][5];

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = Math.floor(Math.random() * 15);
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        double max = matrix[0][0];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] > max) {
                    max = matrix[row][column];
                }
            }
        }
        System.out.println("Max la :" +max);
    }
}