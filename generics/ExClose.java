package generics;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

public class ExClose {

    public static void main(String[] args) {
        BufferedWriter obj1 = new BufferedWriter(null);
        OutputStreamWriter obj2 = new OutputStreamWriter(null);

        var list = List.of(obj1, obj2);
        closeAll(list);
    }

    private static <T extends Closeable> void closeAll(List<T> objects) {
        objects.forEach(o -> {
            try {
                o.close();
            } catch (IOException e) {
                // Ignore
            }
        });
    }
}
