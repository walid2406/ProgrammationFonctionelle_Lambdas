package totorialstream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterExample {

    public static void main(String[] args) {
        List<Product> lessThan25Product=new ArrayList<Product>();
        lessThan25Product=getProducts().stream().filter((product)->product.getPrice()>40).collect(Collectors.toList());
        System.out.println(lessThan25Product);


    }
    private static List<Product> getProducts()
    {
        List<Product> productList=new ArrayList<Product>();
        productList.add(new Product(1,"hp",25));
        productList.add(new Product(2,"dell",30));
        productList.add(new Product(3,"lenovo",28));
        productList.add(new Product(4,"sony",28));
        productList.add(new Product(5,"apple",90));

        return productList;


    }

    static class Product{
        private int id;
        private String name;
        private float price;

        public Product(int id, String name, float price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }
    }
}
