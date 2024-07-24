package ss12.bai_tap.luyen_tap_su_dung;

import java.util.*;

public class ProductManager {
    private ArrayList<Product> productList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addProduct() {
        System.out.println("Nhập id sản phẩm");
        int id = scanner.nextInt();
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.next();
        System.out.println("Nhập giá sản phẩm");
        double price = scanner.nextDouble();
        Product product = new Product(id, name, price);
        productList.add(product);

    }

    public void editProduct() {
        System.out.println("Nhập id sản phẩm");
        int id = scanner.nextInt();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                System.out.println("Thông tin sản phẩm cần chỉnh sửa");
                System.out.println(productList.get(i));
                int choice;
                do {
                    System.out.println("Chọn thông tin cần chỉnh sửa: \n" +
                            "1. Tên: \n" +
                            "2. Giá: \n" +
                            "3. Kết thúc: \n");
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Cập nhật tên:");
                            String newName = scanner.nextLine();
                            productList.get(i).setName(newName);
                        case 2:
                            System.out.println("Cập nhật giá:");
                            double newPrice = scanner.nextDouble();
                            productList.get(i).setPrice(newPrice);
                    }
                } while (choice != 3);

            }

        }
    }

    public void deleteProduct() {
        System.out.println("Nhập id sản phẩm muốn xóa");
        int id = scanner.nextInt();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(i);
            }
        }
    }

    public void displayProduct() {
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i));
        }
    }

    public void searchProduct() {
        System.out.println("Nhập tên sản phẩm:");
        String productName = scanner.next();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().contains(productName)) {
                System.out.println(productList.get(i));
            }
        }
    }

    public void DisplayStudentFunctional() {
        int choice;
        do {
            System.out.println("Quản lý sản phẩm: \n" +
                    "1. Hiển thị sản phẩm. \n" +
                    "2. Thêm mới sản phẩm. \n" +
                    "3. Chỉnh sửa sản phẩm. \n" +
                    "4. Xóa sản phẩm \n" +
                    "5. Tim kiếm sản phẩm \n" +
                    "Xin chọn");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    displayProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    editProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    searchProduct();
                    break;

            }
        } while (true);
    }

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        productManager.DisplayStudentFunctional();
    }

}


