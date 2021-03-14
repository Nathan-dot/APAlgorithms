package frq;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AArrayList<E> implements List<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private E[] data;
    private int size;

    public AArrayList() {
        data = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public int size() {
        // TODO
        return size;
    }

    @Override
    public boolean isEmpty() {
        // TODO
        if(size == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
        // TODO
        for(int i = 0; i < data.length; i++) {
            if(data[i] == o) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        // TODO
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        // TODO
        if (size >= data.length) {
            // we need a new array (50% increased size)
            E[] temp = (E[]) new Object[(int) (data.length * 1.5)];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            temp[size] = e;
            size++;
        } else {
            data[size] = e;
            size++;
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        // TODO
        for(int i = 0; i < data.length; i++) {
            if(data[i].equals(o)) {
                for(int j = i; j < data.length - 1; j++) {
                    data[j] = data[j+1];
                }
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        // TODO
        for(int i = 0; i < data.length; i++) {
            data[i] = null;
        }
        size = 0;
    }

    @Override
    public E get(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return data[index];
    }

    @Override
    public E set(int index, E element) {
        // TODO
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        E placeholder = data[index];
        data[index] = element;
        return placeholder;
    }

    @Override
    public void add(int index, E element) {
        // TODO
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if(size >= data.length) {
            E[] copy = (E[]) new Object[(int) (data.length * 1.5)];
            for(int i = 0; i < data.length; i++) {
                if(i == index) {
                    copy[i] = element;
                    copy[i+1] = data[i];
                    size += 2;
                    i++;
                }
                else {
                    copy[i] = data[i];
                    size++;
                }
            }
        }
    }

    @Override
    public E remove(int index) {
        // TODO
        if(index < 0 || index >= data.length) {
            throw new IndexOutOfBoundsException();
        }
        E placeholder = data[index];
        for(int i = index; i < data.length - 1; i++) {
            data[i] = data[i+1];
        }
        size--;
        return placeholder;
    }

    @Override
    public int indexOf(Object o) {
        // TODO

        for(int i = 0; i < data.length; i++) {
            if(data[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        // TODO
        for(int i = data.length - 1; i > 0; i--) {
            if(data[i].equals(o)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        // TODO
        return null;
    }

    @Override
    public String toString() {
        String result = "[";
        for(int i = 0; i < size - 1; i++) {
            result += data[i] + ", ";
        }
        result += data[size-1];
        result += "]";
        return result;
    }
}
