class Product {
    int prodId;
    double price;
    int quantity;
    static double totalPrice = 0;

    public Product(int prodId, double price, int quantity) {
        this.prodId = prodId;
        this.price = price;
        this.quantity = quantity;
        totalPrice += price * quantity;
    }

    public void display() {
        System.out.println(prodId + "\t" + price + "\t" + quantity);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Product p1 = new Product(1, 10, 1);
        Product p2 = new Product(2, 20, 2);
        Product p3 = new Product(3, 30, 3);
        Product p4 = new Product(4, 40, 4);
        Product p5 = new Product(5, 50, 5);

        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();

        System.out.println(Product.totalPrice);
    }
}
