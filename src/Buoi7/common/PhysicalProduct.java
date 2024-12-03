package Buoi7.common;


import Buoi7.model.Product;

public class PhysicalProduct extends Product {
    // Constructor
    public PhysicalProduct(String id, String name, double price, int quantity) {
        super(id, name, price, quantity);
    }

    // Implement totalPrice method
    @Override
    public double totalPrice() {
        return getPrice() * getQuantity();
    }
}

