package comparable;

class Product {
        private int count;
        private String name;

        Product(int c, String n) {
                this.count=c;
                this.name=n;
        }

        String getName() {
                return name;
        }

        int getCount() {
                return count;
        }
}
