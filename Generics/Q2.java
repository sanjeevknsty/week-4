import java.util.ArrayList;

class Product<T>{
    private T category;
    private String productName;
    private int productId;
    private double productPrice;
    private int productQuantity;

    public Product(String productName, int productId, double productPrice, int productQuantity, T category) {
        this.productName = productName;
        this.productId = productId;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.category = category;
    }

    public String getProductName() {
        return productName;
    }
    public double getProductPrice() {
        return productPrice;
    }
    public void setPrice(double price){
        this.productPrice = price;
    }
    public T getCategory() { return category; }

    @Override
    public String toString() {
        return String.format("%s (Category: %s, Price: $%.2f)", productName, category.getClass().getSimpleName(),productPrice);
    }

}

interface BookCategory {}
interface ClothingCategory {}

class StorageProduct {
    ArrayList<Product<?>> items = new ArrayList<>();
    public void addItem(Product<?> item){
        items.add(item);
    }
    public void showProducts(){
        for(Product<?> item : items){
//            System.out.println(item.toString());
            System.out.println(item.getProductName() + " ,Category: " +item.getCategory().getClass().getSimpleName() + " ,Price: " + item.getProductPrice());
            System.out.println("***(***)***");
        }
    }
}

class Discount{
    public static  <T extends Product<?>> void applyDiscount(T product, double discountPercentage){
        double discountPrice = product.getProductPrice() * (1 - discountPercentage);
        product.setPrice(discountPrice);
        System.out.println("Discounted Price for " + (product.getProductName()) + ": " + discountPrice);
    }
}

public class Q2 {
    public static void main(String[] args) {

        Product<BookCategory> book1 = new Product<>("Laila", 1, 100, 10, new BookCategory() {
        });
        Product<BookCategory> book2 = new Product<>("Maqbool", 2, 120, 10, new BookCategory() {
        });
        Product<ClothingCategory> cloth1 = new Product<>("VanHeusen", 111, 999, 34, new ClothingCategory() {
        });
        Product<ClothingCategory> cloth2 = new Product<>("gucci", 123, 1499, 29, new ClothingCategory() {
        });

        StorageProduct storage = new StorageProduct();
        storage.addItem(book1);
        storage.addItem(book2);
        storage.addItem(cloth1);
        Discount.applyDiscount(book1,0.1);
        Discount.applyDiscount(cloth1,0.1);

        storage.showProducts();

    }
}
