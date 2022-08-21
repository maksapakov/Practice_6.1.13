import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray<>();
/*
        int count = 0;
        while (count < 50) {
            System.out.println(array.length() + " length");
            array.add("One");
            System.out.println(array.get(count));
            System.out.println(array.size());
            count++;
        }
*/
        array.add("one");
        array.add("two");
        array.add("three");
        array.add("four");
        array.add("five");
        array.add("six");
        array.add("seven");
        array.add("eight");
        array.remove(1);
    }

    public static class DynamicArray<T> {
        private int index;
        private int size;
        private int capacity = 10;
        private T[] array;

        public DynamicArray() {
            this.array = (T[]) new Object[capacity];
        }


        public void add(T el) {
            if (size == array.length) {
                array = Arrays.copyOf(array, array.length + 1);
            }
            array[size] = el;
            size++;
            System.out.println(array[size-1]);
        }

        public void remove(int index) {
            this.index = index;
            T[] arrayWithoutRemoveIndex = (T[]) new Object[capacity - 1];
            for (int i = 0, j = 0; i < array.length; i++) {
                if (i != index) {
                    arrayWithoutRemoveIndex[j++] = array[i];
                    System.out.println(array[i]);
                }
            }
        }

        public T get(int index) {
            try {
                return array[index];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new ArrayIndexOutOfBoundsException(e.getMessage());
            } finally {
                return array[index];
            }
        }

        public int length() {
            return array.length;
        }

        public int size() {
            return size;
        }
    }
}
