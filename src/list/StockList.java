package list;

import java.util.Arrays;
import java.util.Iterator;

public class StockList<T> implements Iterable<T> {
        /**
         * Длина нач. массива.
         */
        private static final int LENGTH_ARR = 10;
        /**
         * Создание начального массива.
         */
        private Object[] array = new Object[LENGTH_ARR];
        /**
         * Начальное положение.
         */
        private int point = 0;
        /**
         * Длина массива.
         */
        private int lengthArr = array.length;

        final void add(final T item) {
                if (point == array.length - 1) {
                        reSize(array.length * 2);
                }
                array[point++] = item;
        }

        final T get(final int i) {
                return (T) array[i];
        }

        private void reSize(final int length) {
                Object[] newArray = new Object[length];
                System.arraycopy(array, 0, newArray, 0, point);
                array = newArray;
        }

        /**
         * Преобразование к типу.
         * @return - массив.
         */
        public final Object[] toArray() {
                return Arrays.copyOf(array, point);
        }

        @Override
        public final Iterator<T> iterator() {

                return new Iterator<T>() {
                        private int currentInd = 0;

                        @Override
                        public boolean hasNext() {
                                return currentInd < lengthArr
                                    && array[currentInd] != null;
                        }

                        @Override
                        public T next() {
                                return (T) array[currentInd++];
                        }
                };
        }
}
