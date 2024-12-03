package Buoi7.service;
import Buoi7.model.Product;
import Buoi7.model.User;

public interface ImplementProductManager {
        public void addProduct(Product product, User user);
        public void displayProducts() ;
        public void searchProductByName(String name);
        public void deleteProductById(String id, User user);
        public void updateProductById(String id, User user, String newName, double newPrice, int newQuantity);
}
