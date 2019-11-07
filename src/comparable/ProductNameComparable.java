package comparable;

import java.util.Comparator;

class ProductNameComparable implements Comparator<Product> {
        @Override
        public int compare(final Product o1, final Product o2) {
                return o1.getName().compareTo(o2.getName());
        }
}
