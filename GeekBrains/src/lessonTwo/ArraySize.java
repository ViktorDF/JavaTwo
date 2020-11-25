package lessonTwo;

public class ArraySize {
    public void doCheck(String[][] strings) throws MyArraySizeException {
        if (strings.length > 4) {
            throw new MyArraySizeException("Размер " +
                    "массива слишком велик!");
        }
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length > 4) {
                throw new MyArraySizeException("Размер " +
                            "массива слишком велик!");
            }
        }
    }
}

