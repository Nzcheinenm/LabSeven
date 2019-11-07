package list;

public final class StockRunner {
        private StockRunner() {
        }

        /**
         * Создаем свой pack, и помещаем в него.
         * Далее - перебираем.
         * @param args - 0.
         */
        public static void main(final String[] args) {
                StockList<String> pack = new StockList<>();

                pack.add("Xiaomi mi9");
                pack.add("Samsung s10");
                pack.add("Microsoft Surface");
                pack.add("Microsoft Book");
                pack.add("Apple MacBook");

                for (String str : pack) {
                        System.out.println(str + " ");
                }


        }

}
