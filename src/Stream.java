
import java.util.*;
import java.util.stream.Collectors;

class Productf {
    int id;
    String name;
    float price;

    public Productf(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Productf{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class Stream {
    public static void main(String[] args) {
        ArrayList<Productf> productsList = new ArrayList<Productf>();
        //Adding Products
        productsList.add(new Productf(1, "HP Laptop", 25000f));
        productsList.add(new Productf(2, "Dell Laptop", 30000f));
        productsList.add(new Productf(3, "Lenevo Laptop", 28000f));
        productsList.add(new Productf(4, "Sony Laptop", 28000f));
        productsList.add(new Productf(5, "Apple Laptop", 90000f));
        productsList.add(new Productf(6, "Asus Laptop", 30000f));
        productsList.add(new Productf(7, "Rog Laptop", 70000f));
        // This is more compact approach for filtering data
       /* productsList.stream()
                .filter(product -> product.price == 30000) // filtering by product price.
                .forEach(x -> System.out.println(x)); // printing the products.*/

        List<Productf> result = productsList.stream().filter(product -> product.price==30000).collect(Collectors.toList());
        result.forEach(x -> System.out.println(x));

    }
}
