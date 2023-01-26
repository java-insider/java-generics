package generics;

public class ExMatrix {

    public static void main(String[] args) {
        Matrix<Integer> m1 = new Matrix<>();
        m1.set(0, 0, 1);
        m1.set(1, 1, 5);
        m1.print();
    }
}
