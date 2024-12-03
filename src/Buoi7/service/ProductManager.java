package Buoi7.service;

import Buoi7.model.Product;
import Buoi7.model.Role;
import Buoi7.model.User;

import java.util.ArrayList;

public class ProductManager implements ImplementProductManager {
    private final ArrayList<Product> products = new ArrayList<>();

    @Override
    // Thêm sản phẩm mới
    public void addProduct(Product product, User user) {
        if (user.getRole() == Role.AMIN) {
            products.add(product);
            System.out.println("Sản phẩm đã được thêm thành công!");
        } else {
            System.out.println("Bạn không có quyền thêm sản phẩm.");
        }
    }
    @Override
    // Hiển thị danh sách sản phẩm
    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
        } else {
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }
    @Override
    // Tìm kiếm sản phẩm theo tên
    public void searchProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                System.out.println(product);

            }
        }
        System.out.println("Không tìm thấy sản phẩm nào.");
    }
    @Override
    // Xóa sản phẩm theo mã
    public void deleteProductById(String id, User user) {
        if (user.getRole() == Role.AMIN) {
            products.removeIf(product -> product.getId().equals(id));
            System.out.println("Sản phẩm đã được xóa.");
        } else {
            System.out.println("Bạn không có quyền xóa sản phẩm.");
        }
    }
    @Override
    // Cập nhật sản phẩm
    public void updateProductById(String id, User user, String newName, double newPrice, int newQuantity) {
        if (user.getRole() == Role.AMIN) {
            for (Product product : products) {
                if (product.getId().equals(id)) {
                    product.setName(newName);
                    product.setPrice(newPrice);
                    product.setQuantity(newQuantity);
                    System.out.println("Sản phẩm đã được cập nhật.");
                    return;
                }
            }
            System.out.println("Không tìm thấy sản phẩm.");
        } else {
            System.out.println("Bạn không có quyền cập nhật sản phẩm.");
        }
    }
}


