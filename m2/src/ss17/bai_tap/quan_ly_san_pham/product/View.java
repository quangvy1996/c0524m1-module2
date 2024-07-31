package ss17.bai_tap.quan_ly_san_pham.product;

import java.util.List;
import java.util.Scanner;

public class View {
    private ProductRepository productRepository = new ProductRepository();

    public void display() {
        List<Product> productList = productRepository.displayProducts();
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void addProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID sản phẩm:");
        String id = sc.nextLine();
        System.out.println("Nhập tên sản phẩm:");
        String name = sc.nextLine();
        System.out.println("Nhập giá sản phẩm:");
        double price = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập hãng sản xuất");
        String manufacturer = sc.nextLine();
        System.out.println("Nhập mô tả");
        String description = sc.nextLine();

        Product newProduct = new Product(id, name, price, manufacturer, description);
        productRepository.addProduct(newProduct);
    }

    public void searchProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm cần tìm");
        String name = sc.nextLine();

        Product existingProduct = productRepository.searchProductByName(name);
        if (existingProduct != null) {
            System.out.println(existingProduct);
        } else {
            System.out.println("Không tìm thấy sản phẩm");
        }
    }

    public static void main(String[] args) {
        View view = new View();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Quản lý Sản phẩm: \n" +
                    "1. Hiển thị danh sách sản phẩm. \n" +
                    "2. Thêm mới sản phẩm. \n" +
                    "3. Tìm kiếm sản phẩm. \n" +
                    "4. Thoát. \n" +
                    "Xin chọn");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    view.display();
                    break;
                case 2:
                    view.addProduct();
                    break;
                case 3:
                    view.searchProduct();
                    break;
                case 4:
                    return;
            }
        }
        while (true);

    }
}
