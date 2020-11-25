package lessonTwo;

public class DataArray {
    private int count;
    public void checkedInteger(String[][] strings) throws MyArrayDataException {
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                try {
                    count = Integer.parseInt(strings[i][j]);
                } catch (Exception e) {
                    throw new MyArrayDataException("Ошибка преобразования в ячейке: " + (i+1) + " " + (j+1));
                }
            }
        }
    }
}
