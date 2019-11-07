package comparable;

import java.util.Comparator;
import java.util.TreeSet;

public final class RunnerComparable {
        private RunnerComparable() {
        }

        /**
         * Класс, что создает прод. и сортирует.
         * @param args - 0.
         */
        public static void main(final String[] args) {
                Comparator<Product> comp = new ProductNameComparable()
                          .thenComparing(new ProductCountComparable());
                TreeSet<Product> prod = new TreeSet<>(comp);

                prod.add(new Product(19, "Ipad Air"));
                prod.add(new Product(2, "Xiaomi Mi9"));
                prod.add(new Product(1, "Apple TV"));
                prod.add(new Product(4, "Samsung s10"));
                prod.add(new Product(23, "Ipad Air 64g"));
                prod.add(new Product(3, "Ipad Air 64g"));

                for (Product p: prod) {
                        System.out.println(p.getName() + " " + p.getCount());
                }
        }
}
