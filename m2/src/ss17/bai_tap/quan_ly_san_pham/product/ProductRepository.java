package ss17.bai_tap.quan_ly_san_pham.product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements Serializable {
    public static final String PATH = "src/ss17/bai_tap/quan_ly_san_pham/data/product1.dat";

    public List<Product> displayProducts() {
        List<Product> products = new ArrayList<>();
        File file = new File(PATH);

        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATH))) {
                products = (List<Product>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        return products;
    }

    public void addProduct(Product product) {
        List<Product> products = displayProducts();
        products.add(product);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATH))) {
            oos.writeObject(products);
            System.out.println("Sản phẩm đã được thêm vào");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Product searchProductByName(String productName) {
        List<Product> products = displayProducts();
        for (Product product : products) {
            if (product.getName().contains(productName)) {
                return product;
            }
        }
        return null;
    }

    public void deleteProduct(String id) {
        List<Product> products = displayProducts();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId().equals(id)) {
                products.remove(i);
            }
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATH))) {
            oos.writeObject(products);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public Product findProductById(String id) {
        List<Product> products = displayProducts();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId().equals(id)) {
                return products.get(i);
            }
        }
        return null;
    }
}
