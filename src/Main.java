import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DynamicArray<String> strings = new DynamicArray<>();

        System.out.println("Тест get():");
        strings.add("Один");
        strings.add("Два");
        strings.add("Три");
        for (int i = 0; i < strings.length(); i++) {
            System.out.println(i + 1 + ". get(" + i + ") = " + strings.get(i));
        }
        System.out.println("------------------------");

        System.out.println("Тест add(). Добавим строку 'Четыре':");
        strings.add("Четыре");
        for (int i = 0; i < strings.length(); i++) {
            System.out.println(i + 1 + ". get(" + i + ") = " + strings.get(i));
        }
        System.out.println("------------------------");

        System.out.println("Тест remove(2). Удалим строку 'Два':");
        strings.remove(1);
        for (int i = 0; i < strings.length(); i++) {
            System.out.println(i + 1 + ". get(" + i + ") = " + strings.get(i));
        }
        System.out.println("------------------------");

        System.out.println("Тест remove(3). Удалим строку 'Три':");
        strings.remove(1);
        for (int i = 0; i < strings.length(); i++) {
            System.out.println(i + 1 + ". get(" + i + ") = " + strings.get(i));
        }
        System.out.println("------------------------");

        System.out.println("Тест add(). Добавим строку 'Семь':");
        strings.add("Семь");
        for (int i = 0; i < strings.length(); i++) {
            System.out.println(i + 1 + ". get(" + i + ") = " + strings.get(i));
        }
        System.out.println("------------------------");

        System.out.println("Тест add(). Добавим строку 'Восемь':");
        strings.add("Восемь");
        for (int i = 0; i < strings.length(); i++) {
            System.out.println(i + 1 + ". get(" + i + ") = " + strings.get(i));
        }
        System.out.println("------------------------");

        System.out.println("Тест add(). Добавим строку 'Девять':");
        strings.add("Девять");
        for (int i = 0; i < strings.length(); i++) {
            System.out.println(i + 1 + ". get(" + i + ") = " + strings.get(i));
        }
        System.out.println("------------------------");

        System.out.println("Тест add(). Добавим строку 'Пять':");
        strings.add("Пять");
        for (int i = 0; i < strings.length(); i++) {
            System.out.println(i + 1 + ". get(" + i + ") = " + strings.get(i));
        }
        System.out.println("------------------------");

        System.out.println("Тест remove(5). Удалим строку 'Пять':");
        strings.remove(5);
        for (int i = 0; i < strings.length(); i++) {
            System.out.println(i + 1 + ". get(" + i + ") = " + strings.get(i));
        }
        System.out.println("------------------------");


        System.out.println("Тест add(). Добавим строку 'Шесть':");
        strings.add("Шесть");
        for (int i = 0; i < strings.length(); i++) {
            System.out.println(i + 1 + ". get(" + i + ") = " + strings.get(i));
        }
        System.out.println("------------------------");


        System.out.println("Тест выхода за индекс:");
        strings.get(10);
        //strings.remove(10);
        for (int i = 0; i < strings.length(); i++) {
            System.out.println(i + 1 + ". get(" + i + ") = " + strings.get(i));
        }
        System.out.println("------------------------");
    }

    public static class DynamicArray<T> {
        private int size;
        //        private int capacity = 1;
        private T[] array = (T[]) new Object[1];

        public void add(T el) {
            if (size == array.length) {
                array = Arrays.copyOf(array, array.length * 2);
            }
            array[size++] = el;
        }

        public void remove(int index) {
            final int newSize;
            if ((newSize = size - 1) > index) {
                System.arraycopy(array, index + 1, array, index, newSize - index);
                array[size = newSize] = null;
            } else {
                array[size = newSize] = null;
            }
        }

        public T get(int index) {
            if (index > array.length || index < 0 || array[index] == null) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return array[index];
        }

        public int length() {
            return array.length;
        }

        public int size() {
            return size;
        }
    }
}
