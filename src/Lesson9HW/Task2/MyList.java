package Lesson9HW.Task2;

import java.util.Arrays;

public class MyList <E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private final int currentCapacity = DEFAULT_CAPACITY;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
    }

    @SuppressWarnings("unchecked")
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for(int i = 0; i < size ;i++) {
            sb.append(elements[i].toString());
            if(i<size-1){
                sb.append(",");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public int size() {
        return size;
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
}
