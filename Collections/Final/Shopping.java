import java.util.*;

public class Shopping {
    private Map<String, Double> productPrices = new HashMap<>();
    private Map<String, Integer> cart = new LinkedHashMap<>();
    private TreeMap<Double, List<String>> priceMap = new TreeMap<>();
    public void addProduct(String name, double price) {
        productPrices.put(name, price);
        priceMap.putIfAbsent(price, new ArrayList<>());
        priceMap.get(price).add(name);
    }

    public void addToCart(String name, int quantity) {
        if (!productPrices.containsKey(name)) {
            System.out.println("Product not found: " + name);
            return;
        }
        cart.put(name, cart.getOrDefault(name, 0) + quantity);
        System.out.println(name + " " + quantity );
    }

    public void showCart() {
        System.out.println("Cart Items:");
        for (Map.Entry<String, Integer> i : cart.entrySet()) {
            System.out.println(i.getKey() + "  Qunty  " + i.getValue() + " Price" + productPrices.get(i.getKey()));
        }
    }

    public void sort() {
        System.out.println("\nsorted by price:");
        for (Map.Entry<Double, List<String>> i : priceMap.entrySet()) {
            double price = i.getKey();
            for (String name : i.getValue()) {
                System.out.println(name + " " + price);
            }
        }
    }

    public static void main(String[] args) {
        Shopping cart = new Shopping();

        cart.addProduct("Apple", 1000.2);
        cart.addProduct("Milk", 2009.5);
        cart.addProduct("Bread", 223.0);
        cart.addProduct("Eggs", 3021.0);

        cart.addToCart("Apple", 3);
        cart.addToCart("Milk", 1);
        cart.addToCart("Bread", 2);

        System.out.println();
        cart.showCart();

        System.out.println();
        cart.sort();
    }
}
