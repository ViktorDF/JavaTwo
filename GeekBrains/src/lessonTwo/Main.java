package lessonTwo;

public class Main {
    public static void main(String[] args) {
        String[][] strings = {
                {"1","y","3","4"},
                {"5","4","7","8"},
                {"9","10","11","12"},
                {"1","2","3","4"}
        };

        try {
            System.out.println(doSumArray(strings));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
    }

    public static int doSumArray(String[][] strings) throws MyArraySizeException, MyArrayDataException {
        new ArraySize().doCheck(strings);
        new DataArray().checkedInteger(strings);
        int count = 0;
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                count = count + Integer.parseInt(strings[i][j]);
            }
        }
        return count;
    }
}
