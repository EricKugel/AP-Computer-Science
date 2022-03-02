public class Test {
    public static void main (String[] arg0) {
        int[][] testArray = new int[5][6];
        for (int[] row : testArray) {
            for (int item : row) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }
    }
}