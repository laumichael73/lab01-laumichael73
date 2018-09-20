public class Manager {
    private int size = 0;
    private Product[] products;


    public Manager() {
        products = new Product[10];
    }

    // n is the size of the Product array
    public Manager(int n) {
        products = new Product[n];
    }

    public void addProduct(Product p) {
        products[size] = p;
        size = size + 1;
    }

    public Product getProduct(int i) {
        return products[i];
    }

    public Product query(String name) {
        for (int i = 0; i < size; i++) {
            if (products[i].getName().equals(name)) {
                return products[i];
            }
        }
        System.err.println("Error: product not found");
        return null;
    }

    public int length() {
        return size;
    }
}