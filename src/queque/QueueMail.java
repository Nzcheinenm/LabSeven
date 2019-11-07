package queque;

import java.util.ArrayDeque;
import java.util.Deque;

public final class QueueMail {
        private QueueMail() {
        }

        /**
         * Создаем очереди и сортируем.
         * @param args -  0.
         */
        public static void main(final String[] args) {

                Deque<Integer> intQueue = new ArrayDeque<>();
                Deque<Integer> intDeque = new ArrayDeque<>();
                Deque<Integer> sumQueue = new ArrayDeque<>();

                intQueue.add(48);
                intQueue.add(19);
                intQueue.add(47);
                intQueue.add(73);
                intQueue.add(61);
                intQueue.add(20);
                intQueue.add(47);
                intQueue.add(19);
                intQueue.add(63);

                for (int pq : intQueue) { // добавляем "пенс."
                                        // в начало очереди и
                                       // удал. прежнее сост.
                        if (pq >= 60) {
                                intQueue.remove(pq);
                                intDeque.push(pq);
                        }
                }

                for (int pq : intDeque) { //помещаем в отд. оч.
                        sumQueue.push(pq); //чтоб перевернуть
                }

                for (int pq : sumQueue) { //пенс. в поряд. оч.
                        System.out.println(pq);
                }

                for (int pq : intQueue) { //остальная очередь
                        System.out.println(pq);
                }
        }

}
