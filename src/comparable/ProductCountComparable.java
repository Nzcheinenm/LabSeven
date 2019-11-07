package comparable;

import java.util.Comparator;

class ProductCountComparable implements Comparator<Product> {
        @Override
        public int compare(final Product o1, final Product o2) {
                return o1.getCount() - o2.getCount();
        }
}
