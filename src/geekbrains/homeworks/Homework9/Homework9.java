package geekbrains.homeworks.Homework9;

public class Homework9 {

    public static void main(String[] args) {
        String arrayItems[][] = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "j", "4"},
                {"1", "2", "3", "4"},
        };
        sumCells(arrayItems);
    }

    public static int sumCells(String[][] arrayItems) {
        checkSize(arrayItems);
        int sum = 0;
        for (int i = 0; i < arrayItems.length; i++) {
            for (int j = 0; j < arrayItems.length; j++) {
                try {
                    sum = sum + Integer.parseInt(arrayItems[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Not integer format - " + arrayItems[i][j], e);
                }
            }
        }
        return sum;
    }

    static void checkSize(String[][] arrayItems) {
        checkLengthSize(arrayItems.length);
        for (int i = 0; i < arrayItems.length; i++) {
            checkLengthSize(arrayItems[i].length);

        }
    }

    static void checkLengthSize(int lenght) {
        if (lenght != 4) {
            throw new MyArraySizeException("Array size must be 4, following size is " + lenght);
        }
    }

}
