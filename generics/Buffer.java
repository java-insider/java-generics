package generics;

import java.util.LinkedList;
import java.util.Optional;
import java.util.function.Function;

public class Buffer<T> {
    private final LinkedList<T> elements;

    public Buffer() {
        this(new LinkedList<>());
    }

    private Buffer(LinkedList<T> elements) {
        this.elements = elements;
    }

    public void add(T element) {
        elements.addLast(element);
    }

    public Optional<T> remove() {
        if (elements.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(elements.removeFirst());
    }

    public <K> Buffer<K> transform(Function<T, K> function) {
        return new Buffer<>(new LinkedList<>(elements.stream().map(function).toList()));
    }
}
