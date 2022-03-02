public class ArrayPrinter {
    public static String printArray(Object[][] array) {
        int[] colWidths = new int[array[0].length];
        for (int col = 0; col < array[0].length; col++) {
            int maxWidth = array[0][col].toString().length();
            for (int row = 0; row < array.length; row++) {
                if (array[row][col].toString().length() > maxWidth) {
                    maxWidth = array[row][col].toString().length();
                }
            }
            colWidths[col] = maxWidth;
        }

        int totalWidth = 1;
        for (int width : colWidths) {
            totalWidth += width + 1;
        }

        String output = "";
        for (int i = 0; i < totalWidth; i++) {
            output += "\u2212";
        }
        output += "\n";

        for (int row = 0; row < array.length; row++) {
            output += "|";
            for (int col = 0; col < array[0].length; col++) {
                int colWidth = colWidths[col];
                int width = array[row][col].toString().length();
                int spaces = colWidth - width;
                for (int i = 0; i < spaces / 2; i++) {
                    output += " ";
                }
                output += array[row][col].toString();
                for (int i = 0; i < spaces / 2; i++) {
                    output += " ";
                }
                if (spaces % 2 == 1) {
                    output += " ";
                }
                output += "|";
            }
            output += "\n";
            for (int i = 0; i < totalWidth; i++) {
                output += "\u2212";
            }
            output += "\n";
        }
        return output;
    }

    public static void main(String[] arg0) {
        String[][] array = {
            {"", "Sunday", "Monday", "Tuesday", "Wednesday", "etc."},
            {"1", "", "Meeting", "", "Project", ""},
            {"2", "Meeting", "asdf", "nothing", "", "etc"},
            {"3", "etc", "etc", "etc", "etc", "etc"},
            {"4", "week 4", "3", "2", "4", "1"}
        };
        System.out.println(printArray(array));
    }
}
