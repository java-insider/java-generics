package generics;

import java.util.ArrayList;
import java.util.List;

public class Matrix<T> {
    private static final int SIZE = 3;
    private final List<List<T>> elements = new ArrayList<>();

    public Matrix() {
        for (int i = 0; i < SIZE; i++) {
            List<T> row = new ArrayList<>();
            for (int j = 0; j < SIZE; j++) {
                row.add(null);
            }
            elements.add(row);
        }
    }

    public void print() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(elements.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public void set(int row, int col, T element) {
        elements.get(row).set(col, element);
    }
}
