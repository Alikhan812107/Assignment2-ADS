import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList<T> implements MyList<T> {
    private T[] data;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        this.data = (T[]) new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public void add(T item) {
        ensureCapacity(size + 1);
        data[size++] = item;
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        return data[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayListIterator();
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > data.length) {
            int newCapacity = Math.max(data.length * 2, minCapacity);
            data = Arrays.copyOf(data, newCapacity);
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    // We'll implement the rest of the MyList methods in subsequent commits
    @Override
    public void set(int index, T item) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public void add(int index, T item) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public void addFirst(T item) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public void addLast(T item) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public T getFirst() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public T getLast() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public void remove(int index) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public void removeFirst() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public void removeLast() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public void sort() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public int indexOf(Object object) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public int lastIndexOf(Object object) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public boolean exists(Object object) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private class ArrayListIterator implements Iterator<T> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return data[currentIndex++];
        }
    }
}